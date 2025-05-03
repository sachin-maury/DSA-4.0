package Arrays;

// it's based on linear Search
public class indexArr {
    void FoundArr(){
        int arr [] = {10,5,3,6,2,8,4,2};//find 2 in which index.
        int x = 2;
        int ans= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans= i;
                break;
            }
           
        }
        if(ans == -1){
            System.out.println("Index not found!");
        }
        else{
            System.out.println("Found "+x+" at the index "+ans);
        }
        
        
    }
    public static void main(String[] args) {
        indexArr obj = new indexArr();
        obj.FoundArr();
        
    }
}
