import java.util.Scanner;

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int e = s.length- 1 - i;
            char temp = s[i];
            s[i] = s[e];
            s[e] = temp;
        }
    }
}
public class ReverseString{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] s = input.toCharArray();
        
        System.out.println("Original array: " + new String(s));
        
        Solution solution = new Solution();
        solution.reverseString(s);
        
        System.out.println("Reversed array: " + new String(s));
        
        sc.close();
        

        
    }
}