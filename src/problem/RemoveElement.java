package problem;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] a= {1,2,2,3,4};
        removeElement(a, 2);
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
        System.out.println(j);
    }

}
