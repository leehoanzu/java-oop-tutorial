/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import data.*;
import java.util.Random;

/**
 *
 * @author lehoa
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        showRecords();
        showRecordsWithAnonymous();
    }
    
    public static void showRecordsWithAnonymous() {
        
        //đường đua đông vui, có nhiều racer, và có một con gì dó k nhìn rõ
        //bay theo, vật gì đó bay theo, tức là có tốc độ
        //mình k biết, k xác định được nhóm của nó là gì, chưa biết class gì
        //vì m muốn nhập hội, okie, chạy theo đi, chơi trò take-away
        //mượn gió bẻ măng, mượn pƯt để new object
        
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                               "xxx", name, yob, weight, run());
            }
        };
        
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);
        
        Pet racer[] =  new Pet[] { new Dog("CHIHUHU", 2021, 0.5),
                                new Dog("VÀNG ƠI", 1950, 10.0),
                                new Cat("TOM", 1960, 15.0),
                                new Cat("KITTY", 1990, 5.0),
                                new Hamster("JERRY", 1960, 0.5),
                                xx, ufo //object tạo ra từ ANO vẫn là Pet, vào
                               };       //mảng
        
        
        System.out.println("The record table");
        for (Pet x : racer) {
            //x = racer[0]
            x.showRecord();
        }
        
        //TẠI THỜI ĐIỂM NÀY VIẾT CODE THẾ NÀY, K SORT THÀNH TÍCH CHẠY ĐƯỢC
        for (int i = 0; i < racer.length; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    //tốc độ chạy sẽ bị thay đổi cho mỗi lần so sánh
                }   //S, P, GPA cố định, thoải mái gọi gét() getGPA() để
            }       //so sánh và đổi chổ
        }
    }
        
    
    
    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);
        
        Pet racer[] =  new Pet[] { new Dog("CHIHUHU", 2021, 0.5),
                                new Dog("VÀNG ƠI", 1950, 10.0),
                                new Cat("TOM", 1960, 15.0),
                                new Cat("KITTY", 1990, 5.0),
                                new Hamster("JERRY", 1960, 0.5),
                                xx
                               };
        
        //racer[0] = new Dog("  ", 0, 0);
        //phần tư mảng Pet thì phải là  gắn 1 con Pet nào đó, Cat, Dog, HT
        //gán = new DOg(..); [i] = cần tọa độ vùng new Con Nào Đó()
        //new Dog() ...: bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc
        //tọa độ vùng new đưa cho ai đó
        //đa hình quay trở lại
        //vì mảng Pet, moi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT
        //HOÀN TOÀN K ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        //CHA QUẤT ROI CHẠY ĐI CHÚNG MÀY,  THẾ LÀ 3 ĐỨA CON CHẠY THEO
        //TỐC ĐỘ RIÊNG CỦA CHÚNG, ĐA HÌNH CUẤT HIỆN, OVERRIDE QUA  MẶT CHA XH
        System.out.println("The record table");
        for (Pet x : racer) {
            //x = racer[0]
            x.showRecord();
        }
        
        //TẠI THỜI ĐIỂM NÀY VIẾT CODE THẾ NÀY, K SORT THÀNH TÍCH CHẠY ĐƯỢC
        for (int i = 0; i < racer.length; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    //da hình, hàm Cha nhưng chạy Con tương ứng: HT, D, C, ....               
                }   //mooix gọi run() để so sánh thì tốc độ sẽ khác
                //bài sv, Hình học, S cố định cho n lần gọi
                //điểm tb cố định cho đến khi cập nhật điểm mới
                //for hoài, getGPA(), getS() cố định nên ta bảo đc
                //bài AmazingRace bắt tụi nhỏ chạy 1 lượt để ghi nhận thành
                //tích, ta so sánh trên thành tích chạy này
            }
        }
    }      
    
}
