package sort;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo MyLRUCache
 *
 * @author sunlianyu
 * @date 1月08日 16:03
 */
public class MyLRUCache {

    private Map<Integer, DlinkedNode> cache = new HashMap<>();
    private int capacity;
    private int size;
    private DlinkedNode head;
    private DlinkedNode tail;

    public MyLRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DlinkedNode();
        tail = new DlinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public void put(int key, int value) {
        DlinkedNode node = cache.get(key);
        if (node == null) {
            // 如果 key 不存在，创建一个新的节点
            DlinkedNode newNode = new DlinkedNode(key, value);
            // 添加进哈希表
            cache.put(key, newNode);
            // 添加至双向链表的头部
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                // 如果超出容量，删除双向链表的尾部节点
                DlinkedNode tail = removeTail();
                // 删除哈希表中对应的项
                cache.remove(tail.key);
                --size;
            }
        } else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.value = value;
            moveToHead(node);
        }
    }
    public int get(int key) {
        DlinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到头部
        moveToHead(node);
        return node.value;
    }

    private void removeNode(DlinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DlinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(DlinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DlinkedNode removeTail() {
        DlinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }

    class DlinkedNode {
        int key;
        int value;
        DlinkedNode prev;
        DlinkedNode next;

        public DlinkedNode() {
        }

        public DlinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


}
