class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int s :students){
            q.offer(s);
        }
        int count =0;
        while(!q.isEmpty() && count< q.size()){
            if(q.peek() == st.peek()){
                q.poll();
                st.pop();
                count =0;
        }
        else{
            q.offer(q.poll());
            count++;
        }
        }
        return q.size();
    }
}