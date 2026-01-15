/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author lehoa
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputProfile();
        inputProfileXinSO();
    }

    public static void inputProfileXinSO() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) { //cuộc chiến vô cùng
            try {

                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {

                System.out.println("Do ku now to input a positive number: ?");

            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile: ");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc đinh JVM j sẽ giết app nếu có cả cà chớn xảy rả để đảm bảo an toàn cho app, xử lí data
        //đưa cho t 1 cơ chết tự xử khi có cà chớn, chuyên ngành giết chóc cho mình
        //báo jvm biết đừng giết, t tự xử, nhốt các lệnh cà chớn lại, SANDBOX
        try {
            //lệnh cà chớn nằm here
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            //nextLine() hốt sạch buffer, loại bỏ entrer, còn chuỗi số -> số
            //alt-shift-f
        } catch (Exception e) {
            //cpu sẽ chạy đến chổ này, khi có cà chớn xảy ra
            //jvm k giết app như truyền thống
            //chổ này là chổ xử lí hậu quả cà chớn
            //k có cà chớn thì k vào đây
            //e chính là lá thư/message màu đổ jvm gửi cho mình báo rằng có lỗi cà chớn nè
            //Làm gì thì làm
            //Exception e = new Exception(nội dung màu đỏ đây nè..);
            //về lí: e.xem lỗi, xử lí tự mình
            //về toán hóa, mình chỉ tập trung phần xửu lí lỗi, biết thừa éo goc đúng đắn mimnhf sẽ

            //xử lí sao???  nhiều cách: default value
            //                          hay: bắt nhập nlaij, number: login/usể name
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile: ");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

}
