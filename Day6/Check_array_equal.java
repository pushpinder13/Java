import java.util.*;
class Solution {

    public static boolean check(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
        
    }
}

public class Check_array_equal {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr1 and 2: ");
        int n=sc.nextInt();
        int arr1[]=new int [n];
        int arr2[]=new int [n];
        System.out.println("Enter "+n +" elements for arr1: ");
        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter "+n +" elements for arr2: ");

        for (int i = 0; i < n; i++) {
            arr2[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        boolean equal=obj.check(arr1,arr2);
        if(equal){
            System.out.println("Both array are equal");
        }else{
            System.out.println("Arrays are different");
        }


        
        sc.close();
    }

    
}
