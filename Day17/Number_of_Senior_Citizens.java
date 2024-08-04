import java.util.Scanner;

class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for (int i = 0; i < details.length; i++) {
            int age = Integer.parseInt(details[i].substring(11, 13));
            if (age > 60) {
                ans++;
            }
        }
        return ans;
    }
}

class Number_of_Senior_Citizens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of records:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] details = new String[n];
        System.out.println("Enter the records:");
        for (int i = 0; i < n; i++) {
            details[i] = sc.nextLine();
        }

        Solution obj = new Solution();
        int result = obj.countSeniors(details);

        System.out.println("Number of seniors: " + result);

        sc.close();

    }
}
