class Solution {
    public int[] plusOne(int[] digits) {
        //edge cases
        if (digits.length <1 || digits.length > 100) {
            return null;
        }
        int length = digits.length;

        for (int i=length-1; i>=0; i--){
            if (digits[i]< 9){
                digits[i]++;
                return digits;
            }
            else if (digits[i] >=9)
            {
                digits[i] =0;
                if (i!=0){
                digits[i-1] += 0;
                }
                else if (i==0) {
                    int[] newDigits = new int[length+1];
                    newDigits[0]=1;
                    System.arraycopy(digits, 0, newDigits, 1,length);
                    return newDigits;
                }
            }
        }
        return digits;

    }
}