import java.util.*;
class Solution {
    public static void sort012(int[] a, int n) {
        int s = 0, mid = 0, e = n - 1;
        
        while (mid <= e) {
            if (a[mid] == 0) {
                int temp = a[s];
                a[s] = a[mid];
                a[mid] = temp;
                s++;
                mid++;
                
            } else if (a[mid] == 1) {
                mid++;
                
            } else if (a[mid] == 2) {
                int temp = a[mid];
                a[mid] = a[e];
                a[e] = temp;
                e--;
            }
        }
    }
}



public class Sort_0s_1s_2s {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter "+n +" elements for array: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
       Solution obj=new Solution();
       obj.sort012(a,n);
       System.out.println("Sorted array: ");
       for(int num:a){
        System.out.print(num+" ");
       }    

        
        sc.close();
    }

    
}