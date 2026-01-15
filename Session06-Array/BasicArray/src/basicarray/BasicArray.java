/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarray;

/**
 *
 * @author lehoa
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //playWithPrimitiveArray();
        //playWithPrimitiveArrayV2();
        //playwithPrimitiveArrayV3();
        //playWithStudentObject();
//        playWithStudentArray();
//        playWithObjectArray();
        //sortObjectArray();
        //sortPrimitiveArray();
//        sortObjectArrayV2();
        //sortObjectArrayV3();
    }
    
        public static void sortObjectArrayV2() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "An Nguyen", 2001, 4.0);
        arr[1] = new Student("SE123457", "Binh Le", 2000, 10.0);
        
        System.out.println("Before sorting by goa The student list");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        
        //TUYẾT ĐỐI K SỬ DỤNG TOÁN TƯ > < = CHO CÁC BIẾN OBJECT, VÌ ĐI SO SÁNH
        //TỌA ĐỘ, ĐỊA CHỈ LA VÔ NGHĨA
        //CHẤM BẾN TRONG ĐỊA CHỈ, CHẤM BÊN TRONG TỌA ĐỘ, VÀO TRONG OBJECY
        //VÀO TỎNG VALUE PHỨC TAPK, LẤY VALUE KHÁC RA MÀ XEM, MÀ SO SÁNH
        //sv1 so sánh sv2 vớ vẩn, điểm so sánh sv , còn có lú
        //tao ngồi ghế 0 mà điểm lại lớn hơn m ngồi ghế 1
        //swap thôi, swap điểm ăn đòn, swap trổ
        
        //SẮP XEEOS MANGHR OBJECT - MẢNG CỦA CÁ CBIEENS OBJECT MÀ TRỎ VÀO OBJECT
        //chẳng qua là đổi vị trí nhỏ, thay đổi value/tọa độ vùng object
        //mà đang được lưu trong các biến con trỏ
        //đổi cách trỏ của từng biến mảng. chơi biến trung gian
        //khi nao thì đổi, nhám mắt đổi là sai
        //GIẢ BOJ SẮP SẾP TĂNG DẦN CỦA ĐIỂM TB
        //nếu thứ tự trỏ vùng new đã đúng thứ tự điểm, để im
        //nếu điểm của arr[0] đang trỏ > điểm của arr[1] đang trỏ thi mới đổi
        //nếu [con trỏ đứng trước] > [con trỏ đứng sau]
        //nếu [0]                   > [1]
        
        //CHỐT HẠ: CẤM TUYỆT ĐỐI XÀI > >= < <= == != CHO VIỆC SO SÁNH 2 BIẾN
        //OBJECT, VÌ TOÁN TỬ SO SÁNH TRUYỀN THÔNG CHỈ DÀNH CHO PRIMITIVE
        //INT A = 5; B = 10; if( a> b ) vì 2 giá tị, so sánh được
        //arr[0] [1] bản chất trong ram nó là tọa độ, là con số luôn, hàm ý
        //địa chỉ vùng ram,
        //ĐI SO SÁNH 2 BIẾN object arr[0] [1]ư tương đương so sánh tọa độ, số nhà
        //nhà tao số nhà 500 đường qt, gv
        //nhà mày to nhà 2       ll, q1
        //số nhà t to hơn 250 lần số nhà m, vô nghĩa vãi
        //hãy so sánh giùm tui 2 sv An và Bình
        //sv1:                              sv2 vô nghĩa vì lúc thắng lúc thua theo
        //data bên trong
//        if (arr[0] > arr[1]) {
//            Student t;
//            t = arr[0]; //cho tớ trỏ điểm 9 với heng
//            arr[0] = arr[1]; 
//            arr[1] = t;
//        }
        
        if(arr[0].getGpa() > arr[1].getGpa()) {
            Student t;
            t = arr[0]; //cho tớ trỏ điểm 9 với heng

            arr[0] = arr[1]; 
            arr[1] = t;
        }
         
        System.out.println("After sorting by goa The student list");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        
    }
        
//    public static void sortObjectArrayV3() {
//        Object[]  arr = {"AnNguyen" ,"BinhLe"};
//        Student a[];
//        a = new Student[2];
//        System.out.println(arr[0] + " " + arr[1]);
//        System.out.println(arr[0].toString());
//        Object[] javaObjectArray = { "Maruti", "Suzuki"};
//    }
    
    public static void sortPrimitiveArray() {
        int a = 5;
        int b = 4;
        //in a trước, b sau, giảm dần về value 9.5
        //tui muốn tăng dần về value            5.9
        System.out.println("a: " + a + "| b: " + b);
        //backup lại a 9 trước khi a chơi nhỏ 5

        //chỉ dổi , sắp xeeos khi bị lộn xộn thứ tự, khi a > b  bị lôn xộn tăng dần
        //NẾU ĐỨNG TRƯỚC MÀ LỚN HƠN VỀ VALUE, RÕ RÀNG PHẢI ĐỔI VALUE
        //if (a > b) thì mới swap
        if (a > b) {
            int tmp = a; //tớ temporary, temp, tmp, t
            a = b; //t cần value nhỏ. vi t ngoi đầu tiên, nên mảng nhỏ, m nhỏ
            //cho t đi
            b = tmp; //vẫn còn 9 backup 
        }

        System.out.println("After sorting a: " + a + "| b: " + b);

    }

    public static void sortObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "An Nguyen", 2001, 9.0);
        arr[1] = new Student("SE123457", "Binh Le", 2000, 5.0);
        //[0] đừng trỏ điểm to, sẽ bị in trước, in trước thì k giảm dần:
        //[0] nên trỏ điểm nhỏ thì hay hơn
        
        Student t;
        t = arr[0]; //cho tớ trỏ điểm 9 với heng

        arr[0] = arr[1]; //đầu bằng xin trỏ 5 thay vì 9        //int a = 5; int b = a; //cho t b xin value của m
        arr[1] = t; //chổ ngồi kế đầu bảng xin trỏ lại 9 của anh được hong
        //NEW BÌNH ĐANG ĐƯỢC 2 CON TRỎ CÙNG TRỎ, CHỨNG MINH
        System.out.println("After sorting by goa The student list");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        //phần tử đầu của mảng thay vì trỏ vùng new 9, nay nó trỏ new 5
        //SẮP XẾP MẢNG OBJECT, VÙNG NEW GIỮ NGUYÊN,
        //ĐỔI CÁCH TRỎ [I] TRONG MẢNG
        //[THẰNG ĐẦU MẢNG] TRỎ VÙNG NEW NHỎ 5.0
        //[THẰNG KẾ MẢNG] TRỏ vÙNG NEW nhỏ 9.0 
    }

    public static void playWithObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "An Nguyen", 2001, 9.0);
        arr[1] = new Student("SE123457", "Binh Le", 2000, 5.0);
        System.out.println("The student list");
        for (Student x : arr) {
            //x = arr[0]; x = arr[1] //2 chàng x và arr[0] cùng trỏ new AN
            x.showProfile();
            //          x   arr[1] cùng trỏ BÌNH
        }
        //sắp mảng tăng dần theo điểm tb
        //lí thuyết, bạn [0] sẽ phải có điểm 5
        //               [1]                 9
    }

    public static void playWithStudentArray() {
        //lưu hồ sơ sinh viên cả lớp
        //10 biến/tên tắt + 10 value phức tạp ~ 10 nhát new ()
        //lưu 10 số tự nhiên
        //10 biến/tên tắt + 10 value đơn 
        int arr[] = new int[10]; //arr[0] ~ int x; arr[1] ~ int y
        //= value đơn từ từ 
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13;
        //s1 = ngoặc tròn
        //      x[0][1][2] [3] [4]  [5] [6] [7] [8]  [9]
        //        x[0].

        Student list[] = new Student[3]; //đừng nhầm lẫn khi new, 2 loại ngoặc
        //() gọi phễu 1 object
        //[] tao cần ? biến đối tượng
        //[] dành cho nhiều biến, nhiều tên gọi tắt
        list[0] = new Student("SE123456", "An Nguyen", 2001, 5.6);
        list[1] = new Student("SE123457", "Binh Le", 2000, 5.7);
        list[2] = new Student("SE123458", "Cuong Vo", 2001, 5.6);
        //mấy con trỏ con lại mang giá trị gì??? biến Student chưa gán mang
        //giá trị gì
        //list[3]....list[9] trỏ gì??? 0 là DEFAULT
        //                                  TRỎ VÀO TỌA ĐỘ 0 CỦA RAM, ĐỊA CHỈ 0 CỦA RAM
        //                                  BYTE ĐÀU TIÊN TRONG THANH RAM TOÀN LÀ SỐ OFFOFFOFFOFFOFF
        //Tức là byte đầu tiên (thứ 0) tọa độ thứ 0 của ram chứa toàn số 0
        //byte NULL BYTE LÀ K CÓ GÌ CẢ, TOÀN 0,
        //IN MẢNG CÁI COI
        System.out.println("The list of student");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
            //tao chi la 1 biến Student x thoy mà
        }
        s1 = null; //t trỏ đáy ram heng, null heng, làm biếng new;
        //có value rồi, số 0, tọa độ 0 ở đáy ram, đi vào 000000
        s1.showProfile(); //có mẹ gì mà show, NullPointerExceptiion

        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG LÀ : BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, K FOR ĐẾN .LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
    }

    public static void playWithStudentObject() {
        Student x; //tớ sẽ nói về 1 đứa heng
        x = new Student("se123456", "An Nguyen", 2001, 5.6);
        x.showProfile();
        System.out.println("goi tham: " + x.toString());    //goi tham: Student{id=se123456, name=An Nguyen, yob=2001, gpa=5.6}
        //nếu trong class k tạo toString thi sẽ ra mã hexa
        //goi tham: basicarray.Student@6d06d69c
    }

    public static void playwithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15}; //new ngầm, k nói rõ việc new, thực ra có
        int arr3[] = new int[]{5, 10, 15, 20};

        int arr2[] = new int[5];

        int arr[];
        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu cầu!!!
        arr[0] = 5; //int a = 5;
        arr[1] = 10; //int b = 10;
        arr[2] = 15; //int c = 15; 
        //arr.toString();
        //arr là gì, m là 1 biến đb, m là biến object luôn, vì m trỏ 1 vùng new bự
        //có quyền chấm, chấm cái gì??, tệ nhất là .toString()
        //arr là biến phức tạp vì nó có nhiều info bên trong, info này là
        //phần tử của mảng
        //arr[0] ~~~~ arr.get(thằng thứ 0) -> đc 5 / arr[0] dc 5
        //arr.length - biến lưu đặc điểm của 1 mảng, có bao nhiêu phần tử
        //  -> static hay non ? non, vì nếu static mọi mảng cùng kích thước

        //arr.length; //hằng số đb, ăn theo từng mảng, mỗi mảng sẽ khác nhau size
        System.out.println("Array has " + arr);
        //gọi thầm tên e,
        //các biến thành mã Hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr. xổ ra cái gì????  public của vùng new
        //arr[0] xổ ra cái gì??? xổ cái đầu m, t là primitive, tên t phức tạp
        //nhưng t vẫn đơn giá trị (tên t có ngoặc vuông do trùng tên)
        //                          nhưng t là tên cho value đơn giản
        System.out.println("");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        //get() set() k có mà thay = chơi trực tiếp []
        //thay đổi value bên trong biến/phần tử

    }

    public static void playWithPrimitiveArrayV2() {
        //    float* arr = calloc(7, sizeof(float)); //clear allocation (don dep khi dua cung ram)
        // bien ct		new object()
        //		ref		new object()
        double arr[] = new double[15];  //default gắn hết = 0 
        //new () là phễu để đúc object!!!!!
        //em mún có 365 biến double, nó là biến lẻ nè nè
        //              ARR [0], ///
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;

        System.out.println("The array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr [0]. k ra gì vì nó là biến primitive
        //arr.length
        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG MẸ GÌ CHƯA BIẾT
        //TÊN MẢNG LÀ BIẾN MÁ MÌ, TÚ ÔNG TÚ BÀ, BIẾN OBJECT, BIẾN CON TRỎ, REFERENCE
        //TAO SẼ TRỎ VÙNG RAM CHÀ BÁ LỬA NEW ĐÓ, K ĐÚC TRUYỀN THỐNG
        //                                         MÀ LÀ NHIỀU BIẾN
        //MÁ MÌ SẼ QUẢN LÍ BAO NHIÊU CHÁU DƯỚI QUYỀN, ĐĐ CỦA MÁ MÌ
        //MÁ MÌ CHẤM RA ĐƯỢC SỐ LÍNH
        System.out.println("\nThe array has values of (for each)");
        for (double x : arr) {
            System.out.print(x + " "); //mặc điịnh những biến  còn lại được gắn giá trị 0 ó
        }

    }

    public static void playWithPrimitiveArray() {
        //float vol[365]; //Java cấm khai báo kích thước mảng, số phần tử trong ()

        //float v[365] = {0, 0, 5, 10, 15, 20, 25};
        float v[] = {0, 0, 5, 10, 15, 20, 25}; //mảng có 7 phần tử, có sẳn lun value
        //7 biến float v[0] = 0; v[2] = 5, ...
        //7 biến float này nằm trong HEAP đấy, có new ngắm đấy, có malloc() đấy
        System.out.println("The array has value of (printed by individual)");
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }

        //ta co thể xem mảng là tập hợp các value trong dấu {} giống Toán
        //ta có thể xài khái niệm với mỗi để duyệt qua toàn bộ mảnh
        System.out.println("\nThe aray v has value of (using for each)");
        for (float x : v) {
            //x = v[0]ư, x = v[1] , x = v[2] với mọi x là 1 biến lẻ, = từng
            //thằng lẻ trong mảng sỉ 
            //sout(v[i]) -------------------sout (x)
            System.out.print(x + " ");
        }

        //N = {0 ,1, 2, 3, 4, 5, 6, 7, 8, 9, ..}
        //V x e N, x là mấy, x là bất kì trong N
        //              x = 0, x = 1, x = 2, x = 3
        //với mọi là kĩ thuật quét qua mảng
        //dùng đèn pin quét từ đầu đến cuối
        //kĩ thuật dùng là 1 con số tự nhiên
        //duyệt qua tất cả phần tử của tập hợp
        //V int x e N, x  = N[0] x = N[1] x = N[2]
    }

}
