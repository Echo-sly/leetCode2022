package Top100;

/**
 * Demo demo0027removeElement
 *
 * @author sunlianyu
 * @date 2022年1月10日 23:05
 */
public class demo0027removeElement {
    public int removeElement(int[] nums, int val) {

        int slow = 0;
        int fast = 0;
        int numLength = nums.length;
        for(;fast<numLength;fast++){
            if(val!=nums[fast])
                nums[slow++] = nums[fast];
        }
        return slow;
    }
}
