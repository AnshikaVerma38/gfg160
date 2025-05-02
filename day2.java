public class day2 {
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int idx = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }

       
        while (idx < n) {
            arr[idx++] = 0;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
