package array;

/**
 * Description: https://leetcode.com/problems/subarray-product-less-than-k
 * Difficulty: Medium
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0;
        int product = 1;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}