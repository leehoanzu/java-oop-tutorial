/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import data.*; // .* tức là import hết tất cả các khuoonm trong ngăn tủ đó

/**
 *
 * @author lehoa
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sortShapes();
//        playWithAnonymousClass();
        sortShapesWithAnonymous();
    }

    public static void sortShapesWithAnonymous() {
        
        //Anonymous herere!!!
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                //CẮT HÌNH ngẫu nhiên, k đc goi là hình gì, S phải tự do
                return 50;
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n",
                            "TAKE-AWAY", owner, color, borderColor, " ", " ", getArea());
            }
        }; //VIP
                        
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGETA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "PINK", "MAGETA", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MAGETA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGETA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGETA", 9.0);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);
                    
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, onTheGo};
                                                            //HÌNH NNGAUA NHIÊN VẪN LA HÌNH

       
        System.out.println("The list of shapes");
        for (Shape x : arr) {            
            x.paint(); // tính đa hình            
        } 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; //đa hình nè: getArea() của cha
                    arr[i] = arr[j];    //Abstract, dừng lo, Con sẽ lo
                    arr[j] = tmp;       //          getArea() là cụ thể Con
                }
            }
        } 
        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            //x = arr[0], x = arr[i], x = arr[2]
            x.paint(); // tính đa hình            
        }
    }

    //kĩ thuật tạo object/vùng new mà k cần khuôn cụ thể
    //dành cho những object vô định hình, k có công thức để tính toán và
    //nhân bản, k có Khuôn cố định, cắt hình ngẫu nhiên, ÉO BIẾT CÓ NHÓM CON
    //NHƯNG VẪN CHẮC CHẮN LÀ HÌNH: CÓ NÉT, MNAUF, CẠNH, BỀ MẶT
    //ÉO CÓ CÔNG THỨC CHUNG, MNHAAN BẢN LẠI ĐƯỢC NHANH CHÓNG
    //HCN CẮT NHANH CHÓNG, HÌNH ELIPSE NHANH, HBH NHNAH,
    //HÌNH CẮT GẤP KHÚC, MỖI HÌNH DUY NHẤT, K NHNAH ĐƯỢC, K CÓ KHUÔN
    //OBJECT VÃNG LAI, K THƯỜNG QUEN SỬ DỤNG/LÀM/GẶP
    //DÙ LÀ HÌNH KIỂU GÌ, CÔNG THỨC CHUNG: NEW CHA/SUPER CHA + @OVERRIDE
    public static void playWithAnonymousClass() {

        //Shape vangLai = new NoName(...); //bên trong phải full code cho Cha
        //Shape x = new HCN(...); // //
        //CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO CẠNH ĐƯA VÀO???
        //CHỈ ĐƯA ĐC MÀU, TẶNG AI, TÔ MÀU VÀ TỰ DO S, LÀ ỔN, ÉO CÓ CÔNG THỨC
        //NẾU MÚN ROC RÀNG THÌ CẮT V, TR, CN, HBH, MŨI TÊN, ...
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
                return 50; //vì hình cụ thể, k theo hình dạng nào, ta tự do
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                //khai báo là Con của Shape vẫn kế thừa như bt;
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n",
                        owner, color, borderColor, getArea());
            }
        }; //VIP
        // mày là 1 hình, thoải mái vào mảng Shapr sort nếu mún
        //m vẫn là Shape, kiểu Shapr, có đủ codde cho hàm Cha
        //kĩ thuật mượn gió bẻ măng, mượn Cha tạo Con, mượn Shape new Con
        //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRIDE
        //THỎA CÔNG SỨC CỦA CON - NEW CHA + @OVERRIDE
        //CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECY ON THE GO, MÀ LÀM RIÊNG
        //LÀM KHUÔN CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN
        vangLai.paint();
    }

    public static void sortShapes() {
        //sort cần mảng, mảng chủ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGETA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "PINK", "MAGETA", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MAGETA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGETA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGETA", 9.0);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);

//        Shape arr[] = new Shape [7];
//        //arr[0] = new 1 hình cụ thể nào đó, new Rectangle(...) new Disl(..)
//        //cần lắm lun [i] lưu tọa độ vùng new()
//        //[i] tham chiếu vùng new, trỏ vùng new; lưu địa chỉ vùng new()
//        //vùng new() nằm đâu trong heap kệ nó
//        arr[0] = r1; //2 chàng 1 nàng
//        //arr[0].paint();
//        arr[1] = arr[0]  //3 chàng 1 nàng
//        arr[2] = d2; //t cần tọa độ vùng new Hình nào đó()
        //Shape arr[] = new Shape[] {các tọa đọ vùng new() đưa vô};
        //                              [i]
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2};
        //                          arr[0]

        Shape arr1[] = new Shape[]{new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0),
            new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0)};
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            //x = arr[0], x = arr[i], x = arr[2]
            x.paint(); // tính đa hình            
        } //GỌI HÀM PAINT() CỦA CHA, NHƯNG 3 CON TỰ ĐỘNG QUA MẶT
        //MỘT CHÚT LO LẮNG: PAINT() CỦA CHA ÉO CÓ CODE, ABSTRACT
        //ĐỪNG LO, VÌ LÁT HỒI MẤY CON TỰ LO, DO MÌNH NEW CON K HÀ
        //NEW CON ĐÃ VIẾT CODE RỒI, CHA NGỒI IM CON LO CHO
        //CON SẼ GIẢI QUYẾT CHYỆN HOÀN HẢO CHO CHA,
        //TỪ HÀM CHA GỌI, CON HƯỞNG ỨNG, N CON HƯỞNG ÚNG
        //TỪ 1 ÁNH XẠ RA NHIỀU CÁCH THỨC, TÍNH ĐA XẠ ĐA HÌNH POLYMORPHYSM

        //Sắp xếp tăng dần theo S
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; //đa hình nè: getArea() của cha
                    arr[i] = arr[j];    //Abstract, dừng lo, Con sẽ lo
                    arr[j] = tmp;       //          getArea() là cụ thể Con
                }
            }
        } //t đang trỏ 1 hình có S là ?
        //t arr[i] đang trỏ 2 hình có S là ?
        //So sánh 2 S có ổn k, k ổn thì đổi việc trỏ
        //thằng arr[i] phải trỏ mà thằng hình mà arr[i] đang trỏ
        //mày trỏ vào S mà k đúng thứ tự thì phải đổi trỏ

        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            //x = arr[0], x = arr[i], x = arr[2]
            x.paint(); // tính đa hình            
        }
    }
}
