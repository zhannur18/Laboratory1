//10
public class GCD {
    public static double GCD(double num1, double num2){
        if(num2 == 0)
            return num1;
        else
            return GCD (num2, num1 % num2);
    }
    public static void main(String[] args) {
        System.out.println(GCD(10, 7));
    }// OUT 1
}
//is calculated by the remainder of the number