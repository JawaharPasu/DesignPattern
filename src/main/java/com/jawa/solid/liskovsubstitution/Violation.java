package com.jawa.solid.liskovsubstitution;

public class Violation {
    public static void calcArea(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);

        //width = 5
        // for square we get actual = 50, but computed is: 100
        System.out.println("actual is : " + width*10 +
                " but computed is : " + r.getArea());
    }
}
