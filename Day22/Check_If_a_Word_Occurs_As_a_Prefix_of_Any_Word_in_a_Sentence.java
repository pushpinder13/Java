import java.util.Scanner;

class Solution {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String a[] = sentence.split(" ");
        for (int i = 0; i < a.length; i++) {

            if (a[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}

public class Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String searchWord = sc.nextLine();
        System.out.println(Solution.isPrefixOfWord(sentence, searchWord));

        sc.close();
    }
}
