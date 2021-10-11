class Solution {
    public int maxDepth(String s) {
        int nested = 0;
        int previous =0;
        int answer =0;
        
        for(int i=0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {nested++;}
            if (s.charAt(i) == ')') {nested--;}
             
            if (previous > nested) { answer = previous;}
            else if (previous < nested) {answer = nested;}
            previous = answer;
        }
    return answer;
    }
}