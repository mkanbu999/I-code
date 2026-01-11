package array;

import java.util.Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] a = {9, 2, 3, 6, 5}; //3, 4, 5, 1,2 right; left 4,5,1,2,3
        int k = 3;

     var result=   rotate( a);
        System.out.println(result);
    }

    public static boolean rotate(int[] a) {

        for(int i = 0; i< a.length-1;i++){
        if(a[i]> a[i+1])    {
            return false;
        }
        }
        return true;
    }
}
