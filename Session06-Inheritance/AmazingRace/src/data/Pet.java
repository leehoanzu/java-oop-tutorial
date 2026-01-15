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
public abstract class Pet {
    //chứa nhân tử ching của đám Con
    protected String name;
    protected int yob;
    protected double weight;
    //...còn vài cái nữa 

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //hành dộng của mỗi con thú cụ thể
    //hành động chạy của mỗi Con: hoàn toàn khác nhau về tốc độ
    //dáng chạy -> ngầm hiểu là xử lí khác nhau!!!
    //vậy chạy() là 1 ý tưởng chung chung mà loài Pet cần có
    //chạy() là 1 nthuws đi kèm Pet, cụ thể thế nào thì là tùy từng đứa
    //ABSTRACT METHOD, CÁI GÌ MÀ K CỤ THỂ KHI ĐỀ CẬP VỀ NÓ -> SURE CHUNG CHUNG
    //                      ABSTRACT
    
    public abstract double run();
    
    //mỗi đứa sẽ gáy, sủa thành tích theo kiểu khác nhau
    public abstract void showRecord(); //~~~ paint() showProfile();
    
    
}
