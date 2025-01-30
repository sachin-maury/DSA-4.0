

import java.util.Arrays;

public class fun {
    
    static void chang(int[] nums){
        nums[0]=99;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,2,45,6};
        chang(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
