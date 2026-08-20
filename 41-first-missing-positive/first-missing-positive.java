class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> s = new HashSet<>();
       for(int num: nums){
        if(num>0){
            s.add(num);
        }
        }
         int res = 1;
        while(s.contains(res)){
             res++;
       }
       return res;
    }
}