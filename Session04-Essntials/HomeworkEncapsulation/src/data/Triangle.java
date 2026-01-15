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
public class Triangle {
    private int length;
    private String color;
    private String name;
    
    public Triangle (int length, String color, String name) {
        //đổ chương trình đầu vào
        //hay còn gọi là cái phễu
        this.length = length;
        this.color = color;
        this.name = name;
    }
    
    public void showProfile () {
        System.out.printf("|your length is: %4d |color is: %-10s |name is: %-10s ", this.length, this.color, this.name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
