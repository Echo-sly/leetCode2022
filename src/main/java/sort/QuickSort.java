package sort;

import java.util.Arrays;

/**
 * Demo QuickSort
 * 快速排序！！！
 *
 * @author sunlianyu
 * @date 1月04日 22:12
 */
public class QuickSort {

    public static void quickSort(int[] arr, int beginIndex, int endIndex) {
        if(beginIndex > endIndex)
            return;
        if (endIndex > beginIndex) {
            int i = beginIndex;
            int j = endIndex;
            int baseNumber = arr[i];
            while (i != j) {
                while (arr[j] >= baseNumber && i < j) j--;
                while (arr[i] <= baseNumber && i < j) i++;
                if (j > i) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            arr[beginIndex] = arr[i];
            arr[i] = baseNumber;
            quickSort(arr, beginIndex, i - 1);
            quickSort(arr, i + 1, endIndex);
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{0, 5, 9, 1, 2, 3, 5, 16, 23, 48, 16, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
