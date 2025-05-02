package Arrays;

public class mulArrLength {
    void MulArrlength(){
        int arr [][]= {{54,63,48},{45,21,32},{25,12}};
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        mulArrLength obj = new mulArrLength();
        obj.MulArrlength();
    }
}
