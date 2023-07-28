Union of Two Sorted Arrays
Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

Examples
Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}

Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5} 

Example 2:
Input:
n = 10,m = 7.
arr1[] = {1,2,3,4,5,6,7,8,9,10}
arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12} 

CODE STUDIO CODE----------------------------------------------------------------------------------------------------------------------------------------------

  import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        HashSet <Integer> set=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();
           
           for (int i = 0; i < a.length; i++)
                 set.add(a[i]);
           for (int i = 0; i < b.length; i++)
                 set.add(b[i]);
           Union.addAll(set); // Instead of using a loop, use addAll method to add all elements from the set

        Collections.sort(Union); // Sort the Union list in ascending order

        return Union;
          
    }
}

