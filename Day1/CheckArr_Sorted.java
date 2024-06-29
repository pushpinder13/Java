import java.util.*;
class CheckArr_Sorted {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                flag = false;
                break;}
            }
        if (flag) {
            System.out.print("The array is sorted in asceding order");
        } else {
            System.out.print("The array is not sorted in asceding order");
        }
        sc.close();
    }
}