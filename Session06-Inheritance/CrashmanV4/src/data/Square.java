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
//Nên kế thừa ai???ư
//Shape: khai báo cạnh edge, phễu (super, éo cần thỏa hiệp, đảo thứ tự biến nếu muốn
//      get/set()
//BẮT BUOOCK PHẢI IMPLEMENTS

//Ngon: kế thừa mẹ nó Rectangle
//                              k cạnh, phễu thỏa hiệp tí, XONG, ÉO LÀM GÌ
//                              CÙNG LẮM LÀ SAUWR PAINT()
//                              Shape là ông nội, cây gia phả xuất hiện
public class Square extends Rectangle{

    public Square(String owner, String color, String boderColor, double edge) {
        super(owner, color, boderColor, edge, edge);
    }
    //DONE, K LÀM GÌ NỮA, HCN CÓ ĐỦ RỒI, OWNER KÌA, 2 EDGE BÊN CHA
    //MÀY MÚN IN KIỀU SQR THÌ M OVERRIDE BA GẦN M ĐI, HCN
    
    @Override
    public void paint() {
        System.out.printf("|SQUARE   |%-10s|%-10s|%-10s|%4.2f|%7.2f|\n",
                                    owner, color, boderColor, a, getArea());
    }
       
    
}
