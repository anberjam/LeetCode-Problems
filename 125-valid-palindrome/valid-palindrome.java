class Solution {
    public boolean isPalindrome(String s) {
        String onlyLetters = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowerCase = onlyLetters.toLowerCase();
        
        if (lowerCase.length() == 0){
            return true;
        }
        if (lowerCase.length()==1){
            return true;
        }
        

        int index = lowerCase.length()-1;

        for (int i=0; i<lowerCase.length()/2; i++){
            if (lowerCase.charAt(i)!=lowerCase.charAt(index)){
                return false;
            }
            index--;
        }
        return true;
    }
}