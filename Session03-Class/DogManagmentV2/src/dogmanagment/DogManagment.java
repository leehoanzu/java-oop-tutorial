
package dogmanagment;

import data.Dog;


public class DogManagment {

    
    public static void main(String[] args) {
        
        int yob = 2001;
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        //tui mún show toàn bộ info của tui, theo cách toString()
        //object có nhiều hành động
        System.out.println("Show all info by using toString () - a new bahavior");
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println("Nđ details: " + ngaoDa.toString());
        
        //hàm toString() rất đặc biệt, @Override
        //mục tiêu là show ra all of info đã đổ vào, hoặc chỉnh sửa
        //y chang như mở Setting trong phone xem phần info đt
        
        System.out.println("Play with toString - gọi thầm tên em");
        System.out.println(chiHu); //chiHu là biến object, lưu tọa độ vùng new
                                    //lý thuyết in ra địa chỉ
        System.out.println(ngaoDa); //goi tham ten em toString()
        
        //NẾU KHUÂN K CÓ HÀM TOSTRING () THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI (GỌI THẨM)
        //HAY GỌI TRỰC TIẾP, JVM, SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA
        //ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ;
    //    //HASH NUMBER(MÃ BĂM), NÊN TOÀN BỘ DATA THÀNH 1 CON SỐ, MDS, SHA-256..(THEO CHUẨN)
        
        //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age");
        //ngaoDa.getAge();
        System.out.println("NĐ age: " + ngaoDa.getAge());
        
//        int a = 100;
//        printf("a: %d\n", a); // -> 100 vùng ram primitive mấy, value mấy
//        printf("a address: %u\n", &a); //vùng ram mày ở đâu vậy, tọa độ, địa chỉ của m
//        int* p = &a; //p lưu tọa độ a, gọi là con trỏ, vì t nắm tọa độ nhà m
//        printf("p há value of %u\n", p); //-> địa chỉ a, 6M
//        printf("a has value of %d\n", *p); -> 100
        
    }
    
    
    
}

//code bên ngoài giống khuôn bị lủng
//ngoài đời: bạn (yob: 2001), tui (yob: 2001)
//ENCAPSULATION: TÍNH ĐỐNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM VÀ BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ (SỐNG) NÀO ĐÓ
