package sort;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = {
                {2, 4},// 3 is overlapping put the max val
                {1, 5},
                {6, 7}
        };
        sort(array);
        System.out.println(Arrays.deepToString(array));
    }


    private static void sort(int[][] array) {

        for(int i = 0; i<array.length; i++){

            for(int j = i+1; j<array.length; j++){

                if(array[i][0] > array[j][0]){
                    swap(array, i,j);
                }

            }

        }
    }

    private static void swap(int[][] array , int i, int j) {

        int temp = array[i][0];
        array[i][0] = array[j][0];
        array[j][0] = temp;

        int temp2 = array[i][1];
        array[i][1] = array[j][1];
        array[j][1] = temp2;
    }
}
