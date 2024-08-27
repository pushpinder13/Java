import java.util.Scanner;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;

    }
}

public class Count_Number_of_Pairs_With_Absolute_Difference_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("enter difference value:");
        int k = sc.nextInt();
        Solution obj = new Solution();
        int ans = obj.countKDifference(a, k);
        System.out.println(ans);
        sc.close();
    }
}
