import java.util.Scanner;

public class Sorting_the_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.sortSentence(a));
        sc.close();
    }

}

class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] arr = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            char temp = a[i].charAt(a[i].length() - 1);
            if (temp == '1') {
                arr[0] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '2') {
                arr[1] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '3') {
                arr[2] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '4') {
                arr[3] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '5') {
                arr[4] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '6') {
                arr[5] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '7') {
                arr[6] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '8') {
                arr[7] = a[i].substring(0, a[i].length() - 1);
            } else if (temp == '9') {
                arr[8] = a[i].substring(0, a[i].length() - 1);
            }
        }

        return String.join(" ", arr);

    }
}