Implement Lower Bound
Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

Pre-requisite: Binary Search algorithm

Examples
Example 1:
Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 1
Explanation: Index 1 is the smallest index such that arr[1] >= x.

Example 2:
Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
Result: 3
Explanation: Index 3 is the smallest index such that arr[3] >= x.

code----------------------------------------------------------------------
public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int min=0;
        int max=n-1;
        int ans=n;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(arr[mid]>=x){
                ans=mid;
                max=mid-1;

            }else
            min=mid+1;
        }
        return ans;
    }
}
