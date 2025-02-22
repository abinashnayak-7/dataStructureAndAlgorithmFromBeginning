public class LinearSear {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12};
        int key = 5;

        System.out.println("Key is at index : " + linearSearch(numbers, key));
    }
}