/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Student;



/**
 *
 * @author lehoa
 */
public class Stage {
    public static void main(String[] args) {
        //checkObjectV6();
        
        Student ahihi = checkObjectV8(); //ahihi lưu tọa độ của AN trong hàm ra ngoài
        ahihi.showProfile();
    }
    
    //hàm trả về 1 object hả thầy, KO
    //đọc chuẩn: hàm trả về 1 tọa độ của nào đí, vì trả được tọa nghĩa là
    //sờ được object, có tọa độ chấm là tới object
    
    //              Student x;
    public static Student checkObjectV8 (){ //--- Student x  = sẽ là 1 vùng new
               
       Student x; 
       
       x = new Student("SE667789", "An Nguyễn", 1999, 8.9);
               
       return x;    //Việt sub: x lưu tọa đọ vùng clone AN, hướng 6g
                    //thấy tọa độ đó cho tên hàm, tên hàm
        
    }
    
    public static void checkObjectV7 (){
               
       Student x; //khai báo biến, khai báo con trỏ, nhưng chua trổ ai;
       //t với m nói về thằng kia đi
       
//       int a:
//       a = 10;
       x = new Student("SE667789", "An Nguyễn", 1999, 8.9);
       //là nó đây mà
       //x = new () 
        
        
        
    }
    
    public static void checkObjectV6 (){
        
        //câu chuyện của sinh ra rồi chết non
        //câu chuyện vô danh tên gọi
        //object k thèm, k có tên gọi, cẫn hành xử được,
        
        
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        //           đã tương đương tọa độ rồi, thầy tọa đâu đi thtaayf
        //          thảy cho biến object nào đó giữ dum tọa độ
        //biến đóa mà chấm nghĩa là tọa độ chấm
        //vì biến có tọa độ từ new. CHỐT HA. NEW NắM TỌA ĐỘ
        //CHẤM LÀ VÀO TRONG TỌA ĐỘ XEM CO CAI GÌ
        
        new Student("SE667789", "An Nguyễn", 1999, 8.9).showProfile();
        //Anonymous
        //K THÈM Đặt tên object để giap tiếp, để object tự giao tiếp
        //object vô danh, anynomus object, object was create wihtout a name, a reference
        //XUẤT HIỆN XONG, GÁY XONG, KHÓC LUÔN, GARBAGE COLLECTOR PHÁT HIỆN K CON TRỎ
        //GIẾT, CLEAR
        //MUỐN REUSE LẠI VÙNG NEW, TỐI THIỂU 1 NHát 1 TÊN GỌI, 1 BIẾN OBJECT
        //ĐỂ CÒN CHẤM TIẾP
                
                
        Student x = an; // m là biến lưu tọa độ vùng new
        
        
        
        
    }
    
