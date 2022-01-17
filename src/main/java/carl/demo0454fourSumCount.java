package carl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Demo demo0454fourSumCount
 *
 * @author sunlianyu
 * @date 2022年1月17日 18:30
 */
public class demo0454fourSumCount {


    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                aMap.put(a + b, aMap.getOrDefault(a + b, 0) + 1);
            }
        }
        int res = 0;
        for (int a : nums3) {
            for (int b : nums4) {
                if (aMap.containsKey(-a - b)) {
                    res += aMap.get(-a - b);
                }
            }
        }
        return res;
    }
}
