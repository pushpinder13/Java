import java.util.*;

class Solution {
    public static void frequencyCount(int arr[], int N) {
        int temp[] = new int[N];
        for (int i = 0; i < N; i++) {
            if (arr[i] >= 1 && arr[i] <= N) {
                temp[arr[i] - 1]++;
            }
        }
        for (int i = 0; i < N; i++) {
            arr[i] = temp[i];
        }
    }
}

public class Frequencies_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        System.out.println("Enter " + N + " elements of array (1 to " + N + "): ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution.frequencyCount(arr, N);
        
        System.out.println("Frequency array:");
        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ": " + arr[i]);
        }

        sc.close();
    }
}
