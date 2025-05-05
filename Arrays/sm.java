import java.util.Arrays;
import java.util.Scanner;

public class sm {
    
    static int[] smallestOrLargestelarr(int arr[]){
        Arrays.sort(arr);
        int ans [] = {arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arr");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("Enter your arr element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();        
        }
        int ans[] = smallestOrLargestelarr(arr);
        System.out.println("Smallest no of "+ans[0]);
        System.out.println("largest no of "+ans[1]);
    }
}
