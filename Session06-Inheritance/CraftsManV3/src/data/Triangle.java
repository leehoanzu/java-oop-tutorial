/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lehoa
 */
public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c; //tách dòng okie (tương đương về role thì cùng dòng

    //nếu đưa 3 cạnh cà chớn thì sao???
    //tổng 2 cạnh bk phải lớn hơn cạnh kia, bắt buộc
    //có 3 cách xử lí: chặn nhập từ Scanner, trước khi đổ
    //                              default, m mà cà chớn m default
    //ném vào mặt mày có ngoại lệ, chủ động JVM giết app đi
    //kỹ thuật cấm neww=
    //int yob = sc.nextInt()
    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner=" + owner + ", color=" + color + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }   
    
    
    //toàn bộ các hàm + phễu ở trên quá quen
    //1 nhóm dev quyết định làm 1 thư viện class riêng giống Scanner, Math
    //và nó giúp ta loại bỏ hết đoạn code ở trên khi tạo class
    //chỉ gõ vài dòng là tui muốn có get(), set() là xong
    //khi F6, thư viện này tự động generate ra đoạn code nhàm chán ở chên
    //thư viện LOMBOK
    
    public double getPerimeter() {
        return a + b +c;
    }
    
    public double getArea() {
        //công thức Heron: sqrt(p * p(p - a) * );   p = (a + b + c) / 2
        double p = getPerimeter() / 2;
        
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public void paint() {
        System.out.printf("|TRIANGLE |%-15S|%-10S|%4.1f|%4.1f|%4.1f|%7.2f|\n", 
                                owner, color, a, b, c,  getArea());
    }
   
}
