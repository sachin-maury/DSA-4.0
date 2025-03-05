

public class maxno {

    void ArrMax(){
        int arr[] = {5,8,4,6,2,9,7};
        int ans = 0;
        for(int i =0; i<arr.length; i++){
            if (arr[i] > ans) {
                ans = arr[i];
                
            }
        }

        System.out.println("Max Array is: "+ ans);
    }



   public static void main(String[] args) {
          maxno obj = new maxno();
          obj.ArrMax();
    
   }
}
