/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkencapsulation;

import data.Triangle;
import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author lehoa
 */
public class HomeworkEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputProfile();
    }
    
    public static void inputProfile () {
        Scanner myKeyboard = new Scanner(System.in);
        int length;
//        while (true) {
//            try {
//                System.out.println("Input your length: ");
//                length = Integer.parseInt(myKeyboard.nextLine());
//                break;
//            }
//            catch (Exception e){
//                System.out.println("Please inform correctly");
//            }          
//        }
        System.out.println("Input your length: ");
        length = Integer.parseInt(myKeyboard.nextLine());
        //lenght = myKeyboard.nextInt();
        
        System.out.println("Input your color: ");
        String color = myKeyboard.nextLine();
        
        System.out.println("Input your name: ");
        String name = myKeyboard.nextLine();  
        
        Triangle theFirst = new Triangle(length, color, name);
        theFirst.showProfile();
    }
    
}
