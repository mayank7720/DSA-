class Solution {
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
        int x = Math.max(x1, Math.min(xc, x2));
        int y = Math.max(y1, Math.min(yc, y2));

        return (xc-x)*(xc-x) + (yc-y)*(yc-y) <= r*r;
    }
}