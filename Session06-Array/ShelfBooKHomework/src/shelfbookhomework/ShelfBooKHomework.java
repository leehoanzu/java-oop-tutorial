/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfbookhomework;

import books.Books;
import java.util.Scanner;
import shelfbook.ShelfBook;
import menu.Menu;

/**
 *
 * @author lehoa
 */
public class ShelfBooKHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //ShelfBook a = new ShelfBook ("homework", 5);
//        ShelfBook b = new ShelfBook ("homeworkV2", 6);
        //a.getInforBook();
//        b.getInforBook();
        //a.showBook();       
//        b.showInformBook();
//        while (true){ //sai chua tim ra   
//         Menu a;
//            a = new Menu(); //while true là sai nhá
                                //vì khi input trong menu xong
                                //a quay lại và được new mới 
                                //thế là có nội dung cũ đã mất
                                //còn nội dung mới chưa có !!!
//             a.menuBook();
//    }
        Menu a;
        a = new Menu();
        a.menuBook();

    }

}
