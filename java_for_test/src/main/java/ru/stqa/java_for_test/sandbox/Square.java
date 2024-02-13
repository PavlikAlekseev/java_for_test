package ru.stqa.java_for_test.sandbox;

public class Square {

    public double l;

    // конструктор, который будет заполняться
    public Square(double l){
        this.l = l;
    }

    // метод площади квадрата (вместо функции в основном классе)
    public double area (){
        return this.l * this.l;
    }
}
