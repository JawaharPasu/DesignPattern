package com.jawa.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyListTest extends ArrayList<ValueContainer> {

    @Test
    void test() {
        ManyValues values = new ManyValues();
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        List<ValueContainer> lists = new ArrayList<>();
        lists.add(new SingleValue(2));

        MyList list = new MyList(lists);
        System.out.println(list.sum());

    }
}
