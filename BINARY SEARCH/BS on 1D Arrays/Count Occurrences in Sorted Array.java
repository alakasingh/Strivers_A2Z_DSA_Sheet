Count Occurrences in Sorted Array
  Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

Examples
Example 1:
Input: N = 7,  X = 3 , array[] = {2, 2 , 3 , 3 , 3 , 3 , 4}
Output: 4
Explanation: 3 is occurring 4 times in 
the given array so it is our answer.

Example 2:
Input: N = 8,  X = 2 , array[] = {1, 1, 2, 2, 2, 2, 2, 3}
Output: 5
Explanation: 2 is occurring 5 times in the given array so it is our answer.

  code----------------------------------------------------

public class Solution {
     public static int firstOccurance(int arr[], int n, int k){
         int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
     }
     public static int lastOccurance(int arr[], int n, int k){
         int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
     }
     public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = firstOccurance(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurance(arr, n, k);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        //Your code goes here
         int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);

    }
}
