class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookie = s.length;
        if(cookie == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int max =0;
        int cookieind = cookie -1;
        int child = g.length - 1;
        while(cookieind >=0 && child >=0){
            if(s[cookieind] >= g[child]){
                max++;
                cookieind--;
                child--;
            }
            else{
                child--;
            }
        }
       return max; 
    }
}