import java.util.*;
class Solution {

    int Countpair(int a[], int n, int sum) {
        int l = 0;
        int r = n - 1;
        int count = 0;
        while (l < r) {
            int SUM = a[l] + a[r];
            if (SUM == sum) {
                count++;
                l++;
                r--;
            } else if (SUM < sum) {
                l++;
            } else {
                r--;
            }
        }
        return count == 0 ? -1 : count;
    }

    public static void Pair_with_given_sum_in_sorted_array(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array (sorted): ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the sum to find pairs for: ");
        int sum = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.Countpair(a, n, sum);

        if (result == -1) {
            System.out.println("No pairs found with the given sum.");
        } else {
            System.out.println("Number of pairs with the given sum: " + result);
        }

        sc.close();
    }
}
