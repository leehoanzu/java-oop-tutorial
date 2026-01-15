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
public class Disk extends Shape{
    
    public static final double PI = 3.14;
    private String smile; //dị biệt cho Con
    private double radius;
    //owner, color, boder lấy từ Cha, Cha giữ giùm, những điểm chung anh em

    public Disk(String owner, String color, String boderColor, String smile, double radius) {
        super(owner, color, boderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public String getSmile() {
        return smile;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "smile=" + smile + ", radius=" + radius + '}';
    }
    
    @Override
    public double getArea() {
        return Disk.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {      
        return 2 * Disk.PI;
    }  
    
    @Override
    public void paint() {      
        System.out.printf("|DISK    |%-10s|%-10s|%-10s|%-10s|%4.1f|%7.2f|\n",
                    owner, color, boderColor, smile, radius, getArea());
    }  
}
