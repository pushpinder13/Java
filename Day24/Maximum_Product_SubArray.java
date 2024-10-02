import java.util.Scanner;

public class Maximum_Product_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.maxProduct(arr));
        sc.close();

    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int current = 1;
            for (int j = i; j < nums.length; j++) {
                current = current * nums[j];
                sum = Math.max(current, sum);
            }
        }
        return sum;
    }
}