class Solution {
    public boolean isPowerOfThree(int n) {
        double a = Math.log10(n);
        double b = Math.log10(3);
        double x = a/b;
        if (x != (int) x)
        {return false;}
        else
        {return true;}
    }
}