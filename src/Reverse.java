// 7
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        reverseArray(arr, 0, n-1);
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
        reverseArray(arr, start, end);
    }
}
/*
@ reverseArray - definition of reverse
@ n- length of array
@ arr - array
@ return - returning reverse of function
 */