package com.home;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trial_streams {
    public static void main(String[] args) {

        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();
        IntStream.range(1,10).skip(5).forEach(System.out::print);
        System.out.println();

        System.out.println(IntStream.range(1,10).sum());
        System.out.println();

        Stream.of("Ava","Avari","Alberto").sorted()
                .findFirst().ifPresent(System.out::println);
        System.out.println();

        Stream.of("Ava","Avari","Alvari","Alberto").filter(x -> x.startsWith("Al")).
                sorted().forEach(System.out::println);
        System.out.println();



    }
}
