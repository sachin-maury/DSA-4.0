package Arrays;

public class forLoop {
    void DemoArray(){
        int num [] = new int[5];
        num[0]=5;
        num[1]=6;
        num[2]=8;
        num[3]=9;
        num[4]=15;

        System.out.println("For loop");
        for(int i=0;i<5;i++){
            System.out.println(num[i]);
        }
        //For Each loop
        System.out.println("for each loop");
        for(int Number:num){
            System.out.println(Number);
        }
       // While loop
       System.out.println("While loop");
        int i = 0;
        while (i<5) {
            System.out.println(num[i]);
            i++;
        }

    }
    public static void main(String[] args) {
        forLoop obj = new forLoop();
        obj.DemoArray();
    }
}
