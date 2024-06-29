import java.util.Scanner;

public class MergeSorterdArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();

        int[] arr = new int[n];
        int[] arr1 = new int[n1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int finalArr[] = new int[n + n1];
        int i = 0, j = 0, k = 0;
        while (i < n && j < n1) {
            if (arr[i] <= arr1[i]) {
                finalArr[k] = arr[i];
                k++;
                i++;
                j++;
            } else {
                finalArr[k] = arr1[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            finalArr[k] = arr[i];
            k++;
            i++;
        }
        while (j < n1) {
            finalArr[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < finalArr.length; l++) {
            System.out.print(finalArr[l] + " ");

        }

        sc.close();

    }

}
