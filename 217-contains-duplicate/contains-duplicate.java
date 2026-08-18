class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0; i<=nums.length; i++){
        //     for(int j=1; i<=nums.length; j++){
        //         if(nums[i] != nums[j]){
        //             return false;
        //         }
        //     }
        // }
        // return true;

        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            if(!s.add(num)){
                return true;
            }
        }
        return false;
    }
}