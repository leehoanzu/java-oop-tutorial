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
//Dog ngoan ngoãn ban ngyaf, tối chủ đi ngủ, nó trốn nhà đi hoang
//đi đua thì nó phải chạy vượt tốc độ bình thường, runToDead()như mọi đua thủ
//Mình vẫn là Con Cháu dong hẹ Lê, Phạm, học như bt, SV,
//nhưng còn tham gia CLB đua thủ phhuowtj, CLB gì đó, thì phải có hđ của clb đó
//IMPLEMENT ALL ABTRACT METHODES, NỘI QUY CLB, @OVERRIDE
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                            "DOG", name, yob, weigth, run());

    }

    //PHẦN HOANG DÃ TRONG TA, BỘC LỘ KHI DI ĐUA
    //TỤI M, SV, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    //VÀO SG, CHẮC CHẮN THÊM PHẦN BỘC LỘ KHÁC: NHẬU NHẸT, GAME, CÁ ĐỘ, ĐÁNH BÀI,...
    //                                                              CLB TA, PHƯỢT, TỪ THIỆN
    @Override
    public double runToDead() {
        return run() * 5; //chạy hơn 5 lần so bt
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%4d|%4.1f|%5.1f|\n",
                     "DOG-RACER", name, yob, weigth, runToDead());
    }    
    
}
