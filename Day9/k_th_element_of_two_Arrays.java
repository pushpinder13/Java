import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int size = n + m;
        int mergeArr[] = new int[size];

        System.arraycopy(arr1, 0, mergeArr, 0, n);
        System.arraycopy(arr2, 0, mergeArr, n, m);
        Arrays.sort(mergeArr);

        return mergeArr[k - 1];
    }
}

public class k_th_element_of_two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        long result = sol.kthElement(arr1, arr2, n, m, k);

        System.out.println("The " + k + "th element in the merged sorted array is: " + result);

        sc.close();
    }
}
