package org.example;

public class TriangleSimulator {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(10.0,20.0, new double[]{5,10,2});
        System.out.println(Triangle.numOfSides);
        System.out.println(tr1.getTriangleType());

        System.out.println(tr1.findArea());


    }
}
