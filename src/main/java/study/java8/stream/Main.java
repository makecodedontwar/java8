package study.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

        strings
                .forEach(System.out::println);

        System.out.println();

        strings
                .stream()
                .filter(e -> !e.endsWith("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        strings
                .stream()
                .sorted((x, y) -> y.compareTo(x))
                .forEach(System.out::println);


        Map<String, byte[]> collect = strings
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toMap((x -> x), (String::getBytes)));

        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(0, (acc, elm) -> acc + elm);

        System.out.println(reduce);
    }
}
