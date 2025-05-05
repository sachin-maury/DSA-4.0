import java.util.Scanner;


public class sortArrbool {
    static boolean SortedArr(int arr[]){
        boolean check = true;
        // we can't start from 0 baecause we're starting check from 0 then -1 is not acceptable
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array!");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted Array "+ SortedArr(arr));
    }
}
