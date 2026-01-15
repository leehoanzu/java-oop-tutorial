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
//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại heng, ko có tự làm
//2. Khai báo các đặc điểm. Lưu ý:
//  2.1 Nếu con trùng hết với Cha, k cần làm lại, Cha sẽ làm cho
//      Giả sử Con cũng chỉ làm 2 tài sản (di truyền), k cần khai báo gì cả
//  2.2 Con có đồ riêng, làm riêng, giấu Ba, liệu rằng ba biết ko?
//  //biến dị
//3. làm phễu, giữ bản sắc cho Con, thỏa hiệp/đàm phán nếu cần
//
public class Child extends Parents {

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }

    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + "; asset2: " + assetTwo);
    }

    //hàm mới, hành động mới của Con, khác Cha, Cha k có
    //ngoài đời có, Con vào SG đi làm thêm, đi đánh game, đá banh, ...
    //tập thể mạo hiểm!!
    public void sayHi() { //gát với mọi người
        System.out.println("Hey, I am a rich kid");
    }
}
