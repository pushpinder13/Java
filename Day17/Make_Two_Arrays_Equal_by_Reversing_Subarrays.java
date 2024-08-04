import java.util.Arrays;
import java.util.Scanner;

public class Make_Two_Arrays_Equal_by_Reversing_Subarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;
        int m = arr.length;
        if (n != m)
            return false;

        Arrays.sort(arr);
        Arrays.sort(target);

        for (int i = 0; i < n; i++) {
            if (target[i] != arr[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the arrays:");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] target = new int[n];
        System.out.println("Enter the elements of the target array:");
        for (int i = 0; i < n; i++) {
            target[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the arr array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.nextLine();

        Make_Two_Arrays_Equal_by_Reversing_Subarrays solution = new Make_Two_Arrays_Equal_by_Reversing_Subarrays();

        boolean result = solution.canBeEqual(target, arr);
        System.out.println("Can the arrays be made equal? " + result);

        scanner.close();
    }
}
