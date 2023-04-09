// 6
public class Power {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        double result = power(a, n);
        System.out.println(result);

    }
    public static double power(double a, int n){
        if(n == 0){
            return 1;
        }else{
            return  Math.pow(a, n) ;
        }
    }
}
/*
@ power - definition of power
@ n- length
@ return - returning power of function
 */