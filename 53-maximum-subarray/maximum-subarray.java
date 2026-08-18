class Solution {
    public int maxSubArray(int[] nums) {
        // int sum =nums[0];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=1; j<nums.length; j++){
        //         if(nums[i] !=nums[j]){
        //             nums[i] += sum;
        //         }
        //     }
        // }
        // return sum;

        int sum = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            max =Math.max(max, sum);
        }
        return max;
    }
}