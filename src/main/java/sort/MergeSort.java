package sort;

import java.util.Arrays;

/**
 * Demo mergeSort
 *
 * @author sunlianyu
 * @date 1月05日 16:04
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int beginIndex, int endIndex) {
        if (endIndex == beginIndex) return;
        int mid = beginIndex + (endIndex - beginIndex) / 2;
        mergeSort(arr, beginIndex, mid);
        mergeSort(arr, mid + 1, endIndex);
        merge(arr, beginIndex, mid, endIndex);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right)
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        while (p1 <= mid )
            help[i++] = arr[p1++];
        while (p2 <= right)
            help[i++] = arr[p2++];
        for (int j = 0; j < help.length; j++) {
            arr[left+j] = help[j];
        }

    }
//
//
//    public static void mergeSort(int[] arr, int beginIndex, int endIndex) {
//        if (beginIndex == endIndex) return;
//        int mid = beginIndex + (endIndex - beginIndex) / 2;
//        mergeSort(arr, beginIndex, mid);
//        mergeSort(arr, mid + 1, endIndex);
//        merge(arr, beginIndex, mid, endIndex);
//    }
//
//    public static void merge(int[] arr, int left, int mid, int right) {
//        int[] help = new int[right - left + 1];
//        int i = 0;
//        int p1 = left;
//        int p2 = mid+1;
//        while (p1 <= mid && p2 <= right)
//            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
//        while (p1 <= mid)
//            help[i++] = arr[p1++];
//        while (p2 <= right)
//            help[i++] = arr[p2++];
//        for (i = 0; i < help.length; i++) {
//            arr[left + i] = help[i];
//        }
//
//    }


    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 9, 1, 2, 3, 5, 16, 23, 48, 16, 1};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
