Merge Sort 

  code---------------------------------

  public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if (l < r) {
            
            int m = (l + r) / 2;

            
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }

    }
    public static void merge(int[] arr, int l, int m, int r) {
        
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
         while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements of leftArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
