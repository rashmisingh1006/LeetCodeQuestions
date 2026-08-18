class Solution {
    public int reverse(int x) {

        int digit = 0;
        int output = 0;
        while (x != 0)
        {
           digit = x % 10;
           x = x / 10;
           if (output > Integer.MAX_VALUE/10 || 
            (output == Integer.MAX_VALUE/10 && digit > 7 ))
            {
                return 0;
            }
            if (output < Integer.MIN_VALUE/10 ||
            (output == Integer.MIN_VALUE/10 && digit < -8 ))
            {
                return 0;
            }
           output = output * 10 + digit;

           }

           return output;
 }
}