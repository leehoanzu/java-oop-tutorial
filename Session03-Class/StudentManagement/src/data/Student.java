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
public class Student {
    private static String id; //__  //nằm ở 1 vùng nhớ riêng, mà object nào cx xài ké, chung
    public static String name; //__ //vùng nhớ xài chung cho các object cùng class/nhóm
                                    //dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng đổ/gắn            
    //CHỐT HẠ K DÙNG STATIC CHO NHỮNG THỨ/ĐĐ/HÀM MÀ CỦA RIÊNG TỪNG OBJECT
    //tui có mã số, bạn có mã số, bạn kia có mã số, những đều riêng của mỗi đứa
    //chung đặc điểm, khác value, vậy phải có biến clone riêng - NON-STATIC
    
    public int yob; //___
    private double gpa; //grade point average   non-static
    //...

    public Student(String id, String iName, int yob, double gpa) {
        this.id = id;
        name = iName;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    } //hiếm khi đổi mã số, giống như môn DB key
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|\n",
                                id, name, yob, gpa);
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n",
                                id, name, yob, gpa);
        //System.out.println("By the way, my yob is " + yob);
        //NON-STATIC CHƠI VỚI NON- DĨ NHIÊN CÙNG OBJ, VÀ STATIC LUÔN, ĐỒ RIÊNG THÀNH CHUNHG
    }
    
    public int getAge() {
        return 2021 - yob;
    }
    
    public static void sayHi() {
        System.out.println("HI everyoine, my name is " + name);
        //System.out.println("By the way, my yob is " + yob); //sai vì k biết lấy yob của an hay bình (non-static
        //static chỉ chơi với static vì cùng khu vực, k chơi với non
                    //có quá trời yob đc clone biết lấy ai bỏ ai
        
    }
    
    
    //làm thêm hoi
    public static class SayHiV2 {
        public static void display () {
            System.out.println("HI everyoine, my name static class SayHiV2() is " + name);
        }
        
        //System.out.println("By the way, my yob is " + yob); //sai vì k biết lấy yob của an hay bình (non-static
        //static chỉ chơi với static vì cùng khu vực, k chơi với non
                    //có quá trời yob đc clone biết lấy ai bỏ ai
        
    }
}
