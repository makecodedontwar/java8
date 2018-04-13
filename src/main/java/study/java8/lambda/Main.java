package study.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello");

        new Thread(runnable).start();

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 1, 3, -1, 3));

        System.out.println(list);

        list.sort((x, y) -> y - x);

        System.out.println(list);
    }
}
