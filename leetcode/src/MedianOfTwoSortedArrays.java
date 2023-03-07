package src;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedList = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0,mergedList, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedList, nums1.length, nums2.length);
        Arrays.sort(mergedList);
        int midMergedList = mergedList.length / 2;
        if(mergedList.length % 2 == 0)
            return ((double) mergedList[midMergedList] + (double) mergedList[midMergedList - 1]) / 2;
        else
            return mergedList[midMergedList];
    }
}
