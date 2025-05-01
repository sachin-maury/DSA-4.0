package Arrays;

public class secArray {
    void DemoArray(){
        int multiArray[][] = new int[2][4];
        multiArray[0][0]=5;
        multiArray[0][1]=7;
        multiArray[0][2]=11;
        multiArray[0][3]=15;

        multiArray[1][0]=10;
        multiArray[1][1]=15;
        multiArray[1][2]=20;
        multiArray[1][3]=25;

        System.out.print(multiArray[0][0] +" " );
        System.out.print(multiArray[0][1] +" " );
        System.out.print(multiArray[0][2] +" " );
        System.out.println(multiArray[0][3] +" " );
  


        System.out.print(multiArray[1][0] +" " );
        System.out.print(multiArray[1][1] +" " );
        System.out.print(multiArray[1][2] +" " );
        System.out.print(multiArray[1][3] +" " );



    }
    public static void main(String[] args) {

        secArray obj = new secArray();
        obj.DemoArray();
        
    }
}
