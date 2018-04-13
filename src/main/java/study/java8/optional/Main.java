package study.java8.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = getO(false);

        System.out.println(optional.isPresent());
    }

    private static Optional<String> getO(boolean b) {
        return b ? Optional.of("Hello") : Optional.empty();
    }
}
