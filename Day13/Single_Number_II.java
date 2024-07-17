import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int singleNumber(int[] nums) {
        int p = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
                else
                    break;
            }
            if (count == 1) {
                p = nums[i];
                break;
            }
            i = i + count - 1;
        }

        return p;
    }
}

public class Single_Number_II {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int singleNumber = solution.singleNumber(nums);

        System.out.println("The single number is: " + singleNumber);

        scanner.close();
    }
}
