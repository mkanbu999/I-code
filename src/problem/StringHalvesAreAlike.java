package problem;

public class StringHalvesAreAlike {
    public static void main(String[] args) {
        String a = "lkok";
        boolean result = StringHalvesAreAlike.check(a);

        System.out.println("************************" + result);

    }

    public static boolean check(String a){

        int count1 = 0, count2 = 0;

        for(int i = 0 ; i< a.length()/2 ; i++){

            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                count1 = count1 + 1;
            }

        }
        for(int i = a.length()/2 ; i< a.length() ; i++){

            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                count2 = count2 + 1;
            }

        }
        return count1 == count2;
    }
}
