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
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;
    //k có dị biệt khác, muốn thì làm giống mèo

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    

    @Override
    public double run() {
        //Random rd = new Random(); gc thu gom luon
        return new Random().nextDouble() * MAX_SPEED; //MAX_SPEED là static nên xài chung
                                                //non static chơi với tất cả
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4s|%4.1f|\n",       
                                "DOG", name, yob, weight, " ",run());    
    }

    
}
