public class day3 {
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i<= j) {
            // Swap arr[left] and arr[right]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //hello
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
