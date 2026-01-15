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
//là khái niệm chung cho mọi loại hình nào đó: V, tr, CN, TG <HBH, ..
public abstract class Shape {

    protected String owner;
    protected String color;
    protected String borderColor;

    //cạnh a, b, c radius bk, rất vô duyên 
    
    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    //Hình nói chung sẽ có S, P. Vấn đề là tính thế nào? tùy hình mà chỉnh
    //k thể nói cụ thể lúc này được
    //S P là 1 khái niệm đề cập đến đặc tính và hình học nói chung
    //nó là chung chung, k cụ thể
    //cụ thể đề mỗi hình Tr, V, CN, HBBH, sẽ lo
    //nói về ý tưởng, gọi là abstract
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
}
