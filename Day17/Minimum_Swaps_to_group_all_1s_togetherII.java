import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans = n;
        for (int i = 0; i < n; i++)
            if (nums[i] == 1)
                count++;
        int[] arr = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[k] = nums[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            arr[k] = nums[i];
            k++;
        }
        int mini = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] == 0)
                mini++;
        }
        if (mini < ans)
            ans = mini;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == 0)
                mini--;
            if (arr[i + count - 1] == 0)
                mini++;
            if (mini < ans)
                ans = mini;
        }
        return ans;
    }
}

public class Minimum_Swaps_to_group_all_1s_togetherII
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int[] nums = new int[n];
        System.out.println("Enter the array elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();

        int result = solution.minSwaps(nums);
        System.out.println("Minimum number of swaps required: " + result);

        scanner.close();
    }

}