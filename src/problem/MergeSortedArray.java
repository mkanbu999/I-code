package problem;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
//        int a[] = {1, 2,3 ,0, 0, 0};
//        int b[] = {4, 5, 6};
//        sortArray(a, b);
//        Arrays.sort(a);
//        Arrays.stream(a).forEach(System.out::println);
    }

    private static void sortArray(int[] a, int[] b) {
        int c = 0;
        for(int i= b.length; i<a.length;i++){
            a[i] = b[c];
            c++;
        }
    }



        public static void merge(int[] a, int[] b) {
            int i = 0, j = 0, k = 0;
            int[] result = new int[a.length + b.length];

            while (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                    result[k++] = a[i++];
                } else {
                    result[k++] = b[j++];
                }
            }

            // Copy remaining elements
            while (i < a.length) {
                result[k++] = a[i++];
            }

            while (j < b.length) {
                result[k++] = b[j++];
            }


        }


}
