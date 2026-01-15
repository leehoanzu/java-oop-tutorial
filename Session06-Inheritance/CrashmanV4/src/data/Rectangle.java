/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//1. thấy có IS A, extend
//2. Đặc didemr cho Con, đồng nhất (Cha lo hết) hoặc dị biệt, Con có riêng

//3. Phễu, tôn trọng bản sắc


//4.vì Cha là ABSTRACT, tức là chỉ có nói hoy, chưa làm, chung chung thoy
//  nên nếu con không chịu làm, tức là Con cũng chứa hàm ABSTRAXT, thì COn
//  trong tình huống này phải là ABSTRACT luôn
// 1 CLASS CHỨA HÀM ABSSTARCT K CODE, THÌ CLASS ĐÓ PHẢI LÀ ABSTRACT
// VÌ NÓ TOÀN NÓI ĐIỀU CHUNG CHUNG, DÙ TRONG NÓ VÀI HÀM CÓ CODE

//  Con thừa kế abstract class, m có 2 lựa chọn, k hơn
// ~ Hoặc m abstract, nếu m k chịu viết code cho Cha, thừa kế abstract
//                                              vậ là m là khái niệm luôn còn gì !!!
// ~ Hoặc m phải viết code cho hàm abstract của Cha, vì m đủ info để làm
//  m là cụ thể rồi, vì mói thứ trong máy là rõ ràng
//  CON VIẾT CODE CHO HÀM CHA. CHA NÓI CON LÀM, IMPLEMENT ABSTRACT METHODES
//  implement the body of PArent 'abstract methods
// cha đã nói ý tưởng, COn thực hiện thôi
//                                  làm biếng, m giống Cha abstract, đời Cháu tính...
//nếu k chịu làm tiếp, mãi mãi là nói k làm..-> hệ quả gì DÒNG HỌ
//VÔ SINH, K THỂ NEW ĐC 1 OBJECT TỪ CHA, CON LUÔN, VÌ CẢ 2 K ĐỦ CODE
// KO SINH ĐC OBJECT DO KHUÔN K HOÀN HẢO!!!!!!!!!!!!


public class  Rectangle extends Shape{
    
    protected double a, b;  ///kết hợp với phần làm biếng/extend từ Cha
                            //sẽ tái hợp đầy đủ như chưa có kế thừa

    public Rectangle(String owner, String color, String boderColor, double a, double b) {
        super(owner, color, boderColor); //Cha phải có trước, làm cánh chim
        this.a = a;                     //Con bay thật xa, extend, dễ bố trí RAM
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
    
    @Override
    public double getPerimeter() {
        return (a + b )* 2;
    }

//    @Override
//    public double getPerimeter() {
//        return ();
//    }
//    
//    @Override
//    public double getArea() {
//        return 0;
//    }
    
    @Override    
    public void paint() {
        System.out.printf("|RECTANGLE|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                            owner, color, boderColor,a, b, getArea());
    }
    
    
}
