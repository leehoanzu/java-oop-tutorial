/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author lehoa
 */
public class Triangle {

    protected double edgeA, edgeB;
    private double  edgeC;
    protected int lengthArr;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        
    }

    public double getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }

    private double calPerimeter() {
        double p;
        p = (edgeA + edgeB + edgeC) / 2;      //hệ thức Heron     
        return p;
    }
    
    public double calArea() { //phải public để lát so sánh kết quả, sắp xếp theo S
                                //dùng return để reuse lại dễ dàng
        double a, p;
        p = calPerimeter();
        a = Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
        return a;
    }
    
    public void shape(int n) { //in ra giá trị đã đổ từ phểu
        System.out.printf("|TRIANGLE|#%4d|a: %4.2f|b: %4.2f|c: %4.2f|s: %4.2f|\n", (n + 1), edgeA, edgeB, edgeC, calArea());
    }
    
    
}
