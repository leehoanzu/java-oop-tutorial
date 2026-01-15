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
public class Square {
    private String owner;
    private String color;
    private double edge; //2 canh cho hinh vuong la vai

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Square{owner=").append(owner);
        sb.append(", color=").append(color);
        sb.append(", edge=").append(edge);
        sb.append('}');
        return sb.toString();
    }
    
    public double getArea() {
        //return edge * edge; //t éo in,return để re use nơi khác
        return Math.pow(edge, 2); //edge^2
    }
    
    public void paint() {
        System.out.printf("|SQUARE   |%-15S|%-10S|%4.1f|  - |%7.2f|\n", 
                                owner, color, edge, getArea());
    }
}
