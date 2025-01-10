/**
 * Question:Given an array arr[] containing only non-negative integers, your task is
 * to find a continuous subarray (a contiguous sequence of elements) whose sum equals
 * a specified value target. You need to return the 1-based indices of the leftmost
 * and rightmost elements of this subarray. You need to find the first subarray whose
 * sum is equal to the target.
 *
 * Note: If no such array is possible then, return [-1]
 */

import java.util.*;
public class IndexOfSubArraySum {


   //  sliding window technique
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink the window until the sum is <= target
            while (sum > target && start <= end) {
                sum -= arr[start++];
            }

            // If the target sum is found
            if (sum == target) {
                ans.add(start + 1);  // Convert to 1-based index
                ans.add(end + 1);
                return ans;
            }
        }

        // If no subarray is found
        ans.add(-1);
        return ans;
    }

    // Prefix sum technique
    static ArrayList<Integer> subarraySum1(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;

        // To handle the case where the subarray starts at index 0
        prefixSumMap.put(0, 0);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Check if a subarray with the target sum exists
            if (prefixSumMap.containsKey(prefixSum - target)) {
                int start = prefixSumMap.get(prefixSum - target);
                result.add(start + 1);  // Convert to 1-based index
                result.add(i + 1);      // Current index in 1-based
                return result;
            }

            // Store the current prefix sum with its index (1-based index)
            prefixSumMap.put(prefixSum, i + 1);
        }

        // If no such subarray exists, return -1
        result.add(-1);
        return result;
    }

}

/**
 * sample input and output:
 *
 * arr = [1, 2, 3, 7, 5]
 * target = 12
 *
 * output:[2 4]   ->1 based index
 */
