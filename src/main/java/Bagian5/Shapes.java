/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagian5;

/**
 *
 * @author User
 */
import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape {
    public Square(int w){
        width = w;
    }
    public void area(){
        width = width*width;
        System.out.println(width);
    }
}

class Circle extends Shape {
    public Circle(int w){
        width = w;
    }
    public void area() {
        double areaCircle = (double)Math.PI*(int)width*(int)width;
        System.out.println(areaCircle);
    }
}


public class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
