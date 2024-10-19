import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = nums2[i];
        }

        for (int i = 0; i < m; i++) {
            nums1[i] = arr1[i];
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = arr2[i];
        }

        Arrays.sort(nums1);

    }
}

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in nums1 (m): ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m + 10];
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in nums2 (n): ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged array:");
        System.out.println(Arrays.toString(nums1));

        scanner.close();
    }
}
