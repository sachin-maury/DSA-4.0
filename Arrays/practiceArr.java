package Arrays;

public class practiceArr {
    void PracticeBuzz(){
        int arr[] ={1,5,3};
        //  int sum = arr[0]+arr[1]+arr[2];
        //  System.out.println(sum);


        // 2nd Method Using loop print sum
        int sum = 0;
         for(int i=0; i<arr.length; i++){
           sum = sum+arr[i];
         }
         System.out.println(sum);
        
    }
    public static void main(String[] args) {
        practiceArr obj = new practiceArr();
        obj.PracticeBuzz();
        
    }
}
