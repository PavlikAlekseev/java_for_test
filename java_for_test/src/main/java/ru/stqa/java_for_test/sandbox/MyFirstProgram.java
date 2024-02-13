package ru.stqa.java_for_test.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Pavlik");

        // создан объект типа Square
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        // создан объект типа Rectangle
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = "+ r.area());
    }

    // функция приветствия
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}
