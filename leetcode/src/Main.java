package src;

import static src.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;
import static src.MedianOfTwoSortedArrays.findMedianSortedArrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}