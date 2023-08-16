Nth Root of a Number using Binary Search
Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the ‘nth root is not an integer, return -1.

Examples
Example 1:
Input Format: N = 3, M = 27
Result: 3
Explanation: The cube root of 27 is equal to 3.

Example 2:
Input Format: N = 4, M = 69
Result: -1
Explanation: The 4th root of 69 does not exist. So, the answer is -1.

  code-------------------------------------------------------------------------------------------------------------------------------

  public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=0;
        int high=m-1;
        
        while(low<=high){//loop will be execute until low less than high
            int mid=(low+high)/2;//calculate the mid value for compare
            if(Math.pow(mid, n)==m){//check condition nth root of mid is equal to our target(m) value 
                return mid;//if yes then return mid
            }else if(Math.pow(mid, n)<m){//check condition nth root of mid is less our target(m) value 
                low=mid+1;//if yes then eliminate the left half
            }
            else{//if above both are condition not setisfide
                high=mid-1;//then eliminate the right half
            }
        }return -1;//if nth root of m not satisfide
    }
}

