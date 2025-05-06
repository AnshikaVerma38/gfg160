import java.util.*;

public class day6 {
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > n / 3) {
                result.add(key);
            }
        }
        

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 1};
        System.out.println(majorityElement(arr));
    }}
