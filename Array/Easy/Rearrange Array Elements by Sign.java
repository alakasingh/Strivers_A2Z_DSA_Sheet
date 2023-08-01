Rearrange Array Elements by Sign
Variety-1

Problem Statement:

There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

Note: Start the array with positive elements.

Examples: 

Example 1:

Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5

Explanation: 

Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

  CODE STUDIO SOLUTION-----------------------------------------------------------------------------------------------------------------------------------------

  public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n=a.length;
        int pos=0;
        int neg=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]<0){
                arr[neg]=a[i];
                neg +=2;
            }else{
                arr[pos]=a[i];
                pos +=2;
            }
        }
        return arr;
    }
}

LEETCODE SOLUTION-------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int postive=0;
        int negative=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
               ans[negative]=nums[i];
               negative +=2;
            }else{
               ans[postive]=nums[i];
               postive +=2;
            }
        } 
        return ans;
        
    }
}
