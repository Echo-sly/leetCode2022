package Top100;

/**
 * Demo demo0209minSubArrayLen
 *209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * @author sunlianyu
 * @date 2022年1月10日 23:22
 */
public class demo0209minSubArrayLen {
    /**
     * 滑动窗口法！！！
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int numsLength = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for(;right<numsLength;right++){
            sum += nums[right];
            while(sum>=target){
                int subLength = right-left+1;
                res = Math.min(subLength,res);
                sum -= nums[left++];
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
