

public class arrRefrence {

    static void PrintArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = new int[5];
            arr[0] = 15;
            arr[1] = 20;
            arr[2] = 25;
            arr[3] = 30;
            arr[4] = 35;
            System.out.println("This are the original array:");
            PrintArray(arr);

            System.out.println("This are the copy array:");
            int [] arr_2= arr;
            PrintArray(arr_2);  
            
            arr_2[0]=0;
            arr_2[1]=0;

            System.out.println("Original array of arr_2");
            PrintArray(arr);

            System.out.println("After changing arr_2");
            PrintArray(arr_2);
            
    }
   
}
