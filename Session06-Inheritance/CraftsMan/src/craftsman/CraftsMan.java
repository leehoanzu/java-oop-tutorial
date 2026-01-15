
package craftsman;

import data.Disk;
import data.Rectangle;

import data.Rectangle;
import data.Square;
import static javafx.scene.paint.Color.color;


public class CraftsMan {
    
    public static void main(String[] args) {
//        cutShapes();
        sortShapes();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINk", 1.0, 2.0);
        
        Rectangle rectArr[] = new Rectangle[9];
        //9 biến Rect, rectArr[0] ... [8]
        //~~ lớp có 30 ghế ngồi, nhưng chưa có bạn nào
        //recArr[i] = cần lắm luôn tọa độ vùng new/clone Student(...);
        //eo quan tâm new cũ mới,
        //chỉ quan tâm tọa độ new Rectangle
        rectArr[0] = r1; //2 chàng 1 nàng
        //chứng minh
//        rectArr[0].paint(); //TÍA
//        rectArr[0].setOwner("TÍA YÊU!!");
//        
//        r1.paint(); //TÍA YÊU

        rectArr[1] = new Rectangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 1.0);
        
//        rectArr[3] = new Square("MA", "RAINBOW", 1.0); //XÀI KẾ THỪA
        //hv làm sao ở chung mảng chữ nhật dc, VÀ NGƯỢC LẠI, VÀ CÒN TRÒN
        //CHÚNG TA K CÙNG HỆ, CÙNG LOẠI, LÀM SAO CHUNG MẢNG
        //MẢNG KHAI BÓA NHIỀU BIẾN CÙNG KIỂU, V, TR, CN KHÁC KIỂU K CHUNG MẢNG
        //K CHUNG MẢNG, K FOR TỰ ĐỌNG, K SORT CHUNG
        //SORT RIÊNG 3 MẢNG NÓI LÀM GÌ?
        
        //CẦN 1 MANAGER GÌ GÌ ĐÓ CHỨA VUÔNG, CN ,TR,... = FOR CÁI GÌ ĐÓ, ĐẢO CÁI GÌ ĐÓ
        
        
        System.out.println("The rectangle list before sorting");
//        for (Rectangle x : rectArr) {
//            x.paint(); // x = arr[i] x và [i] cùng trỏ vùng new Student ()            
//        } //cấm for hết mảng nếu chưa fill, CHỈ FOR ĐẾN CHỔ GÁN THẬT
//      for đến count
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
