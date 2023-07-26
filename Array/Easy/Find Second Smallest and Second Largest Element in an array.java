Find Second Smallest and Second Largest Element in an array
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples
Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

  CODE STUDIO PROBLEM SOLUTION::::::::::::::::::::::::::::::::::::

  public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        
         int largest=a[0];
         int secLargest=Integer.MIN_VALUE;

         for(int i=1 ; i<n ; i++){
             if(largest<a[i]){
                 
                 secLargest=largest;
                 largest=a[i];
             }else if(largest>a[i] && a[i]>secLargest){
                 secLargest=a[i];
             }
             
         }
        int smallest=a[0];
        int secSmallest=Integer.MAX_VALUE;
         for(int i=1 ; i<n ; i++){
             if(smallest > a[i]){
                 
                 secSmallest=smallest;
                 smallest=a[i];
             }else if(smallest !=a[i] && secSmallest > a[i]){
                 secSmallest=a[i];
             }
             
         }
       int[] result = { secLargest, secSmallest };
        return result;  
    }
}
