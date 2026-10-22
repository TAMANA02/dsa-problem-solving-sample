
import java.util.HashMap;
import java.util.Arrays;

public class twosum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n = 0; n < arr.length; n++) {
            int current = arr[n];
            int needed = target - current;

            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), n };
            }

            map.put(current, n);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}
