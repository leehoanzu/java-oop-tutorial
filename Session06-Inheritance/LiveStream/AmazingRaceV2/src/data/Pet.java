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
//mua con Pet đi, k cụ thể, hỏi thêm con gì???vPet là absstrac
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weigth;  

    public Pet(String name, int yob, double weigth) {
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    
    public abstract double run();
    public abstract void showRecord();
}

