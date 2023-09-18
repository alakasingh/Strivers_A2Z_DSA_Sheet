Recursive Insertion sort

  code--------------------------------------

  /*
    Time Complexity: O( N ^ 2 )
    Space Complexity: O( 1 )

    Where 'N' is the size of the array 'arr'.
*/
public class Solution {
    public static void insertionSort(int []arr, int n) {
        // Call recursive function.
        insertionSortHelper(arr, 0, n);
    }
    public static void insertionSortHelper(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n) {
            return;
        }

        int j = i;

        while (j > 0 && arr[j - 1] > arr[j]) {

            // Swap 'arr[j]' and 'arr[j-1]', and decrement 'j'.
            swap(arr, j, j - 1);
            j--;
        }

        // Call recursive function for the next element.
        insertionSortHelper(arr, i + 1, n);
    }
    public static void swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
