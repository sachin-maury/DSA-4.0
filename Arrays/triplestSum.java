import java.util.Scanner;

public class triplestSum {
    static int TriplestSumA(int arr[], int target){
        int n = arr.length;
        int ans=0;
        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                for(int k=j+1; k < n; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("Enter your element of array");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Ur target");
        int target = sc.nextInt();

       System.out.println(TriplestSumA(arr, target));

        
    }
}
