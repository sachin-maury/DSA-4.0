package day16Array;



public class arrayp {

  
 public static void demoArray(int ages) {
    int ages[] = new int[3];
    String name[] = new String[3];
    Float value[] = new Float[3];
    

    ages [0] = 10;
    ages [1] = 20;
    ages [2] = 30;

    // string
    name [0] = "Sachin kumar";
    name [1] = "suman kumar";
    name [2] = "mohan kumar";

    // value 
    value [0] = 11.0F;
    value [1] = 12.0F;
    value [2] = 13.0F;
    

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);
    System.out.println(ages[3]);
 
    
 }

    public static void main(String[] args) {
        arrayp obj = new arrayp();
        obj.demoArray();
    }
}
