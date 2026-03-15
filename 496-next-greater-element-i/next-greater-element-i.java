class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer, Integer> map = new HashMap<>();
      Deque<Integer> q = new ArrayDeque<>();
      for(int num :nums2){
        while(!q.isEmpty() && q.peek() < num){
            map.put(q.pop(), num);
        }
        q.push(num);
      }
      int[] result = new int[nums1.length];
      for(int i=0; i<nums1.length; i++){
        result[i] = map.getOrDefault(nums1[i], -1);
      }
      return result;
    }
}