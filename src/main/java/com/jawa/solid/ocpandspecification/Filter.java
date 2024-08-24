package com.jawa.solid.ocpandspecification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    public Stream<T> filterBySpec(List<T> items, Specification<T> spec);
}
