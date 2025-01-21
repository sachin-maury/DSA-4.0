import java.util.Scanner;

class nestedSwitch {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int empID = in.nextInt();
    String Department = in.next();
    switch (empID) {
        case 1:
            System.out.println("Sachin kushwaha");
            break;
            case 2:
            System.out.println("Shakti singh");
            break;
            case 3:
            System.out.println("Sadanand singh");

            switch (Department) {
                case "It":
                System.out.println("It Department");
                    break;

                    case "Management":
                    System.out.println("Management Department");
                    break;
            
            
                default:
                  System.out.println("Please enter vailed department");
                    break;
            }
    
        default:
        System.out.println("enter vailed empolyee id");
            break;
    }
 }
    
}