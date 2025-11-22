package array;

import java.util.Arrays;

public class ReverseArrayInPlace {
   public static void main(String[] args) {
        int [] a ={1,2,3,4,5}; //3, 4, 5, 1,2
        int start =0;
        int end = a.length-1;
        while(start< end){
            int temp = a[start];
            a[start] = a[end];
            a[end]= temp;
            start ++;
            end --;
        }

        Arrays.stream(a).forEach(System.out::print);
    }

}
