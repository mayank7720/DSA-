class Solution {
    public int[] intersection(int[] a, int[] b) {
        java.util.HashSet<Integer>s=new java.util.HashSet<>();
        for(int x:a) s.add(x);
        java.util.HashSet<Integer>r=new java.util.HashSet<>();
        for(int x:b) if(s.contains(x)) r.add(x);
        return r.stream().mapToInt(i->i).toArray();
    }
}