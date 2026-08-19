class Solution {
    public int missingNumber(int[] nums) {
        int res =nums.length;
        int exp = res*(res+1)/2;
        int actual =0;
        for(int num: nums){
            actual+=num;
        }
        return exp -actual;
    }
}