package problem;

public class IntegerPalintrome {
    public static void main(String[] args) {
        int a = 121;
        int b =  check(a);
//        System.out.println(b);
        if(a == b){
            System.out.println("its a palintrome");
        }
        else{
            System.out.println("not a palintrome");
        }

    }

    private static int check(int a) {
        int c = 0;
        while(a>0){
            int n = a%10 ;
            c = c * 10 + n;
            a = a/10;
        }
        return c;
    }
}
