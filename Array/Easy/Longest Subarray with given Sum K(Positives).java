Longest Subarray with given Sum K(Positives)
Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

Examples
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
CODE STUDIO CODE-------------------------------------------------------------------------------------------------------------------------------------------------------
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
