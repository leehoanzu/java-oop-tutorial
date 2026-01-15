/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//Khuôn dùng để đúc ra các oblect, đối tượng cần lưu trữ info, thử
//làm ra để bán
//khuôn phải kín, có phễu để chế /rót/hứng/đổ vào cái data, nguyên liệu


public class Dog {
//    chứa đặc điểm,chi tiết mà cái khuôn, object tương lai sẽ có
    //khuôn design ra sao, mai mốt object có thể
    private String name;
    private int yob;
    private double weigth;
    //...
    //~~ CMND, Thẻ căn cước, khác value đổ vào, Template
    
    //có khuôn thì phải có phễu/miệng loe để hứng vật liệu đi vào
    //phễu dùng dể nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog (String iName, int iYob, double iWeight){
        name = iName;
        yob = iYob;
        weigth = iWeight;
    }
    //phểu còn được gọi là constructor, hàm khởi tọa, hàm đúc, hàm tạo dựng
    //ra object vi thong qua như cái phễu vật liệu chảy vào bên trong khuôn
    //vật liệu khô ra object/bức tượng, cmd của ai, hồ sơ đc tao ra
    //CONSTRUCTIOR, phễu là hàm cực kì đặc biệt, vì nó dùng để tạo ra obj
    //cứ mỗi lần xài nó, tức là phải đưa VL vào, tức là có 1 object mới
    //PHỄU LÀ HÀM ĐB K CÓ GIÁ TRỊ TRỞ VỀ, K CÓ VOID LUÔN, T ÓI VỀ NGUYÊN
    //BỨC TƯỢNG ĐANG ĐÚC
    //tên 100% giống với tên class
    
    //viết các hàm xử lí data, ví dụ như giao tiếp hỏi năm sinh
    //mày hỏi tao trả lời, vì ba má đã fill yob = 2001
    //object thi goi la hnah động, behaviour, xử lí tính toán trên
    //biến được đổ value từ lúc đúc ra
    
    //hàm gọi n lần tương đương các hành động mà obj nao đó lặp đi lặp lại
    //hđ của obj gọi n lần trên obj đó
    
    //ta chủ động đưa nhiều info của ta ra
    public void bark () {
        //System.out.println("Gogogogogo.... my name is " + name);
        //System.out.println("Gogogogogo.... my yob is " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                    name, yob, weigth);
        
    }
    
    //một object bất kì có nhiều info mô tả, ví dụ: xem ddrtdddd trên tgđ, đập hộp có sách
    //ghi thông số luôn. Nhìn 1 cuốn sách trên mạng, cầm tay: tác giả, ngày xb, mã số...
    //gặp chú CSGT, show ra các info mình có: CCCD, Driver lic, cà-vẹt...
    //việc show info của 1 object là tự nhiên, FB profile
    //đó là 1 hành động nên có của mỗi object, mô tả, đăhc tả về object
    //hành động này có thể do ta chủ động tự đưa ra, hoặc tự generate theo template có sẵn
    //template có sẵn java giúp mình, mình k cần code

//    @Override //khác Overload đó nhen, dính đến kế thừa
//    //cả 2 thằng đều có liên quan đến 1 khái niệm POLYMORPHYSM - 50 sắc thái, đa nhân cách 
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weigth=" + weigth + '}';
        //độ lại được quyền, vì chỉ cần trả chuỗi chứa info của mình
        //y chnag mình làm card visit
        //String tmpMsg = String.format("|%-10s|%4d|%4.1f|",
        //                            name, yob, weigth); //trả chuỗi thô, k xuống hàng
        //return tmpMsg;
        return  String.format("|%-10s|%4d|%4.1f|",
                                    name, yob, weigth); // ' - ' là bến trái
                                                        //vd: |ten  |   12|   0.1|
    }
    
    //Hàm gắn việc xử lí info của chính object. AI giàu info nên xử lí
    public int getAge() {
        return 2021 - yob;
    }
    //viết code kiểu này gọi là hard code, fix value, năm sau phải sửa code thì tuổi mới đúng chuẩn
    //lấy giờ hệ thống Windows = yob;

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    
    
    //mình đi xăm hình, nhuộm tóc
    //thay đổi info ba má đã từng cho lúc ba má new/đúc ra mình
    public void setNewWeigth(double newWeigth) {
        weigth = newWeigth;
    }
    
    //vì mặc định info sẽ là giấu, khi mình giao tiếp mình mới bật nó ra
    //chia sẻ info khi được hỏi, đó chính là method hàm hành động get()
    public int getYob(){
        return yob;        
    }    
            
}

//code bên ngoài giống khuôn bị lủng
//ngoài đời: bạn (yob: 2001), tui (yob: 2001)