
Rotate array by K elements

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.
  --------------------------------------------------------------------------------------------------------------------------------------------

  CODE STUDIO SOLUTION

  import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();

        }

        int k = scn.nextInt();

        k = k % n;

 

        // lets create new array 

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {

            temp[i] = arr[i];

        }

        // now shifting the middle elements

        for (int i = 0; i < n - k; i++) {

            arr[i] = arr[i + k];

        }

        // hence now we shifted them and now just need to add the previous stored elements at the end.

        for (int j = 0; j < temp.length; j++) {

            arr[n - k + j] = temp[j];

        }

 

        // Print the rotated array

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    
		
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------
  LEETCODE PROBLEM AND SOLUTION

  Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

---------------------CODE

  class Solution {
    public void rotate(int[] arr1, int k) {
        int n = arr1.length;
        int[] arr2 = new int[n];

     k=k%n;

        // Copy the last k elements to arr2 starting from index 0
        for (int i = n - k, j = 0; i < n; i++, j++) {
            arr2[j] = arr1[i];
        }

        // Copy the remaining elements (excluding the last k elements) to arr2
        for (int i = 0, j = k; i < n - k; i++, j++) {
            arr2[j] = arr1[i];
        }

        // Copy the elements back to arr1 to update the original array
        for (int i = 0; i < n; i++) {
            arr1[i] = arr2[i];
        }
    }
}
