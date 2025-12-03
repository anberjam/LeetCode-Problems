class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 == 1){
            return false;
        }

        //key value pairs
        Map<Character, Character> mapS = new HashMap<>();
        mapS.put(')', '(');
        mapS.put(']', '[');
        mapS.put('}', '{');

        Stack<Character> stackS = new Stack<>();

        //loop through all characters in s
        for (char c: s.toCharArray()){
            //if c is an open ([{ , add to stack
            if (mapS.containsValue(c)){
                stackS.push(c);
            }
            //if c is a closed )]} , return false if stack is empty or if the value of c wasn't the first in stack
            else if (mapS.containsKey(c)){
                if (stackS.isEmpty() || mapS.get(c) != stackS.pop()){
                    return false;
                }
            }
        }
        //if stack is empty, return true
    return stackS.isEmpty();

    }
}

 