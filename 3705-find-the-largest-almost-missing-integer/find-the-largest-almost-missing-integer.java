class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length, ans = -1;

        if (k == 1) {
            for (int x : nums) {
                int count = 0;
                for (int y : nums)
                    if (x == y) count++;

                if (count == 1)
                    ans = Math.max(ans, x);
            }
            return ans;
        }

        if (k == n) {
            for (int x : nums)
                ans = Math.max(ans, x);
            return ans;
        }

        for (int x : new int[]{nums[0], nums[n - 1]}) {
            int count = 0;
            for (int y : nums)
                if (x == y) count++;

            if (count == 1)
                ans = Math.max(ans, x);
        }

        return ans;
    }
}