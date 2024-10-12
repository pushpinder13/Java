import java.util.Scanner;

public class Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ther size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("enter goal to search: ");
        int goal = sc.nextInt();
        System.out.println(Solution.numSubarraysWithSum(arr, goal));
        sc.close();
    }

}

class Solution {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == goal) {
                    count++;
                }
            }
        }
        return count;
    }
}