import java.util.*;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count = 0;
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 2) {
                    five = five - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

public class Lemonade_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();

        boolean ans = obj.lemonadeChange(arr);
        if (ans) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();

    }
}
