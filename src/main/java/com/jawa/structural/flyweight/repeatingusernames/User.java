package com.jawa.structural.flyweight.repeatingusernames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Lets say we have users having repeated names
 * example : John smith, Jane smith. We can say smith is repeated
 * if we store the users individually it is going to take lot of space
 * We can use flyweight to not store repeated values
 */
public class User {
    /**
     * this variable is static and hence available to all objects of this class
     */
    static List<String> strings = new ArrayList<>();
    private int[] names;

    public User(String name) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int idx = strings.indexOf(s);
            if (idx != -1) return idx;
            else {
                strings.add(s);
                return strings.size()-1;
            }
        };
        names = Arrays.stream(name.split(" "))
                .mapToInt(s -> getOrAdd.apply(s))
                .toArray();

        String[] split = name.split("");
    }

    public String getName() {
        return Arrays.stream(names).mapToObj(i -> strings.get(i)).collect(Collectors.joining(" "));
    }
}
