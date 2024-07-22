import java.util.Scanner;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (heights[j] > heights[i]) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                    int tempHeight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempHeight;
                }
            }
        }
        return names;
    }
}

public class Sort_The_people {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of name and height arrays: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        System.out.println("Enter elements of name array:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        int[] heights = new int[n];
        System.out.println("Enter elements of height array:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        String[] sortedNames = obj.sortPeople(names, heights);

        System.out.println("Sorted names by heights:");
        for (String name : sortedNames) {
            System.out.println(name);
        }

        sc.close();
    }
}
