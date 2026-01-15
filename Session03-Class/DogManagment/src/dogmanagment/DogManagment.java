
package dogmanagment;

import data.Dog;


public class DogManagment {

    
    public static void main(String[] args) {
        //lấy khuân Dog ra để bắt đầu đổ info
        //y chang làm căn cước: lấy thông tin, in lên thẻ, đổ mực
        //sau khi chờ khô, ta đc object thuộc nhóm vừa đúc
        //đặt tên gọi tắt object để dễ đàng nói chuyện, tham chiếu đến
        
        int yob = 2001;
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
    // biến/tên tắt    object
        //có object thì object sẽ biết làm gì đó, cờ hó niest sủa
        chiHu.bark();
        System.out.println(chiHu.toString());
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        //chuHU syar trở lại
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        
        //bark(); ?? đứa nào sủa z ????? ,k biết
        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA 
        
        System.out.println("After overweight");
        chiHu.setNewWeigth(5);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        
        System.out.println("Ngao YOB: " + ngaoDa.getYob());
        
        int n = 123456789;
        float f = n; // f is 1.23456792E8
        System.out.printf("%.1f\n", f);
    }
    
    //new xin vùng ram mới đủ chứa info của 1 thằng ban DOg se đc đúc, được gọi là data
    //có 2 vùng name dành cho 2 object
    //nd k đè name của CH
    
}

//code bên ngoài giống khuôn bị lủng
//ngoài đời: bạn (yob: 2001), tui (yob: 2001)
//ENCAPSULATION: TÍNH ĐỐNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM VÀ BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ (SỐNG) NÀO ĐÓ
