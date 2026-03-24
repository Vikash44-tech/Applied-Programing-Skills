import java.util.*;

class Solution {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = potions.length;
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int l = 0, r = n - 1;
            int idx = n;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if ((long) spells[i] * potions[mid] >= success) {
                    idx = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            result[i] = n - idx;
        }

        return result;
    }
}