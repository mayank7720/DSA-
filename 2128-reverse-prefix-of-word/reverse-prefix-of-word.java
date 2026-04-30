class Solution {
    public String reversePrefix(String w, char ch) {
        int i=w.indexOf(ch);
        return i<0?w:new StringBuilder(w.substring(0,i+1)).reverse()+w.substring(i+1);
    }
}