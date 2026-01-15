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
public class Sorting {

    //thêm 1 main () ngoài main() bắt đầu, main() phải mở lên Shift-f6
    //f6 đứng ở class nào cx đc, ưu tiên/default chạy main() đầu tiên tạo ra
    //có thể dổi main() default dc nếu mún
    //phải chuột Property/Run/...
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
    }

    public static void sortStudentList () {
        Student arr[] = new Student [] {new Student ("SE9", "chín", 19, 9),
                                         new Student ("SE5", "năm", 15, 5),
                                         new Student ("SE7", "bảy", 17, 7),
                                         new Student ("SE3", "ba", 13, 3),
                                         new Student ("SE8", "tám", 19, 8), };
        System.out.println("The student list before sorting");
        for (Student x : arr) 
            x.showProfile();
        
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i; j < arr.length; j++)
                if ( arr[i].getGpa() > arr[j].getGpa()) {
                Student t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        
        System.out.println("The student list after sorting");
            
        for (Student x : arr) {
           x.showProfile();
        }
    
}
    
    
    public static void sortPrimitiveArray() {
        int[] arr = new int[]{1000, -1000, 1000, 5, 10, -15, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) 
            System.out.print(x + " ");     
        
        //interchange sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //ì thằng đầu lớn hơn thằng sau, đổi ngay và lun
                if (arr[i] < arr[j]) { //[i] trước [j]
                int t = arr[j];         // m trước t, mà m lại lớn hơn t
                arr[j] = arr[i];        //đổi
                arr[i] = t;
                }   //> tăng dần, < giảm dần             
            }            
        }
        
        //if thằng đầu lớn hơn thằng sau là có chuyện, đổi ngay và luôn
//        if (arr[0] > arr[1]) {
//            int t = arr[0];
//            arr[0] = arr[1];
//            arr[1] = t;
        //}
        System.out.println("After sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");  
            
        }
}


}