class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gs=0;
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(gs<g.length&&c<s.length){
            if(g[gs]<=s[c]){
                gs++;
            }
            c++;
        }
        return gs;
    }
}