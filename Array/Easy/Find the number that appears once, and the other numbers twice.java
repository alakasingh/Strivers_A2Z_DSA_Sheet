Find the number that appears once, and the other numbers twice
Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Examples
Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

  CODE STUDIO SOLUTION----------------------------------------------------------------------------------------------------------------------------------------------

  public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}

LEETCODE SOLUTION-----------------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
}
