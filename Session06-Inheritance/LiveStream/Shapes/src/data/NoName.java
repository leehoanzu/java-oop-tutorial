/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lehoa
 */
public class NoName extends Shape{

    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
//      hình cắt bên WORD là hình duy nhất, S k thể có công thức, mà
        //là con số đo được = thước + tích phân
        //đảm bảo S là con số, còn tính theo cthuc hay đo đạc k ảnh hưởng
        //nếu bạn chế tạo khuôn, sẽ là công thức nhân bản
        //hình mình đang cắt là unique
        return 50; //giả bộ cho hình bên word
    }

    @Override
    public double getPerimeter() {
        return 40;
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

//NẾU TA LÀM RIÊNG 1 CÁI KHUÔN CHO 1 HÌNH CỤ THỂ K HÌNH DẠNG
//SAU NÀY TA NHÂN BẢN HÌNH NÀO CŨNG VÔ LÍ, CẮT NGẪU NHIÊN DIỆN TÍCH NGẪU NHIÊN
//CÔNG THỨC TÍNH K CÓ LUÔN
//NẾU CHỦ ĐỘNG LÀM CLASS CON THẾ NÀY, THÌ LẬP LẠI GIỐNG V, TR, CN
//CẦN CÓ CÔNG THỨC CHUNG CHO S, P, ĐỂ CÒN CLONE CÁC HÌNH

//BÊN WORD HÌNH ĐỘC ĐÁO, DUY NHẤT, K THỂ DÙNG KHUÔN RỜI NONAME ĐANG  LÀM ĐC
//TA SẼ CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE NEW TRỰC TIẾP HOY
//TRẢ RA S, P HARD-CODE ĐÚNG NGHĨA LÀ 1 HÌNH DUY NHẤT
//CHẾ KHUÔN CLASS DÀNH CHO NHÂN BẢN