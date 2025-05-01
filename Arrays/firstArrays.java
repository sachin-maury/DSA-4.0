package Arrays;

public class firstArrays {

     void DemoArray(){
        int ages[] = new int[3];
        float weight[] = new float[5];
        String name[] = new String[5];

        ages[0]= 20;
        ages[1]= 25;
        ages[2]= 30;
       

      System.out.println(ages[0]);
      System.out.println(ages[1]);
      System.out.println(ages[2]);



    }
    public static void main(String[] args) {

        firstArrays obj = new firstArrays();
        obj.DemoArray();
        
        
    }
}
