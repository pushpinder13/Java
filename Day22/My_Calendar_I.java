import java.util.*;

public class My_Calendar_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalendar obj = new MyCalendar();

        System.out.print("Enter the number of operations: ");
        int n = sc.nextInt();

        List<Object> output = new ArrayList<>();
        output.add(null);
        for (int i = 1; i < n; i++) {
            System.out.print("Enter start and end times for booking: ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            boolean result = obj.book(start, end);
            output.add(result);
        }

        System.out.println(output);

        sc.close();
    }

}

class MyCalendar {

    static List<int[]> l;

    public MyCalendar() {
        l = new ArrayList<>();
    }

    public static boolean book(int start, int end) {
        for (int[] b : l) {
            int bstart = b[0];
            int bend = b[1];

            if (start < bend && end > bstart) {
                return false;
            }
        }
        l.add(new int[] { start, end });
        return true;
    }
}
