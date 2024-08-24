package com.jawa.solid.ocpandspecification;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {
    @Override
    public Stream<Product> filterBySpec(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
