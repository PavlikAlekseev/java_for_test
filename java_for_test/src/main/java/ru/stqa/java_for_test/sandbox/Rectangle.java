package ru.stqa.java_for_test.sandbox;

public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // метод площади прямоугольника
    public double area (){
        return this.a * this.b;
    }
}
