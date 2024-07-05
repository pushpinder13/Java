import java.util.Scanner;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int p = 0;
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                temp[0] = i;
                p = 1;
                break;
            }
        }
        if (p == 1) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j] == target) {
                    temp[1] = j;
                    break;
                }
            }
        } else {
            temp[1] = -1;
            temp[0] = -1;
        }

        return temp;

    }
}

public class Find_First_and_Last_Position_of_Elementin_Sorted_Array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements in array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter element to search :");
        int target = sc.nextInt();
        Solution obj = new Solution();
        int temp[]=obj.searchRange(nums, target);
        
        if (temp[0] == -1 && temp[1] == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("First occurrence: " + temp[0]);
            System.out.println("Last occurrence: " + temp[1]);
        }
        

        sc.close();
    }
}