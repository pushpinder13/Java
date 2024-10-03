
import java.util.Scanner;

class Solution {
    static void pushZerosToEnd(int[] arr) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        // code here
    }
}

public class Move_all_zeroes_to_end_of_array {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution.pushZerosToEnd(arr);
        printArray(arr);

        sc.close();
    }
}