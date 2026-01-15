
package data;

public class Rectangle {

    private String owner; //______
    private String color; //______
    private double width; //___5___
    private double length; //__ 20____
    private double area; //__100____ //thuoc tinh/dd dẫn xuất, derived fied
                                    //dc tính từ thằng khác, w*l
                                    //k nên đưa qua phễu, nguy cơ mâu thuẫn
                                    //do: dt 1 đằng, 2 cạnh 1 nẻo
    //né k chơi dẫn xuất. ngoan cố new đúng 5 * 20 = 100
    //setWidth(10) -> chết nếu k cập nhật s (area)
    //s1 * dg = tt
    //dẫn xuất có thể tính được từ thằng data khác, vậy nó nên biến thành
    //hành vi của object thì hợp lý hơn
    //tui/bạn đuề có năm sinh -> cắc cỡ đi hỏi tuổi, getAge() là hà, hay hơm
    //                          , age dẫn xuất, cá mỗi năm age++ đúng thời điẻm
    //HÀM THUỘC Cứ THẰNG NÀO CÓ NHIỀU DATA, TÍNH DTCNSEX lÀ 1 Hàm CỦA HCN

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }

    
    public void paint() {
        System.out.printf("|RECTANGLE|%-15S|%-10S|%4.1f|%4.1f|%7.2f|\n", 
                                owner, color, width, length, getArea());
    }
    
    public double getArea() {
        return width * length; //t éo in,return để re use nơi khác
    }
    
    //90.0 x 90.9 = 8100.00
}
