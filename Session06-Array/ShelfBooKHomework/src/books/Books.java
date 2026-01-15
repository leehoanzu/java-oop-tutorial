/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author lehoa
 */
public class Books {
    private String name; //static toang
    private String id;
    private int amount;
    private double price;

    public Books(String name, String id, int amount, double price) {
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.price = price;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInforBook () {
        System.out.printf("|%-20s|%-10s|%5d|%7.4f|\n", name, id, amount, price);
        
    }
   
        
    
}
