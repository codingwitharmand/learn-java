package com.cwa.javadoc;

/**
 * Circle is a round shape
 *
 * Please see the {@link Shape} class for true identity
 * @author armandnjapou
 *
 */
public class Circle extends Shape {

    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * Constructor of super class
     * @param name
     */
    public Circle(String name) {
        super(name);
    }

    /**
     * Simple getter
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
