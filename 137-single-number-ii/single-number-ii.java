class Solution {
    public int singleNumber(int[] nums) {
        int s =0;
        int t =0;
        for(int n: nums){
            s ^=(n & ~t);
            t ^=(n & ~s);
        }
        return s;
    }
}