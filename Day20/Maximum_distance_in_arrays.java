import java.util.*;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minval = arrays.get(0).get(0);
        int maxval = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = 0;

        for (int i = 1; i < arrays.size(); i++) {
            int currmin = arrays.get(i).get(0);
            int currmax = arrays.get(i).get(arrays.get(i).size() - 1);

            ans = Math.max(ans, Math.abs(currmax - minval));
            ans = Math.max(ans, Math.abs(maxval - currmin));

            minval = Math.min(minval, currmin);
            maxval = Math.max(maxval, currmax);
        }

        return ans;
    }
}

public class Maximum_distance_in_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> arrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            List<Integer> array = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                array.add(sc.nextInt());
            }
            arrays.add(array);
        }

        Solution obj = new Solution();
        int result = obj.maxDistance(arrays);

        System.out.println(result);

        sc.close();
    }
}
