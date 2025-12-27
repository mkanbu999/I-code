package problem;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
//        int a[] = {1, 2,3 ,0, 0, 0};
//        int b[] = {4, 5, 6};
//        sortArray(a, b);
//        Arrays.sort(a);
//        Arrays.stream(a).forEach(System.out::println);
        sortArray();
    }

    private static void sortArray(int[] a, int[] b) {
        int c = 0;
        for(int i= b.length; i<a.length;i++){
            a[i] = b[c];
            c++;
        }
    }

    private static void sortArray() {

        int[] a = {1,3};
        int[] b = {2,5};

        int[] c = new int[a.length + b.length];

        int left = 0;
        int right = 0;

        for(int  i = 0; i<c.length ; i++){

               if( left >= a.length){
                c[i] = b[right++];
            }
            else if( right >= b.length){
                   c[i] = a[left++];
               }
           else if( a[left] >= b[right]){
                c[i] = b[right];
                right++; //1
            }
            else{
                c[i] =a[left];
                left ++; //1,
            }
        }

        Arrays.stream(c).forEach(System.out::print);
    }



}
