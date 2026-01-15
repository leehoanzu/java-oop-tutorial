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
//KHUÔN TỔ, SINH RA N KHUÔN KHÁC CHO NHANH
//GIÚP V, TR, HCN, HBH, TG, OVAL, .... Ở CHUNG MẢNG, MỚI SORT ĐC
//CÙNG PHIÊN BẢN XẾP GẦN NHAU

public abstract class Shape {
    
    protected String owner;
    protected String color;
    protected String boderColor;
    //các cạnh thì sao??
    //protected double a, b, c, radius; //CÒN NỮA THÌ SAO, CÓ NÊN K???
    //Vớ vẫn k đc đưa các cạnh vào đay vì:
    //chúng sẽ kế thừa hết các cạnh, do đó HV sẽ có cạnh, nhiều nữa là khác, bán kính
    //tròn, ngoài bk, thừa kế luôn cả cạnh
    //bk, cạnh là của RIÊNG TỪNG ĐỨA CON, DỊ BIỆT THÌ PHẢI Ở TỪNG ĐỨA CON
    
    //CHA LÀ NHÂN TỬ CHUNG CHO CÁC CONN, NGOÀI ĐỜI Y CHANG 
    //ĐAM CON CÓ DI TRUYỀN TỪ BA MÁ: OWNER, COLOR, ĐƯỜNG BO
    //NHƯNG GIỮ LẠI KHÁC BIỆT: TR: BK, V: CẠNH, TG: CHIỀU CAO/ĐẤY...
    //ae trong nhà thừa kế từ ba má nhiều thứ, tài sản rieng mỗi Con tạo dựng
    //người đó giữ
    
    //diện tích và chu vi là derived field đc tính từ thằng khác, k nên xem là dđ   

    public Shape(String owner, String color, String boderColor) {
        this.owner = owner;
        this.color = color;
        this.boderColor = boderColor;
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

    public String getBoderColor() {
        return boderColor;
    }

    public void setBoderColor(String boderColor) {
        this.boderColor = boderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", boderColor=" + boderColor + '}';
    }

    //1 khuoon vẫn chế tạo theo nguyên tắc chung đã học
//    public void paint() {
//        
//    }
    
    
    //CÓA K CHO, VÌ CẦN KHÁI NIỆM NÀY ĐỂ DIỆN TẢ RÕ Ý NGHĨA HH
    //ĐỂ K DC VIẾT CODE, VÌ K CÓ CỤ THỂ KÍCH THƯỚC
    //VẪN TỒN TẠI NHƯNG K NẮM CHẠM ĐƯỢC, NÓI NHƯNG CHƯA LÀM, KHÁI NIỆM HOY MÀ
    //HÀM TRỪU TƯỢNG, VẤN ĐỀ TRỪA TƯỢNG, THỨ VÔ HÌNH ,MÀ VẪN HỮ HÌNH
    //ĐỂ VÀO CHO ĐỦ BỘ HOÀN THIỆN 1 THỨ GÌ ĐÓ, LÃNH ĐẠO TINH THẦN, K  QUYỀN LỰC
    //CỤ THỂ
    //MA, QUỶ: VÔ HÌNH, MÌNH VẪN SỢ, KHÁI NIỆM MÀ HOY, ABSTRACT
    public abstract double getArea();
    public abstract double getPerimeter();
    
    //việc vẽ và in ra thông tin cũng là chung chung vì mỗi hình mỗi khác
    public abstract void paint();
    //tao chỉ nói rằng HH có thứ này, còn mỗi đứa V, T, CN,... tự lo đi
    
    //CHA LÀ NHÂN TỬ CHUNG CỦA CÁC CON
    //ABSTRACT: KHÁI NIỆM, NÓI THOY, CHƯA CẦN CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TỎNG CUỘC SỐNG, TRONG TỰ NHIÊN
    //              ĐỂ DỄ DÀNG NÓI VỀ CÁC OBJECT. XẢY RA CỰC NHIỀU TRONG C/S
    
        //tính thế nào??, éo có kích thước, vì dị biệt ở từng con
        //return 50; //k đc default, vì vô nghĩa khi new luôn
        //cạnh đâu để sửa lại S, công thức đâu mà tính
        
        
                        //k có kích thước sao mà tính đc
                        //k xóa hình này dc, vì HH phải có S
        //HH cần có S như là khái niệm, nói rằng thứ nào chiếm bề mặt, có số đo S
        //đại diện cho 1 nhóm/series các đồ vật dụng cụ thể đều có S, P
        //để đây như là ý nghĩa tinh thần, đảm bảo đủ để mô tả 1 thứ nào đo
        ///HH có S, P
    
        
    
    //diện tích và chu Vi k đc xem là đặc tính, mà phải xem là hành vi
    //2 hàm tính A và P để ở đâu??? Con hay Cha, hay cả 2??
    //CẢ 2: VỪA LÀ DI TRUYỀN, VỪA LÀ DỊ BIỆT (@OVVERIDE)
    //ĐÃ NÓI VỀ HÌNH HỌC, LÀ PHẢI NÓI S, P CŨNG LÀ DĐ CỦA HÌNH HỌC NÓI CHUNG
    
    //HÌNH CỤ THỂ V, TR, TG, HÌNH CHÁC CHÁN TÍNH ĐƯỢC, CŨNG LÀ Đ CỦA TỪNG HÌNH
    //mỗi con sẽ dị biệt trong tính toán, nhưng nói chung có S P, thừa kế từ
    //Cha       
    
}
//ABSTRACT LÀ KHÁI NIỆM, Ý TƯỞNG VỀ 1 THỨ GÌ ĐỐ
//VỚI HÌNH HỌC THÌ gets() getP() là 2 khái niệm luôn phải có S, P là khía niệm cần 
//có khi mô tả về hình học (hàm thuộc về object phù hợp)

//Tivi phải nói về dò kênh, kết nối

//Đthoai: phải nói về bắt song, nhận cuộc gọi, gửi sms...

//những mô tả này có thể là cụ thể, nhưng có thể chỉ là ý tưởng, nói thoy
//chung chung thoi 
//chung chung gọi là ABSTRACT
//cụ thể      gọi là CONCRETE