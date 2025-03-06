public class elementfind {

    void SearchArray(){
        int arr [] = {10,5,2,3,6,2,8,4};
        int x =2;
        int ans = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("ans not found in this array");
        }
        System.out.println("found element X : "+x +" at index " +ans);
    }
    public static void main(String[] args) {
        elementfind obj = new elementfind();
        obj.SearchArray();
        
    }
}
