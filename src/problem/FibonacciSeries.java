package problem;

import java.util.Arrays;

public class FibonacciSeries {

   public  static void main(String[] args) {

       int a = 1; // 1, 2, 3, 5
       int b = 2;
       int c = 0;
       for( int i = 0 ; i< 7 ; i ++){
           System.out.println(a);
           c = a + b;
           a =b;
           b =c;
       }

   }
}
