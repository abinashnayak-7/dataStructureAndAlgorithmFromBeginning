public class ReverseArray {
    public static void Reverse(int num[]) {
        int start = 0, end = num.length - 1;
        for (int i = start; i < end; i++) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 1, 9};
        Reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
