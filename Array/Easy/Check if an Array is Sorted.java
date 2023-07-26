Check if an Array is Sorted
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Note: Two consecutive equal values are considered to be sorted.

Examples
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

CODE STUDIO SOLUTION--------------------------------------------------------------------------------------------------------------------
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        
        for(int i=1 ; i<n ; i++){
            if(a[i] >= a[i-1]){
                
            }else
             return 0;
        } 
        return 1;
    }
}

LEETCODE PROBLEM AND SOLUTION----------------------------------------------------------------------------------------------------------------

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.


SOLUTION---------------

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            
            if(nums[i] > nums[(i + 1) % n]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
