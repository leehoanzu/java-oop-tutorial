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
//chơi thêm kế thừa, MOtor is a kind of Vehicle (abstarct class)

//MOTOR MUA VỀ ĐỂ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG, HÀM RUN()
//NHƯNG THẰNG TRÊN ĐƯỜNG THẮNG VỚ VAARN DO NÓ NẸT-PÔ, MÌNH KÉO TAY GA MẠNH HƠN
//BỐC ĐẦU, VỌT XE, TỐC ĐỘ PHẢI DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOÀI VIỆC MOTOR
//THÔNG THƯỜNG, TA CÒN LÀ ĐUA-THỦ NỮA, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
//GIA NHẬP HỘI ĐUA THOY, CHỈ ĐUA HOY
//TỚ CÒN LÀ 1 ĐUA-THỦ, K DÙNG TỪ KHÓA EXTENDS, XÀI TỪ LÀ 1 MEMBER CỦA
//                                                                  IMPLEMNETS
//                                                  TỚ THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐỐ
//IMPLEMENT ALL ABSTRACT METHODE BÊN CLB, CHỌN ĐI MUA MÀ KHÔNG CHỊU ĐUA SAO ĐƯỢC
//@OVERRIDE CHÍNH CHÚNG TA CỨ CÓ ĐẶC ĐIỂM HVI NHƯ BT
//CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HĐ CỦA CLB ĐÓ, @OVERRIDE HD ĐÓ
//TRONG TA CÓ NHIỀU HÀNH ĐỘNG VỚI TỪNG CLB THAM GIA, HỢP LÍ NGOÀI ĐỜI
//ĐI VỐI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO GIÁY
//VỀ LOGIC, TA CÓ THỂ THAM GIA N CLN, NHƯNG TA CHỈ CÓ 1 DÒNG HỌ
//TRONG JAVA, 1 CON TỐI ĐA 1 CHA, ĐƠN KẾ THỪA
//              1 CON THAM GIA N CLB, SẼ CÓ HĐ CYAR N CLB

//C++, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA!!!

public class Motor implements DeathRacer {
    public static final double MAX_SPEED = 180;
    
    private String model; //Exciter 2021, Winner 2020
    private String volume; //số phân khối 125.0 cm3
    private String vin;     //biển số, số khung, Vehicle Identifier Number

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    
    //hành vi của xe máy là chạy, có tốc độ dc ghi nhận
    
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }                           //chạy ngẫu nhiên và k quá 180 kmr
    
    //quay video và gáy tốc độ
    public void showRecord() {
         System.out.printf("|%-10s|%-15s|%8s|%11s|%5.1f|\n",
                              "MOTOR", model, volume, vin, run());
    }                                      //150.0cm3 //58f8-567.89 //180.0

    @Override
    public double runToDead() {
        //Chạy tốc độ cao, điing nonhgf, xiay nồng, đôn dên dên
        return run() * 3; //run() giả sử đc 150 x 3 đua đén chết còn gì
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-10s|%-15s|%8s|%11s|%5.1f|\n",
                              "MOTOR", model, volume, vin, runToDead());
    }
    
}
