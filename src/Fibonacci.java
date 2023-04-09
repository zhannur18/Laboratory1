//5
public class Fibonacci {
    public static void main(String[] args) {
        int n = 17;
        int fn = fibonacci(n);
        System.out.println(fn);
    }

    public static int fibonacci(int n) {
        if (n == 0) {  // 1: F0 = 0
            return 0;
        } else if (n == 1) {  // 2: F1 = 1
            return 1;
        } else {  // Fn = Fn-1 + Fn-2
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
/*
@ fibonacci - definition of fibonacci
@ n- length
@ return - returning fibonacci of function
 */