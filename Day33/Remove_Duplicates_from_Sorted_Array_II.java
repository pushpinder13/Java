import java.util.*;

public class Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int newSize = solution.removeDuplicates(arr);

        System.out.println("The array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew size of the array: " + newSize);

        sc.close();
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        int count = 1;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).equals(a.get(i - 1))) {
                count++;
                if (count > 2) {
                    a.remove(i);
                    i--;
                }
            } else {
                count = 1;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            nums[i] = a.get(i);
        }
        return a.size();
    }
}
