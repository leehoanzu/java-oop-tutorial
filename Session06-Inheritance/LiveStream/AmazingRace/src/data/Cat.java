/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author lehoa
 */
public class Cat extends Pet{
    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double run() {
        //Random rd = new Random(); //rd nắm tọa độ vùng new
                                    //trong vùng new này có hàm .nextDouble() quan trọng
        //return rd.nextDouble() * MAX_SPEED;
        return new Random().nextDouble() * MAX_SPEED;
        //      object k thèm đặt tên, cài vùng new 1 lần bỏ luôn
        //      CT MTDT, Garbage Collector, System.gc()
    }           // (0..1)           50 coi như được con số sát 50

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                            "CAT", name, yob, weight, run());
    }
    
}
