

public class arr3d {

    public static void MultiArrays(){
        int arr [][][]={{{54,25,36},{25,45,14},{47,54,21}}};
        System.out.println(arr[0][0][0]);//54
        System.out.println(arr[0][0][1]);//25
        System.out.println(arr[0][0][2]);//36

        System.out.println(arr[1][0][0]);//25
        System.out.println(arr[1][1][1]);//45
        System.out.println(arr[1][2][2]);//14

        System.out.println(arr[2][0][0]);//47
        System.out.println(arr[2][1][1]);//54
        System.out.println(arr[2][2][2]);//21
    }
    public static void main(String[] args) {
        arr3d obj = new arr3d();
        obj.MultiArrays();
        
    }
}
