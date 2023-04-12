package ReverseInteger;

public class ReverseInteger {
    public static int reverseInt(int x) {
        long rev = 0;
        while (x != 0) {
            int reminder = x % 10;
            rev = rev * 10 + reminder;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) rev;
    }
}
