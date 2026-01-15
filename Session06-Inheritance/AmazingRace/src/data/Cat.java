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
public class Cat extends Pet {
    public static final double MAX_SPEED = 50;
    
    
    private String ribbon; //ruy-băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);  //Mèo chính là 1 Pet
        this.ribbon = ribbon; //dứa con bay thật xa
        
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
       //trong cuộc soong có những "thứ - object" sinh ra cho mình mấy cái trỉ
       //ngẫu nhiên, như vậy chúng thuộc Nhóm/Khuôn ngẫu nhiên, class Ngẫu nhiên
       //jdk có sẵn cái khuôn này rồi, tên là ran dom
       //                                               ----Scanner----Math
       Random mayNgauNhien = new Random();
       double speed = mayNgauNhien.nextDouble() * MAX_SPEED; //trả cho mình con số
                       //trong khoảng (0...1)   * 50 gần 50
        return speed; //trả về tốc độ gần 50, hên xui random
    }

    @Override
    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4s|%4.1f|\n",
                                            name, yob, weight, ribbon, run());
    }
    
   
    
}
