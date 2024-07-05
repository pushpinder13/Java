import java.util.*;

class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
         Vector<Integer> vector = new Vector<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        vector.addAll(set);
        return vector.size();
    
    }
}

public class Union_Of_two_arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter " + n1 + " elements of array 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter " + n2 + " elements of array 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int unionSize = Solution.doUnion(arr1, arr2);
        System.out.println("Size of union of array 1 and array 2: " + unionSize);

        sc.close();
    }

}
