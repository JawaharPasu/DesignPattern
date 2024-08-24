package com.jawa.solid.ocpandspecification;

public class AndSpecification<T> implements Specification<T> {
    private Specification<T> left, right;

    public AndSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfied(T t) {
        return left.isSatisfied(t) && right.isSatisfied(t);
    }
}
