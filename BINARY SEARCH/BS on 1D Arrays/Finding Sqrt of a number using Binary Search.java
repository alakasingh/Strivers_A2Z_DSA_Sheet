Finding Sqrt of a number using Binary Search
Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of ‘sqrt(n)’.

Note: The question explicitly states that if the given number, n, is not a perfect square, our objective is to find the maximum number, x, such that x squared is less than or equal to n (x*x <= n). In other words, we need to determine the floor value of the square root of n.

Examples
Example 1:
Input Format: n = 36
Result: 6
Explanation: 6 is the square root of 36.

Example 2:
Input Format: n = 28
Result: 5
Explanation: Square root of 28 is approximately 5.292. So, the floor value will be 5.

CODE-------------------------------------------------------------------------------------------------------------------------------------------
import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 long low=0;
		 long high=N-1;
		 long ans=0;//CREATE A ans VARIABLE TO STORE THE ANSWER

		 while(low<=high){//RUNING WHILE LOO UNTIL LOW LESS THAN EQUAL TO HIGH

			 long mid=(low+high)/2;//FIND THE MID VALUE

			 if(mid*mid<=N){//CHECK CONDITION - SQUARE OF MID IS LESS THAN EQUAL TO N

				 ans=mid;//MAY BE THIS MID BE MY ANSWER

				 low=mid+1;//ELIMINATE THE LEFT HALF

			 }
			 else high=mid-1;//IF if CONDITION NOT SATICFIDE THEN ELIMINATE THE RIGHT HALF

		 }
		 return (int)ans;//NOW RETURN THE ANSWER
	}
}

