package com.home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Trial2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");
        map.put(3, "digitalocean.com");
        map.put(4, "aws.amazon.com");
        map.put(5, "aws2.amazon.com");
        List<Integer> integers = List.of(0, 1, 2);
        integers.stream()
                .peek(System.out::print)
                .limit(2)
                .forEach(i -> {
                });
        System.out.println("---------------------------------------\n");
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("---------------------------------------\n");
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
        String ss = messages.stream().map(String::toUpperCase).collect(Collectors.joining("->"));
        System.out.println("Filtered value: " + ss);
        //messages.forEach(word -> StringUtils.capitalize(word));
        messages.stream().sorted(String::compareTo);

/*        List<String> s = new ArrayList<>();
        List<String> b = new ArrayList<>();
        s.forEach(t -> {
            b = b + 1;
        });*/

    }
}
