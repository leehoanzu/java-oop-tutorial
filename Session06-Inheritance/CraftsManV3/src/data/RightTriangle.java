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

//1.đọc đc câu Í A 1 chiều, TGV là 1 TG, extends

//2. khai báo đặc tính cho Con, nếu con giống Cha về các đặc điểm, để Cha lo
//   ko cần làm lại, khaio cần khai báo đặc điểm

//3. Phễu cho Con, tôn trọng bản sặc của Con
// TGV: o, c, 2 cạnh a b vuông
// TG:  o, c, a, b, c mâu thuẫn Cha Con
public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
        //                              TGV là 1 TG 3 cạnh, trong đó 2 cạnh V a b
                                                                        //cạnh huyền tính = căn của 
        //new TGV chính là new TG* 
        //cắt 1 TGV cũng chính là cắt 1 TG
    }
    
    @Override
    public void paint() {
        System.out.printf("|RIGHTTRIANGLE |%-15S|%-10S|%4.1f|%4.1f| - |%7.2f|\n", 
                                owner, color, a, b, getArea());
    }
    
}
