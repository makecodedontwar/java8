package study.java8.funcinterfaces;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;

        System.out.println(predicate.test(5));

        Consumer<Integer> consumer = x -> System.out.println(x);

        consumer.accept(10);

        Function<Integer, String> function = x -> x.toString();

        System.out.println(function.apply(10).getClass().getName());

        Supplier<Float> supplier = () -> new Float(10.2f);

        System.out.println(supplier.get());

        UnaryOperator<Integer> unaryOperator = x -> x * x;

        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;

        System.out.println(binaryOperator.apply(2, 5));

        Log<String> log = x -> System.out.println(x);
        log.log("asdf");
    }
}

interface Log<T> {
    void log(T t);
}
