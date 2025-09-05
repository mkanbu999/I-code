package problem;

public class StringPalintrome {
    public static void main(String[] args) {
        String a = "cac";
        String b =  check(a);
        System.out.println(b);
        if(a.equals(b)){
            System.out.println("its a palintrome");
        }
        else{
            System.out.println("not a palintrome");
        }

    }

    private static String check(String a) {
       String  j= "";
        for(int i =  a.length()-1; i>=0  ; i--){
            j+= a.charAt(i);
        }
//        String reversed = new StringBuilder(a).reverse().toString();
        return j;

    }

}
