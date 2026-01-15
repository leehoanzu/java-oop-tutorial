/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu.util;

import java.util.Scanner;

/**
 *
 * @author lehoa
 */
public class MyToys {
    
    //              const bên c, biến hằng số, k cho thay đổi value, ngoại trừ
    //lúc mới khai báo
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENTs = 500;
    private static Scanner sc = new Scanner(System.in);
    //dành nội bộ hoy
    
    
    //ta sẽ gặp 1 dạng nhập dữ liệu như sau, gặp hoài
    //nhập dài, rộng HCn, bk TR, a b c của YG, điểm thi các môn
    //nhập số; trôi lệnh, ngoài biên, cà chớn - try-catch, lặp bắt nhập lại
    //suy nghĩ tốt hơn: ta làm hàm nhập số, ói về số đã nhập, chặn hết mọi thứ
    
    //Double.parseDouble
    
                                            //errMsg, lower, upper 
    public static int getAnInteger(String inputMsg) { // 1     6
        int n; //nhập từ bán phím cần có chổ chứa     // 2000  2010
        
        
        do {
            try {
                System.out.print(inputMsg);
                //n = sc.nextInt(); // trôi lệnh
                n = Integer.parseInt(sc.nextLine());
                //if (lower upper)
                return n;
            } catch (Exception e) {
                System.out.println("Do ku how to input an integer?");
            }
            
        } while (true); //while (còn đúng) thì DO again
        
    }
    
    public static int getAnInteger() {
        int n; //nhập từ bán phím cần có chổ chứa
                
        do {
            try {
                System.out.print("Input an integer: ");
                //n = sc.nextInt(); // trôi lệnh
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do ku how to input an integer?");
            }
            
        } while (true); //while (còn đúng) thì DO again
        
    }

}
