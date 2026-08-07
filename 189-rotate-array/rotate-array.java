class Solution {
    public void rotate(int[] a, int k) {
        k%=a.length;
        rev(a,0,a.length-1);
        rev(a,0,k-1);
        rev(a,k,a.length-1);
    }
    void rev(int[] a,int l,int r){
        while(l<r){
            int t=a[l]; a[l++]=a[r]; a[r--]=t;
        }
    }
}