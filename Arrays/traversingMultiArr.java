package Arrays;

public class traversingMultiArr {
    void MultiArr(){
        int ages[][]= {{25,36,14},{56,45,21},{48,24,63}};
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){
                System.out.println(ages[i][j]);
            }
            
        }
    }
    public static void main(String[] args) {
        traversingMultiArr obj = new traversingMultiArr();
        obj.MultiArr();
    }
}
