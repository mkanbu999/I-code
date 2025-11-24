package array;

import java.util.Arrays;

public class FindTheSecondLargest {

    public static void main (String[] args){

        int [] a = {1, 3,4,5,0};
         findSmallest(a);
//        Arrays.stream(a).forEach(System.out::println);
        System.out.println(a[a.length-1-1]);
    }

    private static void findSmallest(int [] a ) {
        for(int i =0; i< a.length; i++){
            for(int j =i +1 ; j< a.length; j++){
                if(a[j]< a[i]){
                  int temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                }
            }
        }
    }
}
