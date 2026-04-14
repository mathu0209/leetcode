class Solution {
    public int countSegments(String s) {
        int count =0;
        boolean seg = false;
        for(char c: s.toCharArray()){
            if(c!=' ' &&!seg){
                count++;
                seg = true;
            }
            else if (c== ' '){
                seg = false;
                
            }
        }
        return count;
    }
}