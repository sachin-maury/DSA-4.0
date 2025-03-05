

import java.util.Scanner;



public class userInmax {

    void ArrMax( int arr[]){
        int n = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > n){
            n=i;
            }
        }
        System.out.println("The max no is :" +n);
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        userInmax obj = new userInmax();
        obj.ArrMax(arr);
        
    }
    
}
