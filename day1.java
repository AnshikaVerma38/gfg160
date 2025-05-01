// Question : Second largest element
// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

class Solution {
    public static int getSecondLargest(int[] arr) {
        int first = -1;
        int second = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 10, 33, 11};
        System.out.println(getSecondLargest(arr)); 
    }
}
