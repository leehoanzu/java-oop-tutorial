/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
/**
 *
 * @author lehoa
 */
public class BookV2 {
    
    private int price;
    private String brand;
    private double tag;
    
    public BookV2 (int price, String brand, double tag) {
         this.price = price;
         this.brand = brand;
         this.tag = tag;      
       
    }
    
    public void screen() {
        System.out.println("Your chosen book is " + brand);
        System.out.println("Its price is " + price);
        System.out.println("this book has tag: " + tag);        
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setProfile () {
        System.out.println("Please input your number change");
        
        Scanner value = new Scanner (System.in);
        price = value.nextInt();        
    }
    
    public String toString() {
        return String.format("|%-30s|%-4d|%-4.1f|",
                                    brand, price, tag);
    }
    
}
