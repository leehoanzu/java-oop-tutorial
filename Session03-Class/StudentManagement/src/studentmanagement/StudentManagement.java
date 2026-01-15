/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author lehoa
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        saveAStudent();

//        inputAStudent();
        saveAStudents();
        
        }
    
    
    //nhập từ bàn phím
    //cần Scanner object bàn phím, OOP cái gì cx object, class
    //Máy cam, Scanner tiệm photo, WC, Bàn phím cơ, Touchpad -> nhóm Quét-Dữ_liệu đưa
    //vào máy tính, Class Scanner xuất hiện. Xài phải new để cho nó hành xử
    //từ bán phím đi vào ram, do đó phải có biến hứng value
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input id: ");
        id = sc.nextLine();
        
        System.out.println("Input name: "); //chuỗi trước số k bị lạc trôi lện
        name = sc.nextLine();
        
        System.out.println("Input yob: ");
        yob = sc.nextInt();
        
        System.out.println("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        
        //x.setId(id); //nguy hiểm
        
    }
    
    //hard-code 
    public static void saveAStudents(){
        //Student cuong = new Student("SE666666", "CƯỜNG VÕ", 1996, 6.6);
        
        
        Student an = new Student("SE667789", "An Nguyễn", 1999, 8.9);
        Student binh = new Student("SE667204", "BÌNH LÊ", 2004, 0.4);
        
        
        an.showProfile();
        binh.showProfile();
        
        
        //chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("An name (directly): " + an.name); //y chang cầu thủ dán tên sau lưng
        System.out.println("An name (directly): " + an.getName());
        
        
        //vì sờ được trực tiếp cái name/biến/instance variable, ta có thể get()cà set()
        //an.name = "KHÔNG HỌC BÀI";
        
        Student.name = "Cày rank hơn cày code";
        
        System.out.println("Bình name (directly): " + binh.name);
        System.out.println("An name again (directly): " + an.name);
 
        System.out.println("Student name again (directly): " + Student.name);
        
        an.showProfile();
        //cuong.showProfile();
        
        //sayHi() mà sayHi() đang là static
        System.out.println("Using static");
        an.sayHi(); //k tư hữu theo kiểu của riêng mình cho static
        binh.sayHi();
        Student.sayHi();  //Tên Class chấm static vì là đồ chung multiple objects
        
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức là chạm vào  STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                  đồ của riêng từng object
        
        
        //làm thêm cho biết hoi
        //Student.sayHiV2();        
        Student.SayHiV2 nestedObject = new Student.SayHiV2();
        nestedObject.display();
        Student.SayHiV2.display(); //phải chung trạng thái static mới chấm trực tiếp được
        
    }
    
}


//STATIC ĂN THEO THẰNG CUỐI CÙNG