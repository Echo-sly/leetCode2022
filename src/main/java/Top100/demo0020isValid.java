package Top100;

import java.util.*;

/**
 * Demo demo0020isValid
 * 这道题的官方样例水了！😒
 * 不正确的顺序也可以过！！
 * 自己写了个正确版的
 *
 * @author sunlianyu
 * @date 1月02日 22:23
 */
public class demo0020isValid {
    /**
     * 取巧解法 直接用字符串匹配
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.length() == 0;
    }

    /**
     * 官方解法
     *
     * @param s
     * @return
     */
    public static boolean isValid1(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                else {
                    stack.pop();
                }
            } else {
                //加上了控制顺序的条件
                if (!stack.isEmpty() &&
                        ((stack.peek().equals('(') && ch == '[')
                                || (stack.peek().equals('(') && ch == '{')
                                || (stack.peek().equals('[') && ch == '{'))) {
                    return false;
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.nextLine();
            System.out.println(isValid1(str));
        }
    }
}
