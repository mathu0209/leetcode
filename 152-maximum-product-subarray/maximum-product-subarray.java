class Solution {
    public int maxProduct(int[] nums) {
       int res = Integer.MIN_VALUE;
       for(int n : nums){
        res = Math.max(res, n);
       }
       int max =1, min =1;
       for(int n :nums){
       int temp = max*n;
       max = Math.max(temp, Math.max(min*n,n));
       min = Math.min(temp, Math.min(min*n,n));
       res = Math.max(res, max);
       }
       return res;
    }
}