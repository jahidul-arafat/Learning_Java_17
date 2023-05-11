package org.example;

import java.util.Arrays;

public class Triangle {
    // class attributes
    // Make sure this class attributes are not only accessible within the hosting class itself, but also from the other class
    // that's why avoid adding 'private' keyword in front of the 'static' keyword
    // make sure, the 'numOfSides' is final and cant be altered
    final static int numOfSides = 3; // is this class attribute really required?

    // instance attributes
    // make sure the instance attributes are not directly accessible
    // only accessible through getter() and setter()
    private double base, height;
    private double[] sides;

    // methods
    // constructor


    public Triangle(double base, double height, double[] sides) {
        this.base = base;
        this.height = height;
        this.sides = sides;
    }

    // custom methods
    // 01. Find the Area of the Triangle
    public double findArea(){
        return (this.base*this.height)/2;
    }

    // 02. Calculate Triangle Type
    public String getTriangleType(){
        if (isEquilateral()) return "Equilateral";
        else if (isIsoseles()) {
            return "Isoseles";
        }
        else return "Scalene";
    }

    // check if all three variables are same
    // a==b==c
    public boolean isEquilateral(){
        return this.sides[0]==this.sides[1] && this.sides[1]==this.sides[2];
    }

    // if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
    // check if exactly two sides are equal
    // hints: check if any two of three variables are same
    public boolean isIsoseles(){
        return  ((sides[0]==sides[1] && sides[1]!=sides[2]) ||
                (sides[0]==sides[2] && sides[2]!=sides[1]) ||
                (sides[1]==sides[2] && sides[2]!=sides[0]));

    }

    // getter and setter
    // base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // sides - array
    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }

    // toString
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", sides=" + Arrays.toString(sides) +
                '}';
    }
}
