/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfbook;

import books.Books;
import java.util.Scanner;

/**
 *
 * @author lehoa
 */
public class ShelfBook { //noi luu tru mang sach

    private String name; //ten ke sach
    private int number;//so ke sach

    private Books novel[] = new Books[100]; //mang sach
    private Scanner sc = new Scanner(System.in); //nhap xuat du lieu ve novel
    private int count = 0;

    public ShelfBook(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void getInforBook() {
        String nameBook; //ten cua sach, k phai ten ke
        String id;
        int amount;
        double price;
        
        System.out.println("Welcome my Library!");
        System.out.println("Please input your name Novel numer " + (count + 1) + "/" + novel.length); //nhap ten
        nameBook = sc.nextLine();
        System.out.println("Please let me know the id book");
        id = sc.nextLine();
        System.out.println("How many books do you want");
        amount = inputAInteger("Please input the integer");
        System.out.println("How much money do you have for a book");
        price = inputADouble("Please input after dotting 5 digits");

        novel[count] = new Books(nameBook, id, amount, price);
        count++;
    }

    public void showBook() {
        if (count > 0) {
            novel[0].showInforBook();
        } else {
            System.out.println("No book information available!");
        }
    }

    private int inputAInteger(String msg) {
        int n; //tra ve gia tri nguyen vi la so luong cua sach
        do {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input correctly!!!");
            }
        } while (true);
    }

    private double inputADouble(String msg) {
        double n; //tra ve gia tri nguyen vi la so luong cua sach
        do {
            try {
                System.out.println(msg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input correctly!!!");
            }
        } while (true);
    }
}
