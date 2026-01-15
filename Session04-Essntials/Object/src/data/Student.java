package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lehoa
 */
public class Student {
    private  String id; //instance variable
    public String name; 
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
    
   
    
    
    
}
