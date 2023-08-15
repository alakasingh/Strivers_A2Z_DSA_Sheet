Search Element in Rotated Sorted Array II
Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False. 

Pre-requisite: Search Element in Rotated Sorted Array I & Binary Search algorithm

Examples
Example 1:
Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
Result: True
Explanation: The element 3 is present in the array. So, the answer is True.

Example 2:
Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
Result: False
Explanation: The element 10 is not present in the array. So, the answer is False.

  code---------------------------------------------------------

  public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []arr, int key) {
        // Write your code here.
        int low=0;
        int n=arr.length;
        int high=n-1;
        boolean ans=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
               ans=true;
            }
            if(arr[low]==arr[mid] &&  arr[mid]==arr[high]){
               low++;
               high--;
               continue;
            }
            //Lets Identify the sorted left half
            if(arr[low]<=arr[mid]){
                if(arr[low]<=key && key<=arr[mid]){//just checking key is persent the left sorted half
                     high=mid-1;//if key is persent here then eliminate the right half
                }else{
                low=mid+1;//if not eliminate the left half
                }
            }else{//Lets identify the sorted right half
                 if(arr[mid]<=key && key<=arr[high]){//just checking key is persent the righ sorted half
                     low=mid+1;//if key is persent here then eliminate the left half
                }else{
                high=mid-1;//if not eliminate the left half
                }
            }

        }
           return ans;
    }
}
