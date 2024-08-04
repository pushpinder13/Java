import java.util.*;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j];
                l.add(sum);
            }
        }
        Collections.sort(l);
        long totalSum = 0;
        int mod = (int) (1e9 + 7);
        for (int i = left - 1; i < right; i++) {
            totalSum = (totalSum + l.get(i)) % mod;
        }
        return (int) totalSum;

    }
}

public class Range_Sum_of_Sorted_Subarray_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the left index: ");
        int left = scanner.nextInt();
        System.out.print("Enter the right index: ");
        int right = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.rangeSum(nums, n, left, right);

        System.out.println("The range sum is: " + result);

        scanner.close();
    }
}
