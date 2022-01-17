package carl;

import java.util.*;

/**
 * Demo demo0015threeSum
 *
 * @author sunlianyu
 * @date 2022年1月17日 19:44
 */
public class demo0015threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> lists = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] == 0) {
                    lists.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(lists);
        return list;
    }
}
