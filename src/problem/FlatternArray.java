package problem;
import java.util.*;
public class FlatternArray {


        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            List<Object> list = List.of(1,2,List.of(1,2,3, List.of(1,2)));
            List<Integer> flatternList = new ArrayList<Integer>();

            flatter(list, flatternList);
            flatternList.forEach(System.out::print);

        }
        public static void flatter(List<?> list, List<Integer> flatternList){
            for(Object obj : list){
                if(obj instanceof Integer){
                    flatternList.add((Integer)obj);
                }
                if( obj instanceof List<?>){
                    flatter((List<?>)obj, flatternList);
                }

            }
        }
}
