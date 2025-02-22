public class BinarySearch {

    public static void Sort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    public static int BinarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;

        for (int i = start; i <= end; i++) {
            int mid = (start + end) / 2;
            if (key == num[mid]) {
                return mid;
            }

            if (key > num[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 4, 8, 3, 9, 7};
        int key = 4;

        Sort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(BinarySearch(arr, key));
    }
}
