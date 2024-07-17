import java.util.Scanner;

class Solution {
    public static int findFloor(long arr[], int n, long x) {
        int s = 0, e = n - 1;
        int floorIndex = -1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                floorIndex = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return floorIndex;
    }
}

public class Floor_in_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        long[] arr = new long[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.print("Enter the value to find the floor of: ");
        long x = sc.nextLong();

        int floorIndex = Solution.findFloor(arr, n, x);
        if (floorIndex == -1) {
            System.out.println("There is no floor value for " + x + " in the array.");
        } else {
            System.out.println("The floor value of " + x + " is " + arr[floorIndex] + " at index " + floorIndex);
        }

        sc.close();
    }
}
