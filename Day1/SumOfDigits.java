import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        System.out.println("enter the value of n ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
        int count=n%10;
        sum=sum+count;
        n=n/10;
        }
        System.out.print(sum);
        sc.close();
    }
}
