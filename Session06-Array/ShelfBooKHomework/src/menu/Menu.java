/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import shelfbook.ShelfBook;

/**
 *
 * @author lehoa
 */
public class Menu {
    
    private Scanner sc = new Scanner(System.in);
    private ShelfBook books = new ShelfBook("doIt", 10);
    private int countV1 = 0;

    public int inputAInteger() {
        int n; //tra ve gia tri nguyen vi la so luong cua sach
        do {
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input correctly!!!");
            }
        } while (true);
        /*
            RegularExpression
            nên tim hieu them
         */
    }

    public void menuBook() {  //tam thoi chua lam     
        while (true) {
        System.out.println("Menu");
        System.out.println("1. Input value of book " + (countV1 + 1));
        System.out.println("2. Show a list information, you just have filled it");
        System.out.println("3. Do you want to add more book");
        System.out.println("4. Exit");
        System.out.println("Please choose option");
        int n = sc.nextInt();
        //choiceNumber(n);
        switch (n) {
            case 1:
                books.getInforBook();
                break;
            case 2:
                books.showBook();
                break;
            case 3:
                countV1++;
                //choiceNumber(1);
                break;
            case 4:
                countV1 = -1;
        }
    }
    }

//    public void choiceNumber(int n) {
//        
//    }
}
