/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author lehoa
 */
public class WrapperClass {


    public static void main(String[] args) {
//        playWithIntegers();
        playWithPointers();
//        playWithPools();
    }
    
    //Hồ bơi: nhiều chnafg trỏ 1 nàng, share chung vùng new Wrapper
    public static void playWithPools() {
        Integer n1 = new Integer("2003");
        
        Integer n2 = new Integer(2003); //cách này k khuyến khích
        Integer n3 = new Integer(2003);
        
        Integer n4 = 2003; //boxing, đóng hộp, new ngầm
        Integer n5 = 2003;
        
        //n1 có bằng n2 ko
        if(n1 == n2)
            System.out.println("n1 bằng n2");
        else
            System.out.println("n1 Éo bằng n2");
        //n2 có bằng n3 ko
        System.out.println("n2 vs n3: " + (n2 == n3));
        
        //n4 có bằng n5 ko
        System.out.println("n4 vs n5: " + (n4 == n5));
        
        //n3 có bằng n4 ko
        System.out.println("n3 vs n4: " + (n3 == n4));
        
        Integer n6 = -128; //boxing đóng hộp new ngầm
        Integer n7 = -128;
        
        Integer n8 = new Integer(127); //k xài pool
        //chỉ xài pool khi sài trực tiếp
        //n6 có bằng n7 k?
        System.out.println("n6 vs n7: " + (n6 == n7));
        System.out.println("n7 vs n8: " + (n7 == n8));
        //nếu chơi trực tiếp new ngầm, BOXING ĐOẠN {-128 .. +127}
        //các biến object trỏ cùng 1 vùng new dù có lệnh gắn = value;
        //k phải n7 = n6; trỏ cùng rõ ràng 2 chàng 1 nàng
        //n7 = 127; //hok new lấy xem thằng nào new 127 trực tiếp chưa, rồi
        //xin vùng new đó, trỏ cùng
        //[-128 ... +127] -> HỒ BƠI INTEGER, INTEGER BOOL
        //
        //STRING CŨNG Y CHANG, CÓ HỒ BƠI -> WEEK 12
        String s1 = "HELLO";
        String s2 = "HELLO"; //2 ĐỨA TẮM CHUNG
        
        String s3 = new String ("HELLO"); //~~~~ new Integer ("2003); k khuyến khíc như z
        String s4 = "Hello"; //hồ tắm khác
        
        
        //String pool phân biệt hoa thường
        //vùng new String() mà xài chung
        
        //CHỐT HẠ: K CARE VIỆC SO SÁNH 2 BIẾN OBJECT DÙNG ==
       //VÌ KẾT QUẢ ĐÚNG SAI K BIẾT CHÍNH XÁC, LIÊN QUAN ĐẾN POOL VÀ K POOL
       //ĐÚNG CHUẨN LÀ PHẢI: CHẤM ĐỂ VÀO BÊN TRONG VÙNG NEW MÀ LẤY VALUE RA XÀI
       //RA SO SÁNH
       //MỖI OBJECT/CLASS NÊN LÀM LUÔN SÃN HÀM SO SÁNH VỚI ĐỒNG LOẠI
       //SO XEM MÌNH CÓ EQUALS(NGƯỜI KIA KO)
       //SO XEM MÌNH TƯƠNG QUAN THẾ NÀO COMPARETO( NGƯỜI KIA)
       
    }
    
    public static void playWithPointers() {
        Integer num0 = 2000; //t trỏ vùng new có lõi 2k
        Integer num1 = 2000; //t trỏ vùng new khác cx có lõi 2k
        
        //hỏi num0 có bằng num1 hay k??
        //đi so sánh 2 tọa độ nằm trong biến này, 2 địa chỉ vùng new trong
        //biến này., 2 card visit chứa địa chỉ của 2 đó
        //đi so sánh 2 địa chỉ, điên
        //CHỐT HAK: CẤM TUYỆT ĐỐI, K DÙNG > >= < <= != CHO BIẾN OBJECT
        //VÌ NÓ MANG Ý NGHĨA NSO SÁNH 2 SỐ NHÀ, 2 ĐỊA CHỈ, VÔ NGHĨA
        
        //PHẢI NÓI LÀ BÊN TỎNG NUM1 VÀ NUM2, LÕI LÀ DATA CHÚNG M CÓ BẰNG
        //NHAU HAY K??
        
        if (num0 == num1)
            System.out.println("2 đứa num0 và num1 bằng nhau");
        else
            System.out.println("num0 éo bằng num1");
        
        //Hai lõi của num1 và num2 có bằng nhau hay k thì mới hợp lý
        //mún biết thì phải vào tỏng vùng new mới biết được
        //KẾT LUẬN: MÚN SO SÁNH 2 OBJECT THÌ PHẢI VÀO VÙNG NEW, 
        
        //SO SÁNH LÕI:
        System.out.println("Compare to core: num1 vs num2: " + num0.equals(num1));
        
        
    }
    
