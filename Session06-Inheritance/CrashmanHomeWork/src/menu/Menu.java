/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import shape.RightTriangle;
import shape.Triangle;

/**
 *
 * @author lehoa
 */
public class Menu {

    private String color;
    private String owner;
    private Scanner sc = new Scanner(System.in);
    private Triangle norT[] = new Triangle[3]; //norT: normal Triangle
    private RightTriangle rightT[] = new RightTriangle[3]; //rightT: RightTriangle
    private int countNorT = 0, countRightT = 0;

    public Menu(String color, String owner) {
        this.color = color;
        this.owner = owner;
    }

    private int inputAnInteger() {
        int n; //tra ve gia tri nguyen vi la so luong cua sach
        do {
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input correctly!!!");
            }
        } while (true);
    }

    private double inputADouble() {

        double n; //tra ve gia tri nguyen vi la so luong cua sach
        do {
            try {
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input correctly!!!");
            }
        } while (true);
    }

    private void inputShapeTriangle() { // thể hiện tam giác thường
        double edge[] = new double[3];

        if (countNorT > 2) {
            System.out.println("full slot!!!");
            countNorT = 3;
        } 
        else {
            for (int i = 0; i < 3; i++) {
                System.out.printf("Please input the edge #%d: ", (i + 1));
                edge[i] = inputADouble();

            }
            norT[countNorT] = new Triangle(edge[0], edge[1], edge[2]);
            countNorT++;
        }

    }

    private void inputShapeRightTRiangle() { //thể hiện tam giác vuông
        double edge[] = new double[2];

        if (countRightT > 2) {
            System.out.println("full slot!!!");
            countRightT = 3;
        } else {
            for (int i = 0; i < 2; i++) {
                System.out.printf("Please input the edge #%d: ", (i + 1));
                edge[i] = inputADouble();
            }
            rightT[countRightT] = new RightTriangle(edge[0], edge[1]);
            countRightT++;
        }

    }

    private void showShapeTriangle() { //show ra tam giác thường
//        for (Triangle x : norT) { //full hết mảng 
//                                    //chết con mẹ m rồi !!!
//            x.shape();
//        }
        for (int i = 0; i < countNorT; i++) {
            norT[i].shape(i);
        }
    }

    private void showShapeRightTriangle() { //show ra tam giác vuông
//        for (RightTriangle x : rightT) { //dull mảng là sai ròi
//            x.shape();
//        }
        for (int i = 0; i < countRightT; i++) {
            rightT[i].shape(i);
        }
    }

    private void sortTriangle() { //sắp xếp lại dùng interchange sort
        for (int i = 0; i < norT.length - 1; i++) {
            for (int j = 1; j < norT.length; j++) {
                if (norT[i].calArea() > norT[j].calArea()) {
                    Triangle t = norT[i];
                    norT[i] = norT[j];
                    norT[j] = t;
                }
            }
        }
    }

    private void sortRightTriangle() {
        for (int i = 0; i < rightT.length - 1; i++) {
            for (int j = 1; j < rightT.length; j++) {
                if (rightT[i].calArea() > rightT[j].calArea()) {
                    RightTriangle t = rightT[i];
                    rightT[i] = rightT[j];
                    rightT[j] = t;
                }
            }
        }
    }

    public void createMenu() {
//        Menu a = new Menu("PINK", "Be Na");
        int n = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. input triangle");
            System.out.println("2. input right triangle");
            System.out.println("3. show triangle");
            System.out.println("4. show right triangle");
            System.out.println("5. sort triangle");
            System.out.println("6. sort right triangle");
            System.out.println("7. quit");
            System.out.print("Please choose option: ");
            n = inputAnInteger();
            switch (n) {
                case 1:
                    inputShapeTriangle();
                    break;
                case 2:
                    inputShapeRightTRiangle();
                    break;
                case 3:
                    showShapeTriangle();
                    break;
                case 4:
                    showShapeRightTriangle();
                    break;
                case 5:
                    sortTriangle();
                    System.out.println("Done!");
                    break;
                case 6:
                    sortRightTriangle();
                    System.out.println("Done!");
                    break;
                case 7:
                    System.out.println("See you soon");
                    break;
                default:
                    break;
            }
        } while (n != 7);

    }
}
