package array;

public class PivotPoint {

    public static void main(String[] args) {

        int [] a = {1,2,3,6,2,4};

        for(int i = 1; i< a.length-1 ; i++){

            int left = findLeftSum(i, a);
            int right = findRightSum(i, a);

            if(left == right){
                System.out.println(i);
                break;
            }
            if(i == a.length-2){
                System.out.println("No pivot");
            }
        }

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