    //Collections, List/Set/Map chỉ chơi với object
    public static void playWithIntegers() {
        
        int num0 = 2003; //4byte
        
        
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003); //trò này đừng nên chơi ở jdk 10 trở đi
        Integer num3 = 2003; //new ngầm, k nói rõ lệnh neww, bản chất vẫn new
                                //nhìn tự nhiên
        
        //in thử xem sao:
        System.out.println("num0: " + num0); //xài luôn vùng ram
        System.out.println("num1: " + num1); //biến con trỏ mà, gọi thầm tên em
        System.out.println("num2: " + num2.toString());
        System.out.println("num3: " + num3.intValue());
        //vào bên trong lấy value lõi ra mà xài, lõi chính là int 4 byte
        //gói 4 byte thành hộp bự object, ta gọi là boxing, đóng hộp Primitive
        //Gắn Primitive vào biến Object -> NEW trước rồi nhét value vòa trong hạt nhân
        
        int num4 = num3; //con trỏ mà chơi được với primitive sao
                            //địa chỉ lại được gắn primitive sao???
                            //vào vùng new num3, lôi ra cái core/lõi chính là 1
                            //con int value = 2003 thảy sang num4. Ổn ngay
                            //khui hộp, khui thùng, lấy lõi thảy sang pri
                            //UNBOXING: GẮN TỪ WRAPPER object sang primitive
        System.out.println("num4: " + num4); //2003
        
        //Integer num3 = 2003;
        // num3 = 2002;
        System.out.println("Check num3: " + num3);
        num3 = 2002; //điều gì xảy ra trong ram
        //          móa, 1 vùng new Integer mới (2002 đổ vào)
        //          móa, vùn new Integer cũ của lõi 2003 ở trên bị
        //          CTMTĐT dọn dẹp
        
        //WRAPPER CLASS K CÓ HÀM SET(), NHƯNG CÓ HÀM GET()
        //CLASS NÀY OBJECT NÀY GIỐNG KIỂU READ-ONLY TỨC LÀ: TỨC LÀ 1 KHI ĐÃ NEW RA
        //ĐÚC RA, KO CHO SỬA LẠI SẢN PHẨM
        //CLASS NÀO TRONG CUỐC ĐỜI BẠN LÀM RA, + ĐÁM WRAPPER NÀY MÀ KO CHO
        //SỬA GIÁ TRỊ ĐỔ VÀO, NGƯỜI TA GỌI ĐÓ LÀ IMMUTABLE CLASS
        //CLASS K CHO PHÉP HIỆU CHỈNH INFO, MÚN HIỆU CHỈNH NEW MỚI
        
        //MUTABLE LÀ CLASS CÓ HÀM SET() SỬA ĐƯỢC VALUE LÕI/ĐẶC ĐIẺM
        
        
    }
    
    //WRAPPER CLASS LÀ NHỮNG CLASS SINH RA ĐỂ BAO CÁI PRIMITIVE LẠI THÀNH 1 OBJECT
    //LÕI CỦA OBJECT NÀY CHÍNH LÀ CHỈ CÓ 1 BIẾN HOY, BIẾN PRIMITIVE
    //CẢ THẾ GIỚI LÚC NÀY LÀ OBJECT, DO ĐÓ TÚI COLLECTONS/SET/LIST/MAP SẴN SÀNG
    //CHỨA CÁC CON SỐ, 1 MÌNH 1 CON SỐ, THEO KIỂU TRỎ VÀO VÙNG NEW WRAPPER CLASS
    //LÕI CHÍNH LÀ SỐ CẦN LƯU
    //KHÁC MẢNG [] 2 LOẠI MẢNG PRO VÀ MẢNG OBJ
    
    //WRAPPER CLASS: Byte    Short    Integer   Long Float Double Boolean Character
    //              byte     short   int        long  float double  boolean     char 
}
