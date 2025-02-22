public class KadanesSumOfMaxSubArray {
    public static void kadanes(int arr[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += arr[i];

            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sum of Sub Array is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -5, 0, -6, 4, -3, 2};

        kadanes(arr);
    }
}
