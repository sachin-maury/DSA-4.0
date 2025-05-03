package Arrays;

public class largestNArr {
    void MaxNumArr(){
        int arr[] ={5,3,6,2,8,1};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
            
        }
        System.out.println(ans+"  is the largest number of the array!");
    }
    public static void main(String[] args) {
        largestNArr obj = new largestNArr();
        obj.MaxNumArr();
        
    }
}
