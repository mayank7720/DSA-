class Solution {
    public int singleNumber(int[] n) {
       
        for(int i = 0 ; i < n.length ; i++){
             int c = 0;
            for(int j = 0 ; j < n.length ; j++){
                if(n[i] == n[j]){
                    c++;
                }
               
            }
             if(c == 1){
                        return n[i];
                    }
        }
        return -1;
    }
}