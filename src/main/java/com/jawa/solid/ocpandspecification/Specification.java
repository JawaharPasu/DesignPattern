package com.jawa.solid.ocpandspecification;

public interface Specification<T> {
    public boolean isSatisfied(T t);
}
