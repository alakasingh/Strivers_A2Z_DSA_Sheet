Floor and Ceil in Sorted Array
  Problem Statement: You’re given an unsorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
The floor of x is the largest element in the array which is smaller than or equal to x.
The ceiling of x is the smallest element in the array greater than or equal to x.

Pre-requisite: Lower Bound & Binary Search

Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
  CODE---------------------------------------------------------------------------------------------------

  import java.util.* ;
import java.io.*; 
public class Solution {
    public static int getCeil(int n,int x,int[] arr){

        int low = 0;

        int high = n-1;

        int ceiling=-1;

        while(low<=high){

            int mid = low + (high - low)/2;

 

            //if element present in array,it will be floor and ceil

           

            //we are looking for element LARGER than x

             if(arr[mid]>=x){

                high=mid-1;

                ceiling=arr[mid];

            }else{

                low=mid+1;

            }

        }

        return ceiling;

    }

    public static int getFloor(int n,int x,int[] arr){

        int low = 0;

        int high = n-1;

        int floor=-1;

        while(low<=high){

           int mid = low + (high - low)/2;

 

           //if element present in array,it will be floor and ceil

          
           //we are looking for element SMALLER than x

            if(arr[mid]<=x){

                low=mid+1;

                floor=arr[mid];

            }else{

                high=mid-1;

            }

        }

        return floor;

    }
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);

        int ceil = getCeil(n,x,arr);

        int floor = getFloor(n,x,arr);

        System.out.print(floor+" ");

        return ceil;
    }
}
