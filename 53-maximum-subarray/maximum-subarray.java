class Solution {
    public int maxSubArray(int[] a) {
        int sum=a[0], max=a[0];
        for(int i=1;i<a.length;i++){
            sum=Math.max(a[i],sum+a[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}