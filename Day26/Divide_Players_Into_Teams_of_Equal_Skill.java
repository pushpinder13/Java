import java.util.*;

public class Divide_Players_Into_Teams_of_Equal_Skill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans=Solution.dividePlayers(arr);
        System.out.println(ans);
        sc.close();
 
    }
}

class Solution {
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int n = skill.length;
        long sum = 0;
        int total = skill[0] + skill[n - 1];
        int i = 0, j = n - 1;
        while (i < j) {
            if (skill[i] + skill[j] != total) {
                return -1;
            }
            sum += (long) skill[i] * skill[j];
            i++;
            j--;
        }

        return sum;
    }
}
