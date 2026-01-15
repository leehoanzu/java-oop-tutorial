/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;

/**
 *
 * @author lehoa
 */
public class Cabinet {
    //Tủ sẽ có nhiều ngăn chưa nhiều món đồ. Ta xài mảng, ArrayList, Collection nói chung
    //để luu trũ nhiều đồ
    //từ từ các bạn sc đến nhập học, nộp hồ sơ, và ta cất vào ar
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    //làm biếng làm phểu luôn, mọi thứ sẽ là default, túi ttuwf từ đc Add()vô
    //mình k chơi tỏ fmua Tủ có sẵn luôn 1 cái túi, trong Túi có sẵn hồ sơ!!!
    //nếu mún làm, thì new sẵn túi bên ngoài, có sv sẵn đưa vòa trong tủ, okie
    
    //default/empty constructor. k làm gì cả
    public Cabinet() {
    }
    
    //hành động của cái Tủ là: thêm hs, tìm hss, sắp xếp hs, xóa hs, update hs
    public void addStudent() {
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile #" + (arr.size() + 1) + ": ");
        
        //DÙNG LẠI HÀM SEARCH ĐỂ KIỂM TRA COI ID HỒ SƠ SV MỚI LIỆU RẰNG CÓ CHƯA
        //CẤM TRÙNG ID = BÊN DÂTABASE GỌI LÀ PRIMARY KEY - KHÓA CHÍNH CẤM TRÙNG
        //TƯƠNG ĐƯƠNG ĐK MEMBER. LOGIN NAME, ACCCOUNT NAME CHỬI TRUNGG ÉO CHO ĐI TIẾP
        //CÒN TRÙNG LÀ CON CHỬI, ÉO CHO ĐI TIẾP - VONG LẶP
        System.out.println("Input Id: ");
        
        
        while (true) {
            id = sc.nextLine().trim().toUpperCase(); //cắt trắng dư, đổi qua Hoa
                            //String là obj, vùng new, học sau
            Student xxx = searchAStudent(id);
            if (xxx == null) //id đéo tồn tại trong giỏ, thoát, đi tiếp
                break;
            else
                System.out.println("Duplicated id. Try with another one!!!");
            //bad smell
        }
        
                            
        System.out.println("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
                //myToys
        
        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully");
        
    }
    
    public void printStudentList() {
        if(arr.isEmpty()) {
           System.out.println("The student is empty. Nothing to print");
            return; 
        }
        
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    //ta làm hàm tìm kiếm sv: đóng 2 mục đích
    //1. Phục vụ tính năng tìm sv theo id
    //2. Phục vụ thêm cho cái việc kiểm tra id có trùng hay k khi tạo mới
    // 1 hồ sơ sv
    //hàm search() có 2 cách trả về: trả về vị trí tìm thấy trong Túi/int pos
    //                                  trả về 1 object/toaoj độ của object/tham chiếu
    public Student searchAStudent(String id) {
        if(arr.isEmpty())
            return null;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return  arr.get(i);            
        } //nếu thấy sv, trả ngay cái thẻ thứ i tham chiếu vùng new có chứa id
        
        return null;
    }
    
    //hàm bao hàm search ở trên
    public void searchAStudent() {
        String keyword;
        System.out.println("Input the id of a student that you want to search: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if (xxx == null)
            System.out.println("NOT FOUND!!!");
        else {
            System.out.println("FOUND. HERE SHE/HE IS: ");
            xxx.showProfile();
        }
    }
    
    public void updateAStudent(Student x, double newGPA) {
        x.setGpa(newGPA);
    }
    
    public void updateAStudent(String id, double newGPA) {
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND! nOTHING To update");
            return;
        }
        //xxx.setGpa(newGPA);
        updateAStudent(xxx, newGPA);
        
    }
    
    public void updateAStudent() {
        String keyword;
        double newGpa; //chửi nhiều sv, giá tiền kiểu int
        System.out.println("Input the id of a student that you want to update info: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword); //Mytoys
        
        
        if (xxx == null)
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
        else {
             
            updateAStudent(xxx, newGpa);
        }
    }
}
    
//    public void updateAStudent() {
//        String keyword;
//        double newGpa; //chửi nhiều sv, giá tiền kiểu int
//        System.out.println("Input the id of a student that you want to update info: ");
//        keyword = sc.nextLine();
//        Student xxx = searchAStudent(keyword);
//        if (xxx == null)
//            System.out.println("NOT FOUND! NOTHING TO UPDATE");
//        else {
//            System.out.println("FOUND. HERE SHE/HE IS beafor updating  ");
//            xxx.showProfile();
//            System.out.print("Input a new gpa: ");
//            newGpa = Double.parseDouble(sc.nextLine()); //Mytoys
//            xxx.setGpa(newGpa);
//            System.out.println("The student profile after updating");
//            xxx.showProfile();
//        }
//    }

//CRUD - CREATE - RETRIVE/READ - UPDATE - DELETE