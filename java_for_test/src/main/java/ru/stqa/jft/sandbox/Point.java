package ru.stqa.jft.sandbox;

public class Point {
   public double x;
   public double y;

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double distance() {
      return Math.sqrt((this.x * this.x) + (this.y * this.y));
   }

   public static void main(String[] args) {

      Point p = new Point(5, 6);

      System.out.println("Расстояние между двумя точками = " + p.distance());

   }
}
