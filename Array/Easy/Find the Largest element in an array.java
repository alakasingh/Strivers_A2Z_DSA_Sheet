Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. 

CODE STUDIO:::::::::::::::::::::::::::::::::::::

import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            return max;
    }
}
