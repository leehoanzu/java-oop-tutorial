/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentchild;

import data.Child;
import data.Parents;
import javafx.scene.Parent;

/**
 *
 * @author lehoa
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithParentChild();
    }
    
    public static void playWithParentChild() {
        Parents p = new Parents("Biệt Thự", "1000BTC");
        p.showProfile();
        //KHAI CHA NEW CHA, chấm xổ ra gì??? xổ cái gì của Cha
        
        
        Child c1 = new Child("Nhà PHố", "100ETH", "DU THUYEN");
        c1.showProfile(); //nếu không làm riêng, đó là lúc sài lại của Ba
        //phải theo quy tắc của Cha
        //nếu muốn qua mặt, còi to cho vượt, hãy tự làm đi, @Override
        //KHAI CON = NEW CON, chấm xổ ra gì?? Khuôn Con có gì xổ đó
        //                      xổ tất cả  những gì Cha cho / thừa kế + xổ của riêng Con (@ + biến dị)
        
        
        //KHAI GÌ NEW NẤY, XỔ CÁI NẤY, CỔ TẤT CẢ CỦA KHUÔN MÀ TA KHAI BÁO
        c1.sayHi();
        
        Parents c2 = new Child("CĂN HỘ CAO CẤP", "DOGECOIN", "MOTOR");
        c2.showProfile();

        //c2.sayHi;
        //CHỈ XỔ RA NHỮNG GÌ CỦA Cha, ko xổ của riêng Con
        //riêng Con có 2 thứ: @ và khác biệt hoàn toàn
        //nếu Con có trùng Cha tên hàm, vẫn gọi Cha nhưng chạy Con
        
        //đang dùng danh nghĩa Cha, thì cư xử nhhuw Cha, Cha éo có hàm sayHi() lấu 
        //gì mà xổ, trong RAM vẫn có sayHi() đấy, vì new Child() có sayHi()
        //clone Khuôn Child như nhau, quan trong con trỏ
        
        //List<Student> list = ArrayList();
        //cha                   con
        
        //KĨ THUẬT CHẠM VÀO THỨ RIÊNG TƯ CỦA CON
        //CHA KHÔNG BIẾT TRIN SG CÒN LÀM GÌ, VẬY LÀM SAO BA CÓ THỂ BIẾT??
        //DÙNG KỸ THUẬT DRIFT CON TRỎ
        
        //kéo giãn cái con trỏ Cha -> xuống đến đáy new Child()
        //cần con trỏ tạm để lấy đc cái đáy new Child()
        Child x = (Child) c2; //cần trỏ vùng new child()
        //c2 vẫn là Parent, tương đương nhả sợ dây thun
        //ÉP CHÓ THÀNH MÈO, KI THUẬT ÉP KIỂU
        x.sayHi(); //Hello MOTOR //2 CHÀNG 1 NÀNG
        
        //CÁCH LẦY LỘI HƠN, XUẤT PHÁT TỪ CÁCH 1 HOK THÈM XÀI CON TRỎ TẠM
        //(Child)c2.   //DO DẤU CHẤM QUÁ MẠNH , CHẤM SÁT AI THÌ CƯ XỬ THEO TYPE ĐÓ
        //ÉP XONG RỒI MỚI CHẤM, THAY ĐỔI ĐỘ ƯU TIÊN
        ((Child)c2).sayHi(); //7 bài thí nghiệm con troe new Dog().bark()
        //ÉP XONG RỒI MỚI CHẤM, THAY ĐỔI ĐỘ ƯU TIÊN
        //new Child("CĂN HỘ CAO CẤP", "DOGECOIN", "MOTOR").sayHi(); //xài luôn vẫn được
        
    }   
    
}
