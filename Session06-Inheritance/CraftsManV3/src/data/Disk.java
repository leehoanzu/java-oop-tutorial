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
public class Disk {
    public static final double PI = 3.1415;
    
    private String owner;
    private String color;
    private String smile; //:) :(
    private double radius;

    public Disk(String owner, String color, String smile, double radius) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disk{owner=").append(owner);
        sb.append(", color=").append(color);
        sb.append(", smile=").append(smile);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    public double getArea() {
        //return edge * edge; //t éo in,return để re use nơi khác
        //return 3.14 * radius * radius; 
        //return Math.PI * Math.pow(radius, 2);
        return Disk.PI * Math.pow(radius, 2);
    }
    
    public void paint() {
        System.out.printf("|BE NAU   |%-15s|%-10s|%-4s|%4.1f|%7.2f|\n", 
                                owner, color, smile, radius, getArea());
    }
}
