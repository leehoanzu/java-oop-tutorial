
package varnfun;

import java.util.Scanner;
//~ #include <stdio.h>

public class VarNFun {

    
    public static void main(String[] args) {
        playWithIntegers();
        //playWithVariables();
        //playWithDoubles();
        //playWhithCharacter();
        //playWithBooleans();
        
        int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
        
                            
        printIntegerList(n);    //truyền tham trị, pass by value
                                //value của hàm main() sẽ được đưa qua ngõ vào
                                //hard-code đầu vào, code cứng/cố định value/ literal
                                //hok mềm mại linh hoạt,
                                //linh hoạt: bạn muốn in đến mấy??? hỏi và nhập
                                
                                //OOP pass by reference - truyền tham chiếu
                                //                          con trỏ, địa chỉ
                                
    }
    
    public static int getAPositiveInteger(){
        int n;
        //nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lua, name.charAt()
        Scanner banPhimCuaToi = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = banPhimCuaToi.nextInt();       
                
        return n; //getAPositiveInteger() = n
    }
    
    //tui mún in n số tự nhiên tính từ 1
    //hien tuong 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
    //đầu vào, mà phải khác trên data type chứ k phải trên biến
    //printIntegerList(5L);
    //DC GỌI LÀ OVERLOAD/OVERLOADING = quá tài hàm
    //giống như: 5 ae trên 1 chiếc xe wave
    //vs. OVERRIDE
    //POLYMORPHISM -> ĐA HÌNH
    public static void printIntegerList(int n){
      //chỉ có thằng ngáo mới scanf(n) here!!! n đã có value khi xìa
      //body of funct. nghiền, trộn xử lí với đầu vào giả định sẽ đưa qua tên gọi
      //giải quyết trên công thức
        System.out.println("The list of " + n + " first integers");
        for (int i = 0; i < n; i++) 
            System.out.printf("%d ", i);
        System.out.println("\n");    
        //System.out.println(i + " ");
           
    }
    
    //in ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList(){
        System.out.println("The list of 100 first integers");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13...");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " " + "\n");
        }
    }
    
    public static void playWithBooleans(){
        //c: đúng 1, > 0, sai 0, int
        //java: đúng: true, sai: false, -> boolean
        boolean marriedStatus = true;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Ahihi");
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
        
    
    public static void playWhithCharacter(){
        //2 byte cho kiểu char hen, lưu bảng mã Unicode
        char m = '$'; 
        System.out.println("unit: " + m);
        //ten em thì sao? C: mảng các kí tự, k promitive nữa 
        //              chả name[] = "Ahihi"
        
        String name = "Hoàng Ngọc Trinh"; //loiaj data mới hoàn toàn
                                            //phức tạp, do gom n thư skhasc
                                            //object data type, học sớm hoy
        System.out.println("The first letter of my name is: " + name.charAt(0));
        System.out.println("My name as in lower case " + name.toLowerCase());
        //C; string.h -> strlwr()...
        
    }
    
    public static void playWithDoubles(){
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); //cam tuyet doi dung %lf
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
        
    }
    
    public static void playWithIntegers() {
        int n = 39; //mọi con số xuất hiện trong code goi la
                    //literal value
                    //số nguyên xuất hienj trong biến đợc mặc định là int
        System.out.println("n: " + n);
        
        long m = 3000000000L; //phan cách literal trong code cho dễ đọc
        System.out.println("m: " + m);
        
        int status = 0xFA; //hệ 16
        
        System.out.println("status: " + status);
        int phone = 010; //0 đứng trước được xem la hệ 8
        System.out.println("phone: " + phone);
       
    }
    
    //static chi choi voi static 
    public static void playWithVariables() {
        //Biến là 1 vùng ram được đặt tên, chiếm 1 số byte nhất định
        //dữ liệu/thonng tin ma nó sẽ chứa bên trong - data tye - hinh thuc dât
        //số, chữ, hình ảnh...
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức
        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong RAM 
        System.out.println("age: " + age); //~ printf("age: %d\n", age);
        int yob = 2002; //year of birth
        age = 2023 - yob;
        
        System.out.println("age: " + age);
        
        System.out.println("age by using transitive tech: " + (2023 - yob));
        
        System.out.printf("age by using %% as in C: %d", (2021 - yob));
        
        System.out.printf("age by using %% as in C: %d\n", (2021 - yob));
    } 
}
