package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int []  array = {3,2,4,5};
        sort(array);
        Arrays.stream(array).forEach(System.out::println);

    }
    private static int[] sort(int[] array) {

        for(int i = 0; i<array.length; i++){

            for(int j = i+1; j<array.length; j++){

                if(array[i] > array[j]){
                    swap(array, i,j);
                }

            }

        }
        return array;
    }

    private static void swap(int[] array , int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
