public class day14 {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string becomes empty after removing whitespaces
        if (i == n) return 0;

        // Step 2: Handle optional sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to number with overflow check
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Check for overflow BEFORE adding the digit
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String[] testCases = {"42", "   -42", "4193 with words", "words 987", "-91283472332", "+1", "00000", "   +0 123", "-123"};
        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\" => Output: " + myAtoi(test));
        }
    }
}
