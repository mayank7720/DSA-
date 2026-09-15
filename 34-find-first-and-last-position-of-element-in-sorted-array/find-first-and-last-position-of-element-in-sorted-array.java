class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int[] arr = {-1,-1};
        arr[0] = firstOccur(nums,target);
        arr[1] = lastOccur(nums,target);
        return arr;
    }


        private int firstOccur(int[] num , int target){
            int l = 0, r = num.length - 1, first = -1;
            while(l <= r){
                int mid = l + (r-l)/2;

                if(num[mid] == target){
                    first = mid;
                    r = mid - 1;
                }
                else if(num[mid] > target){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }

            }
            return first;

        }

        private int lastOccur(int[] num , int target){
            int l = 0, r = num.length - 1,last = -1;
            while(l <= r){
                int mid = l + (r-l)/2;

                if(num[mid] == target){
                    last = mid;
                    l = mid + 1;
                }
                else if(num[mid] > target){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }

            }
            return last;

        }
}
