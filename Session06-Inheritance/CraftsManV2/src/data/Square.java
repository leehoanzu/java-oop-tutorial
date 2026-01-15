

package data;



//HV là phiên bản đb của HCN, độ lại tí, độ lại 2 cạnh kề = nhau
//k mất đi bản sắc HCN 4 góc vuông
//HV là sự mở rộng, nâng cấp, đặc biệt hóa, phiên bản mới, sự điều
//chỉnh/thay đổi nhỏ từ HCN
//cách chế tạo khuôn mới từ Khuôn cữ, kế thừa, dùng lại, đứng trên vai..
//K PHẢI COPY&PASTE
//Phiên bản củ là mình làm các khuôn từ đầu, k kế thừa, sp chỏi nhau
//k cùng 1 nhà đc

//1. mới A extends cũ B:
//                      HCn khuôn gốc để độ: class cha, parent, super, base
//      HV                  kế thừa từ HCN:  class con, child, sub    , derived
//                                                              //biến hình, chế ra từ
                                                                //xuất phát từ
//2. Đặc điểm của Côn là gì?
//              vì HV là (phiên bản), HCN, nên nó sẽ có tất cả mọi thứ từ HCN
//                          tao là CN, tao phải có những HCN đang 
//K CẦN LÀM LẠI CÁC FIELD/INSTANCE VARS

//3. cần phễu , để đúc phiên bản mới, cần vật liệu đưa vào, gửi Cha giữ , đổ lên
//      cha, vì có mọi thứ từ Cha, phiên bản gốc
//  tôn trọng bản săc COn, COn HV, o, c, edge, only edge

//                      con đồng thời là pb HCN, o, c, w, 1
//code tự sinh ra nó sẽ căn theo phễu Cha, 4 tham số, để đổ được 4 tham số
//                              phễu CON phải 4, Chết, MẤT BẢN SẮC
//                                                                  EDGE
public class Square extends Rectangle {
    
                                            //trade-off
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge); //HV có cạnh edge là HCN 2 cạnh Edge Edge
    }   //~~~ new Rectangle(O, C, W, L);
    //new HV chính là new HCN
    //new HV chính là new 1 phiên bản HCN
    //cát 1 HV bản chất chính là cắt 1 HCN
    //          có color, own, cạnh -> HCN dưới dạng HV cũng là thế mà
    
//    private String owner;
//    private String color;
//    private double edge; 
    //VỀ  LÝ XONG KKHUOON VUÔNG, VÌ ĐỔ DATA NHƯ TRUYỀN THỐNG ,DÙNG LAI HẾT
    //K CẦN VIẾT LẠI CODE, K COPY & PAST
    //K CHỈNH SỬA DÂY CHUYỀN SX QUÁ NHIỀU, TẤT NHIÊN ĐANG CÙNG DÒNG SP, SERIES
//    public double getArea() {
//        //return edge * edge; //t éo in,return để re use nơi khác
//        return Math.pow(edge, 2); //edge^2
//    }
//    
//    public void paint() {
//        System.out.printf("|SQUARE   |%-15S|%-10S|%4.1f|  - |%7.2f|\n", 
//                                owner, color, edge, getArea());
//    }
    
    @Override  //DINH ĐẾN 1 KHÁI NIỆM GỌI LÀ TÍNH ĐA HÌNH, ĐA XẠ, ĐA KẾ THỪA
    //ĐA NHÂN CÁCH, ĐA SẮC THÁI, 50 SẮC THÁI, BIẾN HÌNH, TRANSFORMER
    //POLYMORPHISM
    //HIỆN TƯỢNG CON QUA MẶT CHA, THỂ HIỆN BẢN SẶC CỦA CON, CHA NGỒI IM ĐỂ CON
    //LÀM CHO, ĐỂ CON LÊN TIẾNG, CHA ĐỂ ĐÓ ĐI, VỜ NHƯ K THẤY CHA
    public void paint() {
        System.out.printf("|SQUARE|%-15S|%-10S|%4.1f| - |%7.2f|\n", 
                                owner, color, width, getArea());
    }
}
