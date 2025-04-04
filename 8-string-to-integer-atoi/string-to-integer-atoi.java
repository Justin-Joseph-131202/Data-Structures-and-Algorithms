class Solution {
    public static int myAtoi(String s) {
        // Your code here
        int num = s.length();
        int index = 0 , res = 0;
        int sign = 1;
        // remove starting white spaces
        while(index < num && s.charAt(index) == ' ') {
            index++;
        }

        // adjust the sign
        if (index < num && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if (s.charAt(index) == '-') {
                sign = -1;
            }
            index++; // Move forward once
        }

        // Building or converting string t integer
        while(index < num && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE /10 && ( s.charAt(index) - '0' ) > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE ;
            }

            res = 10 * res + s.charAt(index) - '0';
            index++ ;
        }

        return res  * sign ;

    }
}