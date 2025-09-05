package problem;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] a= {1,0,0,3,4};
        removeElement(a, 0);
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void removeElement(int[] a, int val) {
        int j = 0;
        for(int i= 0; i<a.length; i ++){
            if(a[i] !=val){
                a[j]=a[i];
                j++;
            }
        }
        for(int i= j; i<a.length; i++){
            a[i] = 0;
        }
    }
}
