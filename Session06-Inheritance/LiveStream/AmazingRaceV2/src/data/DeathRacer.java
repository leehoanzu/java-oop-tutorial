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
//CLB của những gã thích đua đến chết, gom những Class, Object mà có chung
//hành động đua, kcare chuyện gì khác
//CLB là nơi tập hợp những người chung tiếng nói, hành động, giao tiếp/INTERFACE
//CŨNG LÀ HÌNH THỨC GOM KHUÔN, GOM OBJECT PHÂN LOẠI VỀ CÁI GÌ ĐÓ, NHÓM GÌ ĐÓ
//LỎNG LẺO HƠN KẾ THỪA, K CARE ĐẶC ĐIỂM, DI TRUYỀN DD, CHUNG HÀNH ĐỘNG ÀO
//CHƠI CHUNG
//MOTOR, DOG,.... Í A MEMBER OF, Í A DEADRACER
//Anh em mình là STUDENT, SINH RA LÀ SV
//ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, CẦU THỦ, SÁT THỦ, ...GAME THỦ, ĐUA THỦ
//ANH EM MÌNH NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM
//1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HỘI NHÓM XÃ HỘI
//HỘI BÀ CON: DI TRUYEEFB VÀ KẾ THỪA
//HỘI XÃ HỘI: CÙNG NHAU CHIẾN, LÀN GÌ ĐI!!!

//CLV chỉ quan tâm hành động, trong dây chỉ chứa hành động
//CLB để anh em tự mình hành động theo cách của mình
//vào CLB tiếng anh mình speaking theo giọng của mình!!!
//đua thì đua theo cách của mình: lạng lách, tung mình trên yên xe
//cà chân chóng tóe lửa,...
//Interface CLB để mọi người tự chơi theo cách của mọi người - chơi - hđộng là abstract
//CHỈ NÓI NỘI QUY CLB THOU HENG, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI
//CHỐT HẠ: INTERFACE CHƯA HÀM ABSSTRACT
//k cần ghi ra từ khóa abstract ở cả tên của clb và ten hàm
//VÌ CLB HÀM Ý/ NGẦM HIỂU CHỈ CÓ NỌI QUY ĐỂ MỌI NGƯỜI THEO, NỘI QUY CHUBNG CHUNG
//ĐỂ MỌI NGƯỜI THOE - IMPLEMENT - NGẮM HIỂU INTERFACE LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG

//JDK SAU CHO PHÉP INTERFACE
public interface DeathRacer {
    
    //Phàm ai đã chọn nghê đua thủ, thì phải đua!!!
    //public abstract double runToDead(); //k can tu abstract
    public double runToDead(); 
    public void showHowToDead();  //gáy bằng tổ quốc ghi công!!!
    
}
