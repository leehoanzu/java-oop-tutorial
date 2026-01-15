/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craftsman;

import data.Disk;
import data.Rectangle;

import data.Rectangle;
import data.RightTriangle;
import data.Square;
import data.Triangle;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author lehoa
 */
public class CraftsMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        cutShapes();
        //sortShapes();
        //playWithChildClass();
        playWithTriangle();

    }
    
    public static void playWithTriangle() {
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint();
        
        //RightTriangle rt1 = new Triangle("Tía", "PINK", 3, 4, 5);
        //vớ vẩn nha
        //                      TGV là một HTG
        //chơi trò ngược đời, Cha là phiên bản cảu Con, TG là phiển bản V
        RightTriangle rt1 = new RightTriangle ("Má", "Pink", 6, 8);
        rt1.paint(); //mình chưa có paint() lấy của Cha mà xài
                    //XÀI TỪ CHA THÌ PHẢI NGHE LỜI CHA, THEO QUY TẮC CỦA CHA
                    //TRIANGLE ĐC IN RA
        //nếu con đã có paint() lây Con mà chạy
        
        //KHIA CHA  NEW CON -> ĐỒNG NGHĨA DÙNG KẾ THỪA CÁCH ĐỌC IS A
        Triangle rt2 = new RightTriangle("Bé Na", "RAINBOW", 6, 8);
        //          TG     được xem là, í a <---     HÌnh TGV
        //khio chấm thì hàm của ai, quna trọng là khai báo gì
        //tao xem neww] RT() là, gọi tên tắt là TG
        //rt2. xổ ta toàn là TG
        rt2.paint(); //PAINT() CỦA CHA, NHƯNG KHI CHẠY LẠI CHẠY CON
        //dù là dangh nghĩa XHA, nhưng con làm được, để Con lo cho
        //Cha ngồi im, Con qua mặt, ocn được ưu tiên khi Cha Con trùng hành động
    }
    
    public static void playWithChildClass() {
        Square s1 = new Square("TÍA" , "PINK", 6.0);
        s1.paint(); //k muốn núp bóng BA, mún có bản sắc, tui là HV (dĩ nhiên)
                                                            //Square kìa , m thề
                                                            //k phải Ba
        //vi diệu 1
        
        //vi diệu 2
    }
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINk", 1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[9];
        //9 biến Rect, rectArr[0] ... [8]
        //~~ lớp cps 30 ghế ngồi, nhưng chưa có bạn nào
        //recArr[i] = cần lắm luôn tọa độ vùng new/clone Student(...);
        //eo quan tâm new cũ mới,
        //chỉ quan tâm tọa độ new Rectangle
        rectArr[0] = r1; //2 chàng 1 nàng
        //chứng minh
//        rectArr[0].paint(); //TÍA
//        rectArr[0].setOwner("TÍA YÊU!!");;
//        
//        r1.paint(); //TÍA YÊU

        rectArr[1] = new Rectangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 1.0);
        
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0); //XÀI KẾ THỪA
        
        //hv làm sao ở chung mảng chữ nhật dc, VÀ NGUUOWCJ LẠI, VÀ CÒN TRÒN
        //CHÚNG TA K CÙNG HỆ, CÙNG LOẠI, LÀM SAO CHUNG MẢNG
        //MẢNG KHAI BÓA NHIỀU BIẾN CÙNG KIỂU, V, TR, CN KHÁC KIỂU K CHUNG MẢNG
        //K CHUNG MẢNG, K FOR TỰ ĐỌNG, K SORT CHUNG
        //SORT RIÊNG 3 MẢNG NÓI LÀM GÌ?
        
        //CẦN 1 MNAGR GÌ GÌ ĐÓ CHỨA VUÔNG, CN ,TR,... = FOR CÁI GÌ ĐÓ, ĐẢO CÁI GÌ ĐÓ
        
        
        System.out.println("The rectangle list before sorting");
//        for (Rectangle x : rectArr) {
//            x.paint(); // x = arr[i] x và [i] cùng trỏ vùng new Student ()            
//        } //cấm for hết mảng nếu chưa fill, CHỈ FOR ĐẾN CHỔ GÁN THẬT
//      for đến counut
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        for (int i = 0; i < 3 - 1; i++) {
            for (int j = 0; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }

        }
        System.out.println("The rectangle list after sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINk", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("MA", "PINK", 3.0);
        s1.paint();

        Disk d1 = new Disk("BE NA", "RAINBOW", "<3", 2.0);
        d1.paint();

    }

}
