import java.util.Scanner;

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
}

public class Remove_Element {

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the variable to remove: ");
        int val = sc.nextInt();
        Solution obj = new Solution();
        
        System.out.println(obj.removeElement(arr, val));
        sc.close();
    }
}