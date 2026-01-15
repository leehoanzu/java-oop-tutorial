/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import data.Student;
import java.util.*;

/**
 *
 * @author lehoa
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
////        playWithArrayList();
////        sortArrayListManually();
////        playWithSet();
////        Student xxx = getAStudent("se123456");
////        if (xxx != null) //k trỏ null tức là trỏ vung tìm thấy thì in
////            xxx.showProfile();
////        else
////            System.out.println("NOT FOUND!!!");
//        //sortStudentList();
//        List<Student> result = initData();
//        System.out.println("The student list");
//        for (Student x : initData()) {
//            x.showProfile();
//        }
////        for (Student x : result) {
////            x.showProfile();
////        }
//    }
    
    public static void main(String[] args) {
        List<Student> arr = initData();
        //goi hàm search với 4 bamnj sv có trong arr, mà thực ra do hàm initData
        Student xxx = searAStudent(arr, "sE888888");
        if (xxx == null)
            System.out.println("NOT FOUND!");
        else {
            //lỡ tìm thấy thì update lại điểm số
            xxx.showProfile();
            xxx.setGpa(6868);
        }
        
        //RA HẲN NGOÀI IF KIỂM TRA CÓ 6868 HAY CHƯA
        System.out.println("Check student list after info of a SE8 student");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    //-------------------------------------------------------
    //TỬ TẾ HÀM SEARCH VÀ SORT VÀ UPDATE LUÔN
    //---------------
    
    public static List<Student> initData() {
        //hàm trả về 1 cái Túi có sẵn bên trong 1 nhóm SV
        //trả về tọa độ 1 cái Túi, vẫn new Túi mà, trong Túi chứa thẻ bài sv
        //là chuyện khác nữa
        List<Student> arr = new ArrayList();
        Student chin = new Student("SE999999", "CHÍN LÊ", 2009, 9.9);

        arr.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.4));
        arr.add(chin);
        //arr.add(binh); //danh sách thống kê bị trùng, 2 thẻ bài, 2con trỏ
                        
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2008, 8.8));         
        return arr; // initData() = arr; arr ơi m đang trỏ new Bự nào 
                    //cho tên hàm t trỏ với
    }
    
    //ta search /tìm kiếm 1 hồ sơ sv dựa theo mã số. Có nhận vào ds luôn cx đc
    public static Student searAStudent(List<Student> arr, String id) {
        //arr là cái Túi new đâu đó, tên biến là tên con trỏ mà
        //trong túi này có 1 nhóm sv sẵn rồi, add sẳn rồi
        if(arr.isEmpty()) //túi k có thẻ bài, túc là size() trả về 0
            return null;    //có sv nào đc tìm lấy đâu
        //CPU CHẠY XUỐNG ĐÂY, Túi có thẻ bài rồi, ds có người điền tên rồi
        //for hỏi từng thẻ 1, ê ku (i) id m là gì?? coi có bằng id cần tìm hok
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if(tmp.getId().equalsIgnoreCase(id))
                return tmp; //return thứ i có trỏ i vùng id tìm thấy
                            //thẻ bài, con trỏ có lưu tọa độ, t return tọa độ
        }
        
        //đi hết for mà return dc thì là k thấy, null đấy RAM
        return null; //HÀM YÊU CẦU TRẢ TỌA ĐỌ VÙNG NEW, ÉO  THẤY THÌ
    }



//                  có thẻ đưa cái giỏ từ ngoài vào okie
    public static void sortStudentList() {
        List<Student> arr = new ArrayList(); //đi mua cái túi Doraemon
        Student chin = new Student("SE999999", "CHÍN LÊ", 2009, 9.9);

        arr.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.4));
        arr.add(chin);
        //arr.add(binh); //danh sách thống kê bị trùng, 2 thẻ bài, 2con trỏ
                        //
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2008, 8.8));  
        
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }   //set() là thay đổi info của con trỏ, trỏ chỏ khác
                    //lấy thẻ vài ra khắc lại thông tin trror
            }
        }
        
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    
    
    
    
    
    //THỬ NGHIỆM HÀM TRẢ VỀ 1 OBJECT, THÚC CHÂT LÀ TRẢ VỀ TỌA ĐỘ VÙNG
    //NEW - XEM LẠI BÀI OBJECT INSIDE - OUT TRÊN YT
    //đưa vào mã số sv muốn tìm
    //ta sẽ tìm trong giỏ/túi thẻ bài, coi ai mà có trùng mã số
    //thì trả về thẻ nài. hồ sơ bạn sv đó, trả về tọa độ hồ sơ đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList(); //đi mua cái túi Doraemon
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        arr.add(new Student("SE123456", "An Nguyễn", 2003, 9.0));
        arr.add(binh); //mày đưa tao tọa độ vùng new
        
        Student tmpStudent =arr.get(0); //lấy đc tọa độ sv 0 , thẻ bài 0
        //hỏi xem bạn í id là gì
        String tmpId = tmpStudent.getId();//arr.get(0).getId()
        
        //if(tmpId == id) return tmpStudent; //arr.get(0)
                                            //trả về tọa dộ trông hter bài 0
                                            //trả về thẻ bài 0
        if (tmpId.equalsIgnoreCase(id))
            return tmpStudent; //arr.get(0)
        //hoàn toàn k có sv xh, chỉ tham chiếu tọa độ vùng new
        //RETURN GET(0) THẺ BÀI 0, THẺ BÀI 0 TRỎ VÙNG NEW AN NGUYỄN
        return null; //k tìm thấy
    }
    //Set: là 1 loại giỏ, túi, mà k cho phép đựng trùng món
    //tức là k có mon nào xuất hiện quá 1 lần
    //k cho phép trỏ trùng 1 vùng NEW
    //ĐẾM SỐ NGƯỜI XEM PHIM, LỄ HỘI, TIỆC, ĐẾM MỖI NGƯỜI 1 LẦN
    //LIST:CỨ VÀO LÀ ĐẾM, VỀ RỒI, QUAY LẠI VẪN ĐẾM SỐ LƯỢT NGƯỜI    
    public static void playWithSet() {
        Set<Student> arr = new HashSet(); //mua cái túi Doraemon
                                            //mở khóa để thao tác, .hàm()
        
        Student an = new Student("SE123456", "An Nguyễn", 2003, 9.0);
        
        arr.add(an);
        arr.add(an); //add trùng
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        //CÓ NEW CÓ VỦNG RAM MỚI, OBJECT MỚI, TRÙNG INFO BÊN TRONG NEW
        //ÉO PHẢI VẪN ĐỀ
        //SET LÀ K CHẤP NHẬN CON TRỎ TRÙNG VÙNG NEW
        
        //k có hàm get() vì giỏ này đừa đồ vào, thẻ bài vào
        //thẻ bàu đưa vô k giữ nguyên thứ tự như đưa vô
        //thì có 2 tình huống xảy ra: HashSet: để "llonj xộn" thẻ bài
                                                //để thẻ bài "có thứ tự"
        //  khác hoàn toàn thứ tự kiểu ARRAYLLIST
        //ARRAY LÍT LÀ VÀO TRUOWCS, ADD TRƯỚC NGỒI TRC, VÀO SAU NGỒI SAU
        
        
        //GIỎ CHỨA MẤY THẺ BÀI? ADD 2  LẦN ĐẦY. ARRAYLIST ADD BAO NHIÊU
        //                                              CHỨA BAO NHIÊU
        System.out.println("The student list");
        for (Student x : arr) { //duyệt qua  từng con trỏ, lấy tọa độ
                                //từng thẻ bài gắn vào con trỏ x
            x.showProfile();
        }
    }
    
    //ta tự sort danh sách sinh viên làm băng tay
    //còn 1 cơ chế ta k cần dùng vong forr tự viết
    //hàm static: Collections.sort() //dùng interface mới được - giảng
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList(); //đi mua cái túi Doraemon
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "An Nguyễn", 2003, 9.0));
        arr.add(binh); //mày đưa tao tọa độ vùng new
        
        arr.add(binh); //add trùng vùng new
        //có 2 tọa độ trong túi, 2 thẻ bài trong túi
        //get() từng thẻ bài thì đc tọa độ vùng new
        //[i] đc tọa độ vùng new, y chang mảng, mỗi ptu mảng là 1 tọa độ
        System.out.println("The student lits");
        //mảng đang giảm dần về điểm, túi giảm dần về điểm
        //thẻ bài 1 trỏ vùng điểm cao, thẻ bài 2 trỏ vùng điểm thấp
        for (Student x : arr) { //trong arr là 1 đống con trỏ
            x.showProfile();            
        }
        
        System.out.println("The student list(printed using for i");
        for (int i = 0; i < arr.size(); i++) {
            Student x = arr.get(i); //lấy tọa nằm trỏ thứ i
            x.showProfile();
            //arr.get(i).showProfile();
        } //NHỚ CÂU: CÓ TỌA ĐỘ CHẤM LUÔN
        //đổi được 2 thằng thì đổi đc cả giỏ, 2 vòng for
        
        //mảng chơi [i] sờ ngay con trỏ thứ i
        //túi phải mở ra, để lấy, gọi hàm.hàm()
        
        Student tmp = arr.get(0); //tmp trỏ vùng AN 9.0
        arr.set(0, arr.get(1)); //con trỏ thứ 0 trong giỏ, thẻ bài thứ 0
                        //phải trot thằng BINH 4.9
        arr.set (1, tmp);
        //con trỏ 1 thay cách trỏ, trỏ vào cùng tmp đang trỏ
        //                          tmp đang trỏ AN 9.0
        //vùng new Student() vẫn nằm im, chỉ có thẻ bài trong giỏ
        //trỏ lại vùng neww
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) { //trong arr là 1 đống con trỏ
            x.showProfile();
        }
        
        arr.remove(1);
        System.out.println("The student list after removing a student");
        for (Student x : arr) { //trong arr là 1 đống con trỏ
            x.showProfile();
        }
    }
        
    
    public static void playWithArrayList() {
        //Student[] arr = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chổ, 500 mon đồ có thể bỏ vô
        //tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn
        
        //List ar = new ArrayList(); //lộn xộn, đủ loại con trỏ
        //đúng nghĩa túi Doraemon, môn gì cũng đựng, đựng tham chiếu hoy nha
        //nhét đc NhanVien, GiangVien, Animal, Dog, .. 
        
        //túi đông nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList(); //túi đựng đồng nhất 1 loại GENERIC
        
//        List<Student> arr = new ArrayList<>();
//        List<Student> arr = new ArrayList<Student>();
        //arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //Nhét động nhất món đồ dễ chấm chung đc, đa hình đc
        
        //MỞ NGĂN TỦ; TÚI, NHÉT ĐỒ VÔ
        //arr[i] = new Student(...); //mảng
        //arr.add(new Student(...sun.)); //lưu con trỏ hoy, new Student() thoait mái
        //bên ngoài, vùng HEAP
        
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        
        //2 chàng 1 nàng
        arr.add(s1); //giỏ vùng new ArayList, tủ có thêm 1 con trổ, sinh ra 1 con trổ
        arr.add(s2);    //sinh ra thêm con trổ nữa [1]
                        //add() vô lận, mảng [length - 1] hết mức
                        //new cứ nằm HEAP, SV cứ ở nhà, CN cứ ở xưởng, BN cứ ở phòng
        //add() mở khóa kép, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        //sinh ra con trỏ
        arr.add(s1); //add trùng nè 1 tên người vào danh sách,
        //Set k báo lỗi, chỉ lấy 1... đừng đi vào chi tiết vội vã!!
        
        arr.add(new Student("se999999", "CHÍN PHẠM", 2003, 9.0));
        //      NEW cứ lên heap mà nằm, bệnh nhân cứ về phòng, tớ nắm thẻ bài
        //1 con trỏ nữa lại đc add vào
        
        //hỏi xem túi đang có bao nhiêu đồ
        //arr.length hỏi túi mà, hỏi má mì mà, hỏi tên mảng mà
        System.out.println("The bag has: " + arr.size() + " món đồ");
        //4 SV in ra, nhưng thực ra chỉ có 2sv, do đó có người đếm trùng
        
        //in mọi người ra
        //tủ có gì, chứa bên tỏng 1 đống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ], con-tror2, con-tro3, con-tro4, ... nếu add() thêm
        //add() đẩy vào 1 con trỏ, tọa độ, thẻ bai
        //get(vị trí thẻ bài muốn lấy), trả về tạo dodooj con trỏ thứ i
        //                              trả về địa chỉ vùng new đang trỏ
        //[i] lấy đc tham chiếu bạn thứ i
        //get(i) lấy được chổ ngồi tham chiếu con trổ thẻ bài thứ i
        //a, thẻ này trỏ bạn sv kia kìa
        
        //in bạn đầu tiên
        ///ar[i[.showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); //trả về tọa độ thẻ bài bạn thứ 0
        //trả về tọa đọ gắn vào biến Student khác nằm cùng tọa độ okie
        System.out.println("The student list");
        xxx.showProfile();
        
        //bạn 1 get(1), có tọa độ chấm luôn cho rooifo, thêm biến con trỏ
        //cùng làm gì
        arr.get(1).showProfile(); //á đù trả về con trỏ, học rồi 7 viên ngọc rồng
        
        System.out.println("In xịn xò");
        for (Student x : arr) { //éo sợ NULL POINTER adđ() đén đau them con trỏ đến đó
            x.showProfile();
            //x = arr.get(i) = arr[i]
        }
        
        System.out.println("In xịn xò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            //arr[i].showProfile
            arr.get(i).showProfile();
        }
        //có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên
        //1 người khỏi danh sách,
        //vùng new Student() bị mất hay k tùy vào mấy con trỏ trỏ nó, học ròi
        //size() giảm liền, mảng éo có, fix cứng con số trỏ
        //set() đảo con trỏ, trỏ sang vùng khác (get() hàm set() xưa nay của 
        //các object
    }
}
