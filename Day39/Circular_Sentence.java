import java.util.Scanner;

public class Circular_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Solution.isCircularSentence(s));
        sc.close();
    }
}

class Solution {
    public static boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");

        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
                return false;
            }

        }

        return true;

    }
}