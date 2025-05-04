// Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.
public class day4 {
    
    static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 

        if (d == 0) return;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        rotateLeft(arr, d);

       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

