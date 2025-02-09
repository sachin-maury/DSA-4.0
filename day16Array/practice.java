package day16Array;

import java.util.Scanner;

public class practice {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] =99;
        arr[1] = 54;
        arr[2] = 75;
        arr[3] = 14;
        arr[4] = 53;
        System.out.println(arr[4]);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");

            
        }
        
}
