class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] d = new int[n];
        Arrays.fill(d,1);
        int m =1;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    d[i] = Math.max(d[i],d[j]+1);
                }
            }
        }
        for(int i=0; i<n; i++){
            if(m < d[i]){
                m = d[i];
            }
        }
        return m;
    }
}