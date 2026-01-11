package array;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistict {

    public static void main (String [] args){

        int a [] = {5,6,3,4,3,4};
        var map = new LinkedHashMap<Integer, Integer>();

        for(int i = 0; i<a.length; i++){

            if(map.containsKey(a[i])){
              var val =  map.get(a[i]);
              val = val + 1;
              map.put(a[i], val );
            }

            map.put(a[i], 1);
        }

      var ans =  map.entrySet()
                .stream()
                .filter(e-> e.getValue() < 2)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst().get();
        System.out.println(ans);
    }



}
