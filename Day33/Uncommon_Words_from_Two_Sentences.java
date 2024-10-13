import java.util.*;

public class Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] arr = Solution.uncommonFromSentences(a, b);
        for (String s : arr) {
            System.out.print(s + " ");

        }
        sc.close();
    }
}

class Solution {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    found = true;
                    break;
                }
            }
            if (!found && countOccurrences(arr1, arr1[i]) == 1) {
                result.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])) {
                    found = true;
                    break;
                }
            }
            if (!found && countOccurrences(arr2, arr2[i]) == 1) {
                result.add(arr2[i]);
            }
        }

        return result.toArray(new String[0]);
    }

    private static int countOccurrences(String[] arr, String word) {
        int count = 0;
        for (String str : arr) {
            if (str.equals(word)) {
                count++;
            }
        }
        return count;
    }
}