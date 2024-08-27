import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a = 0, b = 1;
        while (b < nums.length) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a = b + 1;
            b = a + 1;
        }
        return nums;
    }
}

public class Minimum_Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int arr[] = obj.numberGame(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(a[i] + " ");

        }
        sc.close();

    }
}
