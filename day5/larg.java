import java.util.Scanner;

public class larg {

    public static void main(String[] args) {
        Scanner sachin = new Scanner(System.in);
       
       
        int Arr []={1,4,5,6,7};
        for(int i=0; i<Arr.length; i++){
            System.out.print("Eneter number:");
            int Number=sachin.nextInt();
            if (Number>Arr[i]) {
                System.out.println(Arr[i]);
                
            }
        }
        
    }
}