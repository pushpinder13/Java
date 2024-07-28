import java.util.Scanner;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;

    }
}

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.peakIndexInMountainArray(arr);
        System.out.println(result);
        sc.close();
    }

}
