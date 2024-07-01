import java.util.Scanner;

public class ContainDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            int store = nums[i];
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == store) {
                    if (Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        ContainDuplicate solution = new ContainDuplicate();
        boolean result = solution.containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);
        scanner.close();
    }
}
