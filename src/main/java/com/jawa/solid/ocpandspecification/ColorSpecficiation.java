package com.jawa.solid.ocpandspecification;

public class ColorSpecficiation implements Specification<Product> {
    private Color color;

    public ColorSpecficiation(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.color == this.color;
    }
}
