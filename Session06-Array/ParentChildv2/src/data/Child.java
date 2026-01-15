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
//  cON LÀM THÊM ĐƯỢC 1 LOẠI TÀI SẢN, thay vì ba chỉ có 2

//3. làm phễu, giữ bản sắc cho Con, thỏa hiệp/đàm phán nếu cần
//
public class Child extends Parents{

    private String assetThree; //Rectangle vs. Square(o, c, e)
                                //                      o, c, e, smile
    
    //  lí thuyết, Con có 3 thứ: a1, a2, a3, phễu phải dổ cả 3, kế thừa Cha giữ
    //  new Con chính là new Cha

    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo); //MUST BE 1ST STATEMENT
        this.assetThree = assetThree;
    }  //phải có Cha thì mới có không gian cho con mở rộng
        //BẮT BUỘC PHẢI NEW CHA TRƯỚC, MỚI EXTEND ĐC, CÓ THÊM CHỔ MỞ RỘNG
        //ĐỂ LƯU THÊM PHẦN KHÁC BIỆT    
        //BỐ TRÍ RAM CHO BA TRƯỚC, MỞ RỘNG CHO CON

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }

    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + 
                                    "; asset2: " + assetTwo +
                                    "; asset3: " + assetThree);
    }

    //hàm mới, hành động mới của Con, khác Cha, Cha k có
    //ngoài đời có, Con vào SG đi làm thêm, đi đánh game, đá banh, ...
    //tập thể mạo hiểm!!
    public void sayHi() { //gát với mọi người
        System.out.println("Hey, I am a rich kid");
        System.out.println("By the way, my 3rd asset is " + assetThree);
    }
    
}

//CON CÓ QUYỀN KHÁC TRÊNN] ĐĐ VÀ HÀNH VI VỚI CHA (NGOÀI KẾ THỪA,& OVERRIDE)
//DẤU CHẤM THÌ SAO
//KHAI CON NEW CON THÌ XỔ TẤT, ĐÃ BIẾT
//KHIA CHA NEW CON CHỈ XỔ CỦA CHA, K CHỊU XỔ PHẦN KHÁC BIỆT, DNAH NGHĨA
//NGƯỜI LỚN, PHẢI HÀNH XỬ NHƯ NGƯỜI LỚN
//MUỐN XỔ TẤT, KĨ THUẬT TỔ LÁI CON TRỎ