    public static void checkObjectV5 (){
        
        //câu chuyện 2 chàng 1 nàng
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        Student x = an; // m là biến lưu tọa độ vùng new
        
        an.showProfile();
        x.showProfile(); //backup tọa đọ new AN ở trên, thêm 1 con trot cùng , trùng
        //chứng minh 2 chàng trỏ đúng 1 nàng
        
        //chàng 1 tát, chàng 2 thấy
        an.setName("MÌNH CHƠI Ú TÌM HENG");
        //trong vùng clone new AN đã bị thay đỏi name thành MÌNH CHƠI...
        System.out.println("After TẮT");
        //hok thèm hỏi an, hỏi luôn x xem sao
        x.showProfile();
        
        //nhiều tên cùng tham chiếu 1 object:
        //tí, teog -> (MÌnh...)
        //Hoàng, gì, càm, đa cấp, cp -> (Tui)
        
        //cùng 1 tên ám chỉ nhiều object khác
        //sếp = ST
        //sếp = gã trả lương
        //THAY ĐỔI VALUE CỦA BIẾN
        
        //MỘT OBJECT CÓ NHIỀU NGƯỜI NGƯỚC NHÌN, THAM CHIẾU
        
    }

    
    public static void checkObjectV4 (){
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        Student x = an; // m là biến lưu tọa độ vùng new
                        // nếu t tự new như m, hok lẽ sai, ra vùng clone mới
        //int a = 10;
        //int b = a; // cho t value của m, t mún lấy value của m
                        
        //trước khi an trỏ tọa độ mới, backup tọa độ cũ là xong
        //luôn giữ lại được AN
        an = new Student("SE667788", "Lộc phát", 1998, 8.8);
        an.showProfile(); //LP
        x.showProfile(); //AN đã trở lại, backup tọa độ new vào 1bieesn khác cùng kiểu 
        //int a = 10; a = 100;
        
    }

    
    public static void checkObjectV3 (){
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        
        an = new Student("SE667788", "Lộc phát", 1998, 8.8);
        //con diều AN đứt dây
        //vì sợi dây nối với diều mới LP
        
        
        //an li dị vùng clone An, chuyển sang kết nối với LP
        //ống nhòm dòm sang chổ mới, con trỏ lưu tọa độ mới, biến tahy đỏi value
        //gần nhất
        // int a = 10; a = 100; hỏi a là mấy: 100

        //int a = 10; a = 100;
        //an là 1 biến object
        //tui cần lắm luôn tọa độ vùng new, vùng clone Student
        
        an.showProfile(); //LP (LỘC PHÁT)
        //mất toạ độ vùng clone AN;
        //vùng ram k có ai trỏ tới, thì điịnh kì khi chạy app, JVM(phần chạy // Windows)
        //sẽ kiểm soát app bạn) giết/clear vùng clone k có con trỏ
        //cờ hó chyaj ngoài đườnng k chủ, Exciter hốt
        //Cty MTDT, JVM có đoạn code, module giám sát HEAP, xem đứa nào mồ côi, k có con trỏ
        //giết ngay và luôn (độ trễ if any) -- free(con trỏ bên c chơi malloc())
        //giám sát này được gọi tên là Garbage Collector, người gom rác, CTMTDT
        System.gc(); //gom rác vùng HEAP
        
        //ngoài đời có gắn lại biến con trỏ, tên tắt cho thứ phức tạp
        //sếp = CS ST (....);
        //chết cha sếp kìa, sếp = (Ông, gã chấm lương cho mình, quyết iddnhj mình tăng tương hay )
        //tí = mày, tao ở nhà ba má gọi
        //tí = Ngô Thanh Vân & câu truyện trạng tí
        
    }

    
    public static void checkObjectV2 (){
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        
        Student an2 = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        an.setName("ai roi cung khac");
        
        an.showProfile();
        an2.showProfile();
        //một new 1 clone, 2sv khác nhau, 2 vùng ram khác nhau
        //
        
    }
    public static void checkObjectV1() {
        
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        // biến obj
        // biến đối tượng               OBJECT, INSTANCE, HIỆN THÂN, THỂ HIỆN.
        // obj variable
        // referecnce variable
        //"con trỏ"
        //                      1. NEW là clone vùng ram từ khuôn (static if any)
                                //2. gọi phễu đổ data vào vùng clone
                                //3. chốt laiij tọa độ vùng new thay cho ai đó giữ
                                //4. thảy cho biến object giữ
                                //
        
        an.showProfile();
        
        an = new Student ("SE66789", "ĐẠI GIA ", 2001, 9.9);
        an.showProfile();
        
        //mất tọa độ An Nguyễn rồi
        //mất tọa độ vùng RAM/object thì điều gì xảy ra
        
        //công ty mt, GARBAGE COLLECTOR, VÙNG RAM OBJECT k ai trổ sẽ bị thu hồi, object bị giết 
        //HEAP clear - free(con trổ bên c) vùng HEAP trả lại cho neww object mới
        
        System.gc();
        //HAI CHÀNG TRỎ/NHÌN 1 NÀNG
        //VỪA SINH RA KHÓC 1 TIẾNG RỒI CHẾT
        
        //sếp -> Ca sĩ Sơn Tùng
        //sếp -> người quyết định lương cho người đi làm thuê
        //tí -> m ở nhà, t ở nhà
        //tí -> Trạng Tí
        
        int a = 10;
        a = 100; //biến vì m thay đổi value
        //a bị biến đổi giá trị
        //a đc gọi là biến - variable
    }
}
