import java.util.Scanner;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }

        return false;
    }
}

public class Three_Cosecutive_Odds {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = obj.threeConsecutiveOdds(arr);
        if (ans)
            System.out.print("True");
        else
            System.out.print("False");

        sc.close();
    }

}
