import java.util.Scanner;

public class Sum_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array 1:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of array 2:");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of array 2:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] result = solution.findArraySum(a, n, b, m);

        System.out.println("Sum of the two arrays is:");
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

class Solution {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i : a) {
            s1.append(i);
        }

        for (int i : b) {
            s2.append(i);
        }

        int s1toInt = Integer.parseInt(s1.toString());
        int s2toInt = Integer.parseInt(s2.toString());

        int sum = s1toInt + s2toInt;

        String sumString = String.valueOf(sum);

        int[] result = new int[sumString.length()];
        for (int i = 0; i < sumString.length(); i++) {
            result[i] = Character.getNumericValue(sumString.charAt(i));
        }

        return result;
    }
}
