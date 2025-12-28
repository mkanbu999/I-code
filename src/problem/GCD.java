package problem;

public class GCD {

    public static void main(String [] args) {
        int a[] = {2,8,16};
        int common =0;
        for(int i = 2; i<a[a.length-1] ; i++){
            for(int j = 0; j<a.length; j++ ){
                if(a[j]%i !=0){
                    break;
                }
                if(j == a.length-1 && a[a.length-1]%i == 0){
                    common = Math.max(i, common);
                }
            }
        }
        System.out.println(common);
    }
}
