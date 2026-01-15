/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Pet;

/**
 *
 * @author lehoa
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register();
    }

    public static void register() {
        
        Pet tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();
        
        Pet ngaoDa = new Dog("Ngáo ĐÁ", 2021, 50.5);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        beTo.showRecord();
        
        
        //run() đa hình
        //if [i].run() > [j].run() KHÓ VÌ MÓA, MỖI LẦN GỌI RUN() THẰNG I, J
        //LÀ KHÁC NHAU
        //BÀI KIA LÀ DIỆN TÍCH ĐIỂM TB CỐ ĐỊNH LÚC SORT, 2 FOR K ĐỎI S, ĐIỂM
        //BÀI NÀY CỨ GỌI TOM.RUN() TÊN CỐ DIDNGJ, NĂM SINH CỐ ĐỊNH
    }

}
