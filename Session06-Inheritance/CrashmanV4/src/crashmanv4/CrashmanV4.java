/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crashmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author lehoa
 */
public class CrashmanV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        playWithShapes();
        sortShapes();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGNETA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGNETA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "Magneta", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "Magneta", 8);
        Shape s3 = new Square("MÁ", "PINK", "Magneta", 9.0);
        //Hà Kiều Anh nhận là công chúa!!!
        
        Disk d1 = new Disk("MÁ", "rainbowm", "BORDEAUX", "<3", 6.0);
        Shape d2 = new Disk("MÁ", "rainbow", "BORDEAUX", ":X", 6.0);
        
        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BỎDEUAX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BỎDEUAX", 6, 8, 10);
        //TA CÓ THỂ KHAI BÁO 9 HÌNH NÀY ĐỀU LÀ shape, cực đẹp knhi nhìn đội hình
        //đồng nhất
        //IN KẾT QUẢ TRƯỚC KHI SORT DIỆN TÍCH
        r1.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CON, CON
        r2.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CHA, CON, OVERRIDE
        s1.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CON, CON
        s2.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CHA, CON CON QUA MẶT
        s3.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > ÔNG NỘI, CHÁU QUA MẶT
        d1.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CON, CON
        d2.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CHA, CON QUA MẶT
        t1.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CON, CON
        t2.paint(); //HÀM CỦA ???? CHẠY THẾ NÀO > CHA, CON QUA MẶT
        
        //PAINT() Ở ĐÂY CỰC HAY:
        //CHỈ CÓ 1 HÀM TÊN LÀ PAINT() NHƯNG CÓ ĐA DẠNG CÁCH VIẾT CODE
        //LÚC CHẠY ĐA DẠNG LUÔN, LÚC CHẠY TRÒN, CHỮ NHẬT, V, TG...
        //CÙNG HÀM CHA, ÔNG Nội tùy cách khioa báo, nhưng đám con biết
        //Override đúng lúc
        //từ 1 hàm paint() ánh xạ/chiều ra N cách viết code/implement khác nhau
        //thực thi (chạy) theo N cách khác nhau
        //từ 1 biến hóa ra nhiều, từ 1 có đa hình dạng, đa ánh xạ cách làm chạy
        //từ 1 biến hình transformer, đa nhân cách 50 sắc thái, từ 1 ra nhiều
        //KĨ THUẬT VIẾT CODE TỪ 1 HÀM MÀ CÓ N CÁCH CHẠY THỂ HIỆN KHÁC NHAU
        //KĨ THUẬT  NÀY ĐƯỢC GỌI LÀ TÍNH ĐA XẠ, ĐA HÌNH POLYMORPHISM
        
        //HAY HƠN NỮA NÀY, CHÚNG MÀY VÀO MẢNG GIÙM TAO ĐỂ TAO FOR, TAO SORT
        //MẢNG SHAPE AGAIN
        //Shape[] box = new Shape[9]; //9 biến Shape
        //box[0] box[1] ... là các biến Shape cần trỏ vùng new con mẹ gì đó
        //                                new Rectangle() new Disk() new Square() new Triangle()
        //box[0] = new Rectangle(owner, color, boderColor, 0, 0)
//        box[0] = r1; //2 chàng 1 nàng
//        box[1] = r2;
//        box[2] = d1;
        //...
         
        //Shape box[] = new Shape[]{new Disk(), new Rectangle, new Triangle};
        //                          box[0]          box[1]
        Shape box[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shapes");
        for (Shape x : box) {
            //x = box[0], x  = box[1], x = box[i]
            //x cùng trỏ vùng new mà box[i], new Rect() new Disk()...
            x.paint();
        }   //ĐA HÌNH SIÊU ĐẸP, 1 HÀM PAINT() CHA N CÁCH CHẠY
            //1 RA NHIỀU CÁCH THỰC THI, ĐA HÌNH ĐA XẠ PO;YMORPHYSM
            //CHA CHỈ NÓI PAINT() ANH EM NHÀO VÔ
            
            //SORT ĐC K??
            //if (box[i].getArea() > box[j].getArea())
                //có sợ k lấy đc S hay k? ÉO SỢ
                //ĐA HÌNH, GỌI HÀM CHA, NHƯNG CON CHẠY
                    //MÓA, HÀM S() P() ĐA HÌNH, CHA GỌI, CON QUA MẶT
        
        //sắp xếp hoy...
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGNETA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGNETA", "PINK", 5, 6);
        //((Rectangle)r2).getA(); //ham drift, dị biệt

        Disk d1 = new Disk("MÁ", "PINK", "MAGNETA", "<3", 6);
        Shape d2 = new Disk("MÁ", "MAGNETA", "PINK", ":X", 6);

        r1.paint(); //CON, RECTANGLE
        r2.paint(); //CHA, KHI chạy qua mặt cha, Rectangle
        d1.paint(); //COn, DISK
        d2.paint(); //cha, qua mặt cha, k care Cha nói chung, ưu tiên Con
        //code Cha k có ảnh hưởng

        //NEW CHA THÌ SAO THƯA THẦY, BÀN VỤ NÀY SAU, KHÓ!!!!
        //DO CODE K HOÀN HẢO, K ĐẦY ĐỦ
        //,PAINT() CHÍNH LÀ POLYMORPHISM, TÍNH ĐA XẠ ĐA HÌNH ĐÃ XUẤT HIỆN
    }

}
