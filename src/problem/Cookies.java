package problem;

public class Cookies {
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {1,3};
        int result = Cookies.check(a, b);

        System.out.println("************************" + result);

    }

    public static int check( int [] a,  int [] b){

        int cookie = 0;
        int child = 0;

        while(cookie < a.length && child < b.length ){

            if ( a[cookie] >= b[child]){
                child++;
            }
            cookie++;
        }

     return child;
    }
}
