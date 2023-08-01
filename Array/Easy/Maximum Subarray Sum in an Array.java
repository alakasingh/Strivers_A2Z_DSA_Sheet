Kadane’s Algorithm : Maximum Subarray Sum in an Array
Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.

Examples
Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output: 6 

Explanation: [4,-1,2,1] has the largest sum = 6. 

  CODE STUDIO SOLUTION--------------------------------------------------------------------------------------------------------------------------------------

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

           
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    
    }
}
