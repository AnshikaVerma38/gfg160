// Maximum Product Subarray
// Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

public class day11 {
    public static int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        int maxSoFar = arr[0];
        int minSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap maxSoFar and minSoFar
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(arr[i], maxSoFar * arr[i]);
            minSoFar = Math.min(arr[i], minSoFar * arr[i]);

            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray = " + maxProduct(arr));
    }
}
