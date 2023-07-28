Find the missing number in an array
Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Examples
Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.

  LEETCODE SOLUTION---------------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    public int missingNumber(int[] nums) {

        int n=nums.length;
        int sum1=(n*(n+1))/2;
         int sum2=0;
        for(int i=0;i<n;i++){
            
            sum2=sum2+nums[i];
            
        }

        return sum1-sum2;
        
    }
}
