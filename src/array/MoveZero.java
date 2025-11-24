package array;

import java.util.Arrays;

public class MoveZero {
    public static void main (String[] args){

        int [] a = {0, 0, 3, 4,6};
        int b =  findSmallest(a);
//        System.out.println(b);
    }

    private static int findSmallest(int [] a ) {
        int n = 0;
        for(int i = 0; i <= a.length -1; i ++){
            if(a[i] != 0){
                int temp = a[i];
                 a[i] = a[n];
                 a[n] = temp;
                 n++;
            }
        }
        Arrays.stream(a).forEach(System.out::print);
       return 0;
    }
}
