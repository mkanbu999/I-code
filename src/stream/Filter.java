package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 3, 4, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 2, 3, 4, 4));
        list.addAll(list2);
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("hello", "world"),
                Arrays.asList("java", "streams"),
                Arrays.asList("flatMap", "example")
        );

       List<String> s= listOfLists.stream()
                        .flatMap(List::stream)
                                .collect(Collectors.toList());



        System.out.println(list2.stream().reduce(0, Integer::sum));

//        list.stream()
//                .sorted()
//                .forEach(System.out::print);

     /*     list.stream()
                .filter(n -> n > 2)
                .forEach(System.out::print);

        list.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        list.stream()
                .filter(n -> n > 2)
                .reduce(Integer::sum)
                .ifPresent(sum -> System.out.println("Sum: " + sum));

        int sum = list.stream()
                .reduce(0, Integer::sum);*/


//        List<String> words = Arrays.asList("hello", "world", "java", "streams");
     /*   words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        words.stream()
                .filter("hello"::equals)
                .forEach(System.out::println);
        long count = words.stream()
                  .filter(word -> word.equals("hello"))
                  .count();
       boolean hasHello= words.stream()
                .anyMatch("hello"::equals);

        String result = words.stream()
                .collect(Collectors.joining(", "));
        //       String result = String.join(", ", words);

        List<String> helloWords = words.stream()
                .filter(word -> word.equals("hello"))
                .collect(Collectors.toList()); */

//        List<List<String>> listOfLists = Arrays.asList(
//                Arrays.asList("hello", "world"),
//                Arrays.asList("java", "streams"),
//                Arrays.asList("flatMap", "example")
//        );
//
//        List<String> flattenedList = listOfLists.stream()
//                .flatMap(List::stream)
//                .toList();
//
//        List<String> filteredList = listOfLists.stream()
//                .flatMap(List::stream)
//                .filter(word -> word.equals("hello"))
//                .toList();
//        //[hello, hello]
//
//        List<String> filteredFlattenedList = listOfLists.stream()
//                .filter(innerList -> innerList.contains("hello"))
//                .flatMap(List::stream)
//                .toList();
    }
}
