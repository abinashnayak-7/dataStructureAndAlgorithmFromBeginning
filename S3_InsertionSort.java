//Telusko

public class S3_InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];   // Shifting
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, -6, 1, -5, 3, 4, 0};

        insertionSort(arr); // Calling

        for (int i = 0; i < arr.length; i++) {     // Printing
            System.out.print(arr[i] + " ");
        }
    }
}
