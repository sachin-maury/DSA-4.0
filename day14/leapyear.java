public class leapyear {
    
    void LeapYears(int year){
        if (year % 4==0 && year % 100 != 0 || year %400==0){
            System.out.println(year+"This is a leap year:");
            
        }
        else{
            System.out.println(year+" This is not leap year:");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your Year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leapyear obj = new leapyear();
        obj.LeapYears(year);
         
    }
}

}
