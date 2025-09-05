package sort.cyclicsort;

import java.util.Arrays;

public class CyclicSortV1 {

    public static void main(String[] args) {
        int [] array = {4,3,1,2};
        CyclicSortV1.sort(array);
        System.out.println(Arrays.toString(array));
    }
    //
    private static void sort(int[] array) {
        int i =0;
        while(i<array.length){
            if(array[i]-1 != i){
                int destinationIndex= array[i] - 1; // 1
                int temp = array[i];              // 2
                array[i]=array[destinationIndex]; //
                array[destinationIndex]=temp; //
                Arrays.stream(array).forEach(System.out::print);
            }
            else{
                i++;
            }
        }
    }


}
