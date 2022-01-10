package Top100;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo demo0875findDisappearedNumbers
 *
 * @author sunlianyu
 * @date 1月08日 12:05
 */
public class demo0875findDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
