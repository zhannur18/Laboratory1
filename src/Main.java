public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int min = findMininum(arr, arr.length);
        System.out.println("Minimum in the array is: " + min);
    }

    public static int findMininum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int minValue = findMininum(arr, n - 1);
            return Math.min(minValue, arr[n - 1]);
        }
    }
}
/*
@ findMininum - definition of min
@ n- length of array
@ arr - array
@ return - returning minimum of function
 */