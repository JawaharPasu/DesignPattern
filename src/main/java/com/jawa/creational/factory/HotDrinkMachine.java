package com.jawa.creational.factory;

import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class HotDrinkMachine {
    Map<String, HotDrinkFactory> namedFactories = new HashMap<>();

    public HotDrinkMachine() throws Exception{
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("").getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type: types) {
            namedFactories.put(
            type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance());
        }
    }

    public HotDrink makeDrink() throws Exception{
        System.out.println("Available Drinks: ");
        for (Map.Entry<String, HotDrinkFactory> entry: namedFactories.entrySet()) {
            System.out.println(entry.getKey());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s1,s2;
            int amount;
            System.out.println("Type in your drink ");
            if ((s1 = reader.readLine()) !=null
                    && namedFactories.containsKey(s1)) {
                System.out.println("Specify the quantity: ");
                s2 = reader.readLine();
                if (s2 != null && Integer.parseInt(s2)>0) {
                    return namedFactories.get(s1).prepare(s2);
                }
            } else {
                System.out.println("This is not what I make");
                break;
            }
        }
        return null;
    }
}
