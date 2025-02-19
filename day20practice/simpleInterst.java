
import java.util.Scanner;

public class simpleInterst {

    void SimpleValue(int simpleCal){
        
        System.out.println("The simple interest is : "+simpleCal);
    }
    public static void main(String[] args) {
        System.out.println("Enter your princlple : ");
        Scanner in = new Scanner(System.in);
        int P= in.nextInt();
        System.out.println("Enter your precentage : ");
        int R = in.nextInt();
        System.out.println("Enter your Time : ");
        int T = in.nextInt();
        int simpleCal= (P*R*T)/100;
        simpleInterst obj = new simpleInterst();
        obj.SimpleValue(simpleCal);
        
    }
}
