import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);

        HashMap<Integer, Integer> mp = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                mp.put(a[i], rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = mp.get(arr[i]);
        }

        return result;
    }
}

public class Rank_Transform_of_an_Array {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int ar[] = obj.arrayRankTransform(arr);
        for (int i : ar) {
            System.out.print(i);
        }

        sc.close();
    }
}