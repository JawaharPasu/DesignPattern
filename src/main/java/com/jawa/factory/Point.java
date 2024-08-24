package com.jawa.factory;

import java.util.Map;

public class Point {
    private double x, y;

    /**
     * THis is private constructor so that only accessible within the class
     * This can't be used outside the class
     *
     * @param x - x coordinate
     * @param y - y coordinate
     */
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory {
        /**
         * we use factory method to create cartesian point
         *
         * @param x
         * @param y
         * @return new Point() with cartesian corrdinates
         */
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        /**
         * we use factory method to create polar point
         *
         * @param rho
         * @param theta
         * @return new#{@link com.jawa.factory.Point#Point(double,double)} with polar corrdinates
         */
        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}
