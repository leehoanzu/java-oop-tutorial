/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.main;

import java.util.Scanner;
import vu.util.MyToys;

/**
 *
 * @author lehoa
 */
public class Stage {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0; //cấm sửa
        System.out.println("PI again: " + MyToys.PI);
        int width = MyToys.getAnInteger("Vui long nhập chiều rộng:");
        int length = MyToys.getAnInteger("Please input the length of rectangle: ");
//        System.out.println("Vui long nhap chieu dai");
//        int length = Integer.parseInt(sc.nextLine());
        //int length = MyToys.getAnInteger();
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
    
}
