
//calculate the sum of all the given array
//input:arr[] ={1,5,3}
// output= 9

public class first {

     void DemoAray (){
        int arr[] = {1,5,3};
        int sum = 0;
        for(int i=0; i<arr.length;i++){
           sum = sum+arr[i];
        }
        System.out.println(sum);
    
        
    }
    
    public static void main(String[] args) {
          first obj = new first();
          obj.DemoAray();
    }
}
