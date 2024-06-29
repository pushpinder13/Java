import java.util.Scanner;

public class RemDupSortedARR {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] finalArr = new int[n];

        System.out.println("Enter elements in sorted order");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                finalArr[j++] = arr[i];
                
            }
        }
        finalArr[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(finalArr[i] + " ");
        }
        sc.close();
    }
}
