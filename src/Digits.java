//8
public class Digits {
    public static void main(String[] args) {
        String s = "123456";
        boolean result = isAllDigits(s);
        System.out.println(result);
    }
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;  // non-digit character found, return false
            }
        }
        return true;  // all characters are digits, return true
    }
}
/*
@ isAllDigits- definition of all Digits is true
@ s- length
 */