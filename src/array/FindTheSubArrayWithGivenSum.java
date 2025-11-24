package array;

public class FindTheSubArrayWithGivenSum {
    public static void main (String[] args){

        int [] a = {1, 3,4};
        findSmallest(a);
    }

    private static void findSmallest(int [] arr ) {
        int n = arr.length;
        int max = 0;

     for(int i =0 ; i< arr.length ; i++){
         for(int j =i; j< arr.length ; j++){
             if(j == arr.length-1 && i == 0) continue;
             int localMzx= 0;
             for(int k =i ; k<= j ; k++){
                 System.out.print(" "+ arr[k]);
                 localMzx = localMzx + arr[k];
             }
             max = Math.max(max, localMzx);
             System.out.println("");
         }
     }
        System.out.println("***************"+ max);
    }
}
