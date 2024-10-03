import java.util.*;

public class Array_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> l = Solution.duplicates(arr);
        for (int i : l) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}

class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {

                if (!a.contains(arr[i])) {
                    a.add(arr[i]);
                }
            }
        }
        if (a.size() > 0) {
            return a;
        }
        a.add(-1);
        return a;
        // code here
    }
}
