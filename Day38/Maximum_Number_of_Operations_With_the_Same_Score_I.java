import java.util.Scanner;

public class Maximum_Number_of_Operations_With_the_Same_Score_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxOperations(nums);

        System.out.println("Maximum number of operations: " + result);

        sc.close();
    }
}

class Solution {
    public int maxOperations(int[] nums) {
        int count = 1;
        int prev = nums[0] + nums[1];

        for (int i = 2; i < nums.length - 1; i = i + 2) {
            int cur = nums[i] + nums[i + 1];

            if (cur == prev) {
                count++;
                prev = cur;
            } else {
                break;
            }
        }
        return count;
    }
}