import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int max = Math.max(arr[n - 1] - k, arr[i] + k);
            int min = Math.min(arr[0] + k, arr[i + 1] - k);

            if (min < 0) continue;

            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}

public class day9 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println("Minimum difference (Example 1): " + sol.getMinDiff(arr1, k1)); // Output: 5

        int[] arr2 = {3, 9, 12, 16, 20};
        int k2 = 3;
        System.out.println("Minimum difference (Example 2): " + sol.getMinDiff(arr2, k2)); // Output: 11
    }
}
