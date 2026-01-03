package problem;

import java.util.*;

public class Test {



        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            List<Object> list = List.of(1,2,List.of(1,2,3, List.of(1,2)));
            List<Integer> flatternList = new ArrayList<Integer>();

            flatter(list, flatternList);
        }
        public static void flatter(List<?> list, List<Integer> f){

            for(Object lis : list){
                if(lis instanceof Integer){

                    f.add((Integer) lis);
                }
                if(lis instanceof List<?>){

                    flatter((List<?>)lis,f);
                }
            }

        }


}
