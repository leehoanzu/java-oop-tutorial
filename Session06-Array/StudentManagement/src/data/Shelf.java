/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author lehoa
 */
public class Shelf {
    //đặc điểm cảu 1 cái tủ bất kì là gì: màu sơn:__; giá tiền: __; nhà sx:__

//số ngăn/không gian chứa đồ: __ các món đồ nhét vào, món đồ là object
//chứa nhiều đò, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng
    //ứng dụng của mảng, góp phần tạo dựng nên object khác
    //OOP: tìm các object, chúng phối hợp, trộn nhau
    private String color; // = "PINK"; //________
    private String label; //= ""; //tủ chén, tủ hồ sơ SE, IA, GD, Jp

    //biến được đưa value, lúc nào???ư
    //                          qua phễu (default trong suy nghĩ)
    //                          gắn trực tiếp lúc khai báo
    //chứa cái gì, chứa k gian để, thực ra đồ chưa có
    //              chưa có hồ sơ sinh viên
    private Student[] ds = new Student[300]; //ds[0] = new Student();
    //ds là biến má mì = cần value
    //      new sẵn 300 tương đương mua tủ 300l
    //      đặt hàng kích thước, dung tích size 500, 1000, 2000

    private Scanner sc = new Scanner(System.in);
    private int count = 0; //mới mua tủ về, số hồ sơ = 0
    //nhét thêm 1 hồ sơ thì count ++
    //chơi mảng chỉ for đến count
    //lưu trữ cách để đồ vào mảng, vào giỏ, để từ trái sang phải, tương đương
    //sắp xếp đổ vào tủ giỏ theo thứ tự gọn gàng
    //FOR ĐẾN COUNT

    //tui có không gian chứa info, tui sẽ giai quyết chuyện nhập xuất
    public Shelf(String color, String label) { //kích thước của tủ
        this.color = color;
        this.label = label;
        //ds = new Student[sỉze]; //linh hoat trong kích thước tut
    }

    //DATA + HÀM XỬ LÍ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ LÀ NON STATIC
    //NẾU K CÁC TRƯỜNG ĐH, BỘ MÔN XÀI CHUNG DSSV TOANG
    //ĐỒ ĐẠC, HÀNH XỬ PHẢI THUỘC VỀ OBJECCT
    public void inputAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student  #" + (count + 1) + "/" + ds.length);
        System.out.println("Input id: ");                                  //1 /300
        id = sc.nextLine();         //TODO: kieemt tra id trung
        //MyToys.get ...("SEXXXX");
        //Regular Expression kiểm tra chuỗi nhập đúng định dạng hay k
        System.out.println("Input name: ");
        name = sc.nextLine();                   //MyToys.ge...()
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine()); //MyToys.get...()
        System.out.println("Input gpa");
        gpa = Double.parseDouble(sc.nextLine());
        ds[count] = new Student(id, name, yob, gpa);
        count++; //siêu vip 
        System.out.println("Add student successfully");
    }

    public void printStudentList() {
        System.out.println("The Student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile(); //for hết là vỡ mặt     
            //vì mẹ kiếp, mảng OBJECT DEFAULT CÁC PHẦN TỬ LÀ NULL
            //HẠ CASCNH NƠI ANH, TRỎ ĐÁY RAM, NÀ ÉP ĐÁY
            //RAM CÓ CODE SHOWPROFILE() QUÁ ĐÁNG HOK?
            //VÙNG NEW STUDENT(...) THÌ MỚI CODE CHẠY
        }
    }

    public void searchAStudent() {
        //search là quét/duyệt/đi từ trái sang phải lôi cổ từng sv[i] ra
        //hỏi hắn mã số mày là mấy???
        //so sánh với mã số muốn tìm?? == mã số of sv[i] sv[i].getMS()
        //bảo tìm thấy, tìm hết hok thấy == bảo rằng not found
        //THUẬT TOÁN TRÂU BÒ/VÉT CẠN/TÁT CẠN
        System.out.println("Input the id that you want to search: ");
        String id = sc.nextLine(); //hoa thường à nha
        for (int i = 0; i < count; i++) { //đi đến chổ đổ cuối cùng heng
            if (ds[i].getId().equalsIgnoreCase(id) == true) {
                //tìm thấy tại vị trí [i]
                System.out.println("Student found!!! Here she/he is");
                ds[i].showProfile(); //in kết quả liền
                //ds[i]. update hồ sơ profile và xóa
                return;
                //tìm thấy thì dừng hàm luôn, k for gì nữa
            }
        }
        //sống sót here, sure, éo có thấy id cần tìm, nếu thấy dừng id sớm ở trên
        //đi hết for mà k thoát đc, bảo k thấy
        System.out.println("Student not found!!!");
        //dùng biến flag phất cờ nếu thấy và kp, if () in ra câu gì
    }
}
