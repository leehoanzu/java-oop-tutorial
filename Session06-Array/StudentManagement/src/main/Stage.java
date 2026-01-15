/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Student;
import java.util.Scanner;
import data.Shelf;

/**
 *
 * @author lehoa
 */
public class Stage {

    public static void main(String[] args) {
        //chơi menu 1. Add ...; 2. Print...; 3. Search...; 4... 6. Quit
        //chờ người chơi chọn món 1 2 3 4 5 6 Ahihi - try-catch-do-while MyToys
        //if người dùng chọn 1 thi tu.add() 2 thi tu.print()v3...
        //chua xin chua ve, chua muon dung cuoc chơi, éo cho thoát - do-while/while
        Scanner sc = new Scanner(System.in);
        int choice; //lưu option lựa chọn menu gõ từ bàn phím
        Shelf tuSE = new Shelf("PINK", "se");

        do {
            printMenu();
            System.out.print("Input your choice(1..6): ");
            //choice = MyToys.get(".., 1 ,6");
            choice = Integer.parseInt(sc.nextLine());

            //if (choice == 1) == 2 == 3 == 4
            switch (choice) {
                case 1:
                    tuSE.inputAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("BYe bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1 to 6, plz!!!");
                    break;
            }
        } while (choice != 6); //còn chưa chọn 6 còn chiaw lặp lại.
        //còn đúng thì còn làm
        //đúng là chưa  == 6 thì cứ làm đi
        //chưa bằng 6 đúng hok, đúng hả, làm tiếp đi m

    }

        
    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functiion to play with");
        System.out.println("1. Add a student profile");
        System.out.println("2. print student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student"); //REMOVE hết sức cẩn thận
        //XÓA K HẲN LÀ XÓA, MÀ XÓA LÀ ẨN
        //CẤT CHỔ KHÁC DÀNH CHO NHU CẦU THỐNG KÊ
        //ĐÁNH DẤU (MAKER/FLAG/STATUS) ÉO XÓA THẬT
        System.out.println("6. Quit");
    }

    public static void testTu(String[] args) {
        // TODO code application logic here
        //inputStudentList();

        //NGON MENU VONG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH
        Shelf tuSE = new Shelf("PINK", "se");

        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR"); //2 cái tủ độc lập
        //2 tủ 2 góc tường

        tuSE.inputAStudent(); //1/300 giả bộ gọi menu add stiudent 2 lần
        tuSE.inputAStudent(); //2/300

        tuGD.inputAStudent(); //1/300

        //System.out.println(tuSE.getColor());
        tuSE.printStudentList();  //gọi menu in ds da nhap
        tuGD.printStudentList();
//        int arr[] = new int [5];
//        System.out.printf("%u\n", arr);
    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;

        System.out.println("How many studnts do you want to input? ");
        count = Integer.parseInt(sc.nextLine()); //sc.nextInt(); //MyToys.getAnInteger (???)
        Student arr[] = new Student[count];

        //for nhập 5 hồ sơ
        for (int i = 0; i < count; i++) {
            System.out.println("Input student  #" + (i + 1) + "/" + count);
            System.out.println("Input id: ");
            id = sc.nextLine();

            System.out.println("Input name: ");
            name = sc.nextLine();

            System.out.println("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.println("Input gpa");
            gpa = Double.parseDouble(sc.nextLine());

            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        //sort dăm ba dồ yêu, éo thèm làm vì đã làm
    }

}
