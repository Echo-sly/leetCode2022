package carl;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Demo demo0349intersection
 *
 * @author sunlianyu
 * @date 2022年1月17日 16:40
 */
public class demo0349intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).distinct().filter(set::contains).toArray();
    }
}
