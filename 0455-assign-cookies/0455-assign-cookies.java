class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = g.length;
        int cookie = s.length;
        int childcount = 0;
        int cookiecount = 0;
        int happyChild = 0;
        while (childcount < child && cookiecount < cookie) {
            if (s[cookiecount] >= g[childcount]) {
                happyChild++;
                childcount++;
                cookiecount++;
            } else {
                cookiecount++;
            }
        }
        return happyChild;
    }
}