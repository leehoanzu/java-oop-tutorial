 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lehoa
 */
public class Rectangle extends Shape{
    protected double a, b;

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                            "RECTANGLE",owner, color, borderColor, a, b, getArea());
    }

    
    
    
}
