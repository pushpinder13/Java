import java.util.Scanner;

class Solution {
    public long maximumTripletValue(int[] nums) {
        long temp = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] > nums[j]) {
                    for (int k = j + 1; k < n; k++) {
                        temp = Math.max(temp, ((long) nums[i] - (long) nums[j]) * nums[k]);
                    }
                }
            }
        }
        return temp;

    }
}

public class Maximum_Value_of_an_Ordered_triplet_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        long result = obj.maximumTripletValue(arr);
        sc.close();
        if (result > 0)
            System.out.println("Maximum value over triplets is: " + result);
        else
            System.out.println(-1);
    }

}
