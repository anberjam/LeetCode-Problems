class Solution {
    public String removeDuplicates(String s, int k) {
        //create a stack of integer arrays to store ch and count
        Stack<int[]> solution = new Stack<>();

        //loop through the characters in s
        for(char ch: s.toCharArray()){
        //if the ch is already in the stack, increment its count
        if(!solution.isEmpty() && solution.peek()[0] == ch){
            solution.peek()[1]++;
        //if the count = k, pop the element
            if (solution.peek()[1]==k){
                solution.pop();
            }
        }
        //if ch isn't in the stack, add it with the ch and count = 1
        else {
            solution.push(new int[]{ch,1});
        }
        }

        //convert the stack to a string
        StringBuilder sb = new StringBuilder();
        for (int[] pair: solution){
            char ch = (char) pair[0];
            int count = pair[1];

            for(int i=0; i< count; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}