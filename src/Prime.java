// 3
public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and below are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is not divisible by any i, so it's prime
    }
    public static void main(String[] args) {
        int n = 7;
        boolean is_n_prime = isPrime(n);
        System.out.println(n + " is " + (is_n_prime ? "" : "not ") + "prime.");

    }
}
/*
@ isPrime - definition of prime
@ n- length
@ Math.sqrt
 */