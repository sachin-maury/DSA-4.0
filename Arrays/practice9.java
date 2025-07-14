package Arrays;

public class practice9 {
 
    void MultiArray(){
      //  int num [][]=new int[2][3];
      int num [] [] = {{5,6,4},{6,8,1},{7,9,4}};
      System.out.println(num[0][0]);
      System.out.println(num[0][1]);
      System.out.println(num[0][2]);


      System.out.println(num[1][0]);
      System.out.println(num[1][1]);
      System.out.println(num[1][2]);
      
      System.out.println(num[2][0]);
      System.out.println(num[2][1]);
      System.out.println(num[2][2]);

    }
    public static void main(String[] args) {
        thirdArray obj = new thirdArray();
        obj.MultiArray();
        
        
    }
}


