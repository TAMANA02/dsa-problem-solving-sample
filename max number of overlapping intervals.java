import java.util.*;

class Solution {
    public int overlapInt(int[][] intervals) {

        int n = intervals.length;
        if (n == 0) return 0;

        // Case 1: Only one value per row (points)
        if (intervals[0].length == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0;

            for (int i = 0; i < n; i++) {
                int val = intervals[i][0];
                map.put(val, map.getOrDefault(val, 0) + 1);
                max = Math.max(max, map.get(val));
            }
            return max;
        }

        // Case 2: Proper intervals
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int current = 0, max = 0;

        while (i < n && j < n) {
            if (start[i] <= end[j]) {   // GFG inclusive
                current++;
                max = Math.max(max, current);
                i++;
            } else {
                current--;
                j++;
            }
        }
        return max;
    }
}
