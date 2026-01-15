/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagemnetv2;

import data.Cabinet;

/**
 *
 * @author lehoa
 */
public class StudentManagemnetV2 {

    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addStudent();
        se.addStudent();        
        se.printStudentList();
        
        se.updateAStudent();
        System.out.println("The student list after updating");
        se.printStudentList();
        
//        //search k thấy
//        se.searchAStudent();
//        //search thấy
//        se.searchAStudent();
    }
    
    
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//        System.out.println("INPUT SE STUDENT(S)");
//        se.addStudent(); //#1
//        
//        
//        System.out.println("INPUT IA STUDENT(S)");
//        ia.addStudent(); //#1
//        ia.addStudent(); //#2
//        
//        System.out.println("SE MAJOR");
//        se.printStudentList();
//        System.out.println("IA MAJOR");
//        ia.printStudentList();
//    }
    
    
    
}
