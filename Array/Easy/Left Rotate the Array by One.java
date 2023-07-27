Left Rotate the Array by One
Problem Statement: Given an array of N integers, left rotate the array by one place.

Examples
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.


Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so 
the element at first index will be shifted to 
last index which is also by the way the first index.

  --------------------------------------------------------------------------------------------------------------------------
  CODE STUDIO SOLUTION

  import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;

    }
}
---------------------------------------------------------------------------------------------------------------------------------------
  PROBLEM LINK - https://leetcode.com/problems/rotate-array/
  LEETCODE SOLUTION
  

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
