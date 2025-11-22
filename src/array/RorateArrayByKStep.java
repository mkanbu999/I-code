package array;

import java.util.Arrays;

public class RorateArrayByKStep {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; //3, 4, 5, 1,2 right; left 4,5,1,2,3
        int k = 3;

        rotate( a, 0, a.length-1);
        rotate(a, 0, a.length-k);
        rotate(a, k, a.length-1);
        Arrays.stream(a).forEach(System.out::print);
    }

    public static void rotate(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    }
}