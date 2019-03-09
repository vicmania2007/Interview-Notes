package Searching;

/**
 * 
 * Q- https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/801/
 * 
 * Tags - Binary Search
 * @author vignesh
 *
 */
public class FindPeakElement {
	public int findPeakElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return 0;
        }

        int left = 0, right = N - 1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (left == N - 1 || nums[left] > nums[left + 1]) ? left : right;
    }
}
