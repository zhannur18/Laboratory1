// 4
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        double sum = factorial(n);
        System.out.println(sum);
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1) ;
        }
    }
}
/*
@ factorial - definition of factorial
@ n- length of array
@ return - returning factorial of function
 */