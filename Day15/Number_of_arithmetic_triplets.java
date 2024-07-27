import java.util.Scanner;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[k] - nums[j] == diff)
                            count++;
                    }
                }
            }
        }
        return count;
    }
}

public class Number_of_arithmetic_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter diff: ");
        int diff = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.arithmeticTriplets(arr, diff);
        sc.close();
        if (result > 0)
            System.out.println("Number of unique arithmetic triplets are: " + result);
        else
            System.out.println(-1);
    }

}