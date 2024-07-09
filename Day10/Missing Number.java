import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] == count) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements of array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int missing = obj.missingNumber(nums);
        System.out.println("Missing number is: " + missing);

        sc.close();
    }

}
