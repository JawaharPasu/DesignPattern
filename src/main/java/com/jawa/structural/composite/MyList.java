package com.jawa.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {

    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum () {
        int sum = 0;
        for (Iterable valueContainer: this) {
            sum += (int) valueContainer.iterator().next();
        }

        return sum;
    }
}
