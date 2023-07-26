Remove Duplicates in-place from Sorted Array
Problem Statement: Given an integer array sorted in non-decreasing order,
  remove the duplicates in place such that each unique element appears only once.
  The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
  It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Examples
Example 1: 

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2: 

Input: arr[1,1,1,2,2,3,3,3,3,4,4]

Output: arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

  CODE STUDIO SOLUTION----------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int count=0;
		for(int i=0; i<n-1 ; i++){
			if(){
				continue;
			}
			arr[count] = nums[i];
			count++;
			
		}

		 arr[count] = nums[n - 1];
        count++;


		int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = arr[i];
        }

        return result;
	}
}

LEETCODE PROBLEM AND SOLUTION--------------------------------------------------------------------------------------------------------------------------
 Given an integer array nums sorted in non-decreasing order, 
  remove the duplicates in-place such that each unique element appears only once. 
  The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
  The remaining elements of nums are not important as well as the size of nums.

Return k.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array

int[] expectedNums = [...]; // The expected answer with correct length



int k = removeDuplicates(nums); // Calls your implementation



assert k == expectedNums.length;

for (int i = 0; i < k; i++) {

    assert nums[i] == expectedNums[i];

}


  
  SOLUTION------------------
  class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            
            nums[count]=nums[i];
            count++;
        }

       if(n>0){
           nums[count]=nums[n-1];
            count++;
       }  return count;
        
        
    
    }
}
