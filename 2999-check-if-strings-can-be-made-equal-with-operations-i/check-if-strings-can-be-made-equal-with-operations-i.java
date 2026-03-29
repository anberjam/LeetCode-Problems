class Solution {
    public boolean canBeEqual(String s1, String s2) {
        //base case 1: return false if either String length isn't 4
        if (s1.length() != 4 || s2.length() != 4){
            return false;
        }
        //base case 2: return false if both strings dont only contain lowercase letters 
        if (!(s1.matches("[a-z]+") && s2.matches("[a-z]+"))){
            return false;
        }

        //base case 3: return true if strings are identical
        if(s1.equals(s2)){
            return true;
        }

        char[] sortedS1 = s1.toCharArray();
        char[] sortedS2 = s2.toCharArray();

        Arrays.sort(sortedS1);
        Arrays.sort(sortedS2);

        //base case 4:return false if strings don't have the same letters
        if (!Arrays.equals(sortedS1,sortedS2)){
            return false;
        }

        return (
            ((s1.charAt(0)==s2.charAt(0) && s1.charAt(2)==s2.charAt(2)) ||
            (s1.charAt(0)==s2.charAt(2) && s1.charAt(2)== s2.charAt(0))) &&
            ((s1.charAt(1)==s2.charAt(1) && s1.charAt(3)==s2.charAt(3)) || 
            ((s1.charAt(1)==s2.charAt(3)) && s1.charAt(3)==s2.charAt(1)))
        );  
        
    }
}