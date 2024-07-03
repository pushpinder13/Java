import java.util.*;

class solution {
    int missingNumber(int n, int arr[]) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        int ArrSum = 0;
        for (int num : arr) {
            ArrSum = ArrSum + num;
        }
        return sum - ArrSum;

    }
}

public class Missing_in_arr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        solution obj = new solution();
        int missing = obj.missingNumber(n, arr);
        System.out.println("The missing number is: " + missing);

    }
}