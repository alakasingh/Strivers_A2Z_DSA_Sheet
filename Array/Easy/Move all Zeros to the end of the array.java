Move all Zeros to the end of the array
In this article we will learn how to solve the most asked coding interview problem: “Move all Zeros to the end of the array”

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Examples
Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

--------------------------------------------------------------------------------------------------------------------------------------------------------

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        
        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
            if(j==-1){
                return a;
            }

        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
            
        }return a;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------

LEETCODE PROBLEM AND SOLUTION

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

-------------------------------CODE
  class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        

           if(j==-1){
               return;
           }

        for(int i = j+1 ; i<n ;i++){
            if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            }
        } 

        
    }
}
