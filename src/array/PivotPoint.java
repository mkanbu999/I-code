package array;

import java.util.Arrays;

public class PivotPoint {

    public static void main(String[] args) {

        int [] a = {1,1,1,3,1,7,1,2,2,2};
        int totalSum = Arrays.stream(a).sum();
        int leftSum  =0;


        for(int i = 0; i< a.length-1 ; i++){
            int rs = totalSum - leftSum - a[i];
                    if(rs == leftSum){
                        System.out.println(i);
                        break;
                    }
                    leftSum = leftSum + a[i];


        }

//        for(int i = 1; i< a.length-1 ; i++){
//
//            int left = findLeftSum(i, a);
//            int right = findRightSum(i, a);
//
//            if(left == right){
//                System.out.println(i);
//                break;
//            }
//            if(i == a.length-2){
//                System.out.println("No pivot");
//            }
//        }

    }

    private static int findRightSum(int i, int [] a) {
        int sum =0;
        for(int j = i+1; j<a.length; j++){

            sum = sum + a[j];

        }
        return sum;

    }

    private static int findLeftSum(int i,  int [] a) {


        int sum =0;
        for(int j = 0; j<i; j++){
            sum = sum + a[j];
        }
        return sum;
    }

}
