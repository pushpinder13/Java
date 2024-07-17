import java.util.Scanner;

class Solution {
    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}

public class Search_in_Rotated_array_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        boolean found = solution.search(nums, target);

        if (found) {
            System.out.println("The target value " + target + " is in the array.");
        } else {
            System.out.println("The target value " + target + " is not in the array.");
        }

        scanner.close();
    }

}
