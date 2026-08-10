class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int curnCount = 0;
        for (int i : nums){
            if(i == 1){
                curnCount++;
            }
            else{
                maxCount = Math.max(maxCount,curnCount);
                curnCount = 0;
            }
            
            }
            return maxCount > curnCount ? maxCount : curnCount;
        }
    }
