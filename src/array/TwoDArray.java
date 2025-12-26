package array;

import java.util.Arrays;

public class TwoDArray {

    public static void main (String [] args){

        int[][] twod = {{5,2}, {2,3}, {4,4}};

//        Arrays.sort(twod, (a, b)->  Integer.compare(a[0], b[0]));


        for(int k = 0; k< twod.length ; k++){
            for(int j= k+1; j< twod.length ; j++){
          if(twod[k][0] > twod[j][0]){
              int temp1 = twod[k][0];
              twod[k][0] = twod[j][0];
              twod[j][0] = temp1;
              int temp2 = twod[k][1];
              twod[k][1] = twod[j][1];
              twod[j][1] = temp2;
          }

            }
            System.out.println("-----");

        }

        System.out.println(Arrays.deepToString(twod));

    }
}
