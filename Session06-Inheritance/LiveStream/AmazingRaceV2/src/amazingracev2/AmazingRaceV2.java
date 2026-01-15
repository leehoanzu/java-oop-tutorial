  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingracev2;

import data.*;
import java.util.*;
/**
 *
 * @author lehoa
 */
public class AmazingRaceV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runToDead();
    }
    
    //XEM THAM KHẢO
    public static void playAnonymous() {
        //List list = new ArrayList();
        //abstract,  interface đó, 20 hàm k code
        List list = new List() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Iterator iterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object[] toArray() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object[] toArray(Object[] a) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean add(Object e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean containsAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean addAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean addAll(int index, Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean removeAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean retainAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object get(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object set(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void add(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object remove(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int indexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ListIterator listIterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ListIterator listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    public static void runToDead() {
        
        //CÓ QUYỀN CÓ AI ĐSO CHẠY NGANG NHẢY VÔ
        //MỸ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VÀO!!!
        //NGƯỜI CÁ ĐÚNG chuẩn = class Mermaid thì chuyên ngồi mỏm đá, dụ
        //thủy thủ đến bắt ăn thịt!!!
        //nếu ta làm class Mermaid rời-concrete, phải chuột tạo mới class Mermaid
        //viết code bình thường, code này có hàm batThuyThuVaAnThiut()
        //bắt Mermaid implement Deathracer, bắt người cá đi đua chuyện quá đáng
        //k phù hợp logic, người cá k thíc di chuyển đi đua
        
        //nhưng có 1 nàng người cá thíc ăn chay, lên bờ chơi với con người
        //k theo logic chung người cá là ăn thịt người thủy thủ
        //object lẻ k nhập chung đoàn Mermaid truyền thống
        //k bắt Mermaid implemnet Deathracer
        //Mĩ nhân ngư CTT phá đoàn, tham gia đưa dưới kênh Nhiêu Lộc cho vui
        //k bắt cả họ Người Cá đia đua
        //object đánh lẻ, đánh lẻ đua, thì chỉ cần đua tốc độ là đc rồu
        //Anonymous Class, k thèm tạo class rời, mà vẫn tham gia CLB
        //chỉ cần có hành động của CLB là okie rồi, ghé ngang thoy thì cx phải
        //hành động. implement all abstract methos on the go, take-away
        
        //làm class riêng rẽ để nhân bản đc nhiều Member
        //làm on the go dành cho vãng lai ghé nagng
        //cả 2 đều phải Implements, @override vì cha, clb k hoàn hảo
        
        //OBJECT ON THE GO, CẦN CÓ HÀM ĐUA VÀ GYAS THÀNH TÍCH LÀ XONG, ÉO LÀM CLASS RỜI
        //ÉO LÀM CLASS CÓ SẴN ĐỂ NHÂN VĂN
        //DeathRacer mnnCTT = new Mermaid(); //class này có @Override
                                        //2 hàm rinToDead() showHowTo()
                                        //y chang Motor à
        //mượn gió bẻ măng, éo có khuôn thì phải code @Override từ đâu,
        //cho mỗi lần chơi trò làm biếng tạo khuôn
        //on the go @Override
        DeathRacer mnnCTT = new DeathRacer() {
            //VÙNG K GIAN CỦA CLASS MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            //VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            //BA SẼ LÀ CÁNH CHIM (NEW/SUPER() NEW DEATHRACER)
            //đưa Con extends/implements thật xa thật nhiều @Override
            //ta có quyền làm như truyền thống, thêm đặc điểm...
            //đừng lạm dụng, on-the-go thì nên quan tâm phàn đang tham gia
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }
            
            //anonymous làm biếng tạo class rời cho cả abstract class và interface
            //bên Abstract class thì ta còn đặc điểm của Cha để xài
            //anonymous của Interface, đua thì đua đi, hỏi han làm chi, k có ìno
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|%4d|%5.1f|\n",
                     "MERMAID-RACER", "MNN CTT", 2015, runToDead());
            }
        }; //VIP                
        
        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50.0);
        //chấm full hàm của Con, đủ code hàm Cha, CLB
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        //chấm full hàm Cha, khai Cha, chạy k sợ vì đa hình Con qua mặt
        //tổ lái con trỏ được, new Dog mà sợ gì
        //tao là "danh nghĩa của Cha" thì chỉ xổ Cha hoy, học rồi
        // m biết Bố r là ai k??? hù theo kiểu Bố
        
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        //ngộ nhỡ chấm thì sao
        //chấm chỉ xổ full CLB,  2 hàm runToDead(), showHowToDead()
        //tao chỉ là Đua Thủ chỉ quan tâm đua hoy
        //chạy éo sợ vì Con qua mặt, có đủ hàm Override đã làm rồi, đa hình tiếp
        //ép con trỏ đc luôn, new Dog mà sợ gì
        
        Motor m1 = new Motor("EXCITER", "150.0CM3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0CM3", "56F6-67889");
        
        //mnn cm vẫn là 1 racer, có hành dộng đua gấp 3 lần giới hạn
        //vật lí người cá, em xứng đáng gia nhập clb đua,vào lane đua
        DeathRacer racer[] = {mnnCTT, d1, (Dog)d2, d3, m1, m2};
        
        //DeathRacer racer1[] = new DeathRacer[5]; 
        //có 5 ng chạy đua
        //racer[0] = new Dog(...);
        //racer[1] = new Motor(...);
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowTo()
        //Con tự lo, Con Motor chạy tgei Motor, COn Dog chạy theo Dog
        
        System.out.println("The racing record");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}
