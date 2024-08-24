package com.jawa.solid.ocpandspecification;

public class SizeSpecficiation implements Specification<Product> {
    public Size size;

    public SizeSpecficiation(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.size == this.size;
    }
}
