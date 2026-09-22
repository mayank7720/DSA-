class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int i = 0; i < piles.length; i++)
            high = Math.max(high, piles[i]);

        while (low < high) {
            int k = (low + high) / 2;
            int hours = 0;

            for (int i = 0; i < piles.length; i++)
                hours += (piles[i] + k - 1) / k;

            if (hours <= h)
                high = k;
            else
                low = k + 1;
        }

        return low;
    }
}