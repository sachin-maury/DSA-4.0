import java.util.*;
public class greaterEleArr {
    static int StrictlyGreater(int arr[] , int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> x){
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array"); 
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt(); 
        }
        System.out.println("Enter X");
        int x = sc.nextInt();
        
        System.out.println("Count Of "+StrictlyGreater(arr, x));
       
    }

}





   

