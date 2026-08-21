class Solution {
    public int maxDepth(String s) {
      int c = 0;
      int depth = 0;
      for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        if(ch == '('){
            c++;
            depth = Math.max(depth,c);
        }
        else if(ch ==')'){
            c--;
        }
       
    }
     return depth;
}
}