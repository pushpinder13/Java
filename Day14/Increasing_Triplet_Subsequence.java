import java.util.Scanner;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= a) {
                a = nums[i];
                c++;
            } else if (nums[i] <= b) {
                b = nums[i];
                c++;
            } else
                return true;
        }
        return false;
    }
}

public class Increasing_Triplet_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        boolean ans=obj.increasingTriplet(arr);
        if(ans)System.out.print("True");
        else System.out.print("False");

    }

}
