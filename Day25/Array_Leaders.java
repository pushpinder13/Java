import java.util.*;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {

        int max = arr[n - 1];

        ArrayList<Integer> a = new ArrayList<>();

        a.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                a.add(max);
            }
        }
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            leaders.add(a.get(i));
        }
        return leaders;
        // Your code here
    }
}

public class Array_Leaders {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> l = Solution.leaders(n, arr);
        for (int i : l) {
            System.out.print(i + " ");
        }
        sc.close();

    }
}
