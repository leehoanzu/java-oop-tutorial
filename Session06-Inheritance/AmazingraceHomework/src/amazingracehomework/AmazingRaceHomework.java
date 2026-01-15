/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingracehomework;

import data.CatHomwwork;
import data.DogHomework;
import data.PetHomework;

/**
 *
 * @author lehoa
 */
public class AmazingRaceHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register();
    }

    public static void register() {
        CatHomwwork tom = new CatHomwwork("TOM", 1950, 10.5, "><");
        tom.showRecord();

        PetHomework kitty = new CatHomwwork("KITTY", 1990, 5.0, "><");
        ((CatHomwwork)kitty).showRecord();

        DogHomework ngaoDa = new DogHomework("Ngáo ĐÁ", 2021, 50.5);
        PetHomework beTo = new DogHomework("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        ((DogHomework)beTo).showRecord();
//        Pet tom = new Cat("TOM", 1950, 10.5, "><");
//        tom.showRecord();
//        
//        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
//        kitty.showRecord();
//        
//        Pet ngaoDa = new Dog("Ngáo ĐÁ", 2021, 50.5);
//        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
//        ngaoDa.showRecord();
//        beTo.showRecord();
        double temp[] = new double[4];

        PetHomework arr[] = new PetHomework[]{tom, kitty, ngaoDa, beTo};
        for (int i = 0; i < 4; i++) {
            temp[i] = arr[i].run();
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("the record of #%s is: %.1f\n", arr[i].getName(), temp[i]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                if (temp[i] > temp[j]) {
                    PetHomework t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    double tmp = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            arr[i].showRecord(temp[i]);
        }
//        for (int i = 0; i < 4; i++) {
//            System.out.printf("the rank of #%s \n", arr[i].getName());
//        }
        
        //run() đa hình
        //if [i].run() > [j].run() KHÓ VÌ MÓA, MỖI LẦN GỌI RUN() THẰNG I, J
        //LÀ KHÁC NHAU
        //BÀI KIA LÀ DIỆN TÍCH ĐIỂM TB CỐ ĐỊNH LÚC SORT, 2 FOR K ĐỎI S, ĐIỂM
        //BÀI NÀY CỨ GỌI TOM.RUN() TÊN CỐ DIDNGJ, NĂM SINH CỐ ĐỊNH
    }

}
