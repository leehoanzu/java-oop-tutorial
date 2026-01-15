
package homeworkv1;

import java.util.Scanner;

/**
 *
 * @author lehoa
 */
public class HomeWorkV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = inputAnInteger(); //nhap dau vao
//        isPrime(n); //kiem tra so nguyen to
//        printPrime(n); //in ra thong bao
        //printPrimeList();//in ra danh sach so nguyen to trong 1000 so
//        printPrimeListV2();
//            printPrimeListV3(0, 0);
//        solveSimpleEquation();
    }
    
    //ham in ra sau khi kiem tra so nguyen to
    public static void printPrime(int n) {
        if (isPrime(n) == true)
            System.out.println("That is prime");
        else
            System.out.println("That is not prime");
    }
    
    //ham nhap vao tu ban phim
    public static int inputAnInteger() {
        int n, m = -6;
        System.out.println("Please input one number: ");
        Scanner myKeyboard = new Scanner (System.in);
        n = myKeyboard.nextInt();
        int b;
        b = Byte.toUnsignedInt((byte) m);
        System.out.println("Please input one number: " + b);
        return n;
    }
    
    //ham kiem tra so nguyen to
    public static boolean isPrime(int n) {
        if (n < 2) 
            return false;
               
        //myNumber = (int) Math.sqrt(n);
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if ((n % i) == 0)
                return false;              
        return true;                   
    }
    
    //ham kiem tra tu n...1000 co bao nhieu so nguyen to
    public static void printPrimeList () {
        System.out.print("The list prim number is: ");
        for (int i = 1; i < 1000; i++) 
            if(isPrime(i))
                System.out.println(" " + i);                
        
        System.out.println("\n");
    }
    
//    //in ra 1000 so nguyen to
//    public static void printPrimeListV2 () {
//        int r = 0;
//        System.out.print("The list prim number is: ");
//        for (int i = 1; ; i++) {
//            if(isPrime(i) == true){
//                System.out.printf("%d\n", i);  
//                r++;
//                if(r == 1000)
//                    break;
//            }
//                              
//        }
//        System.out.println("\n");
//    }
    
    public static void printPrimeListV2 () {
        int r = 0, i = 0;
        System.out.print("The list prim number is: ");
        do {            
            if(isPrime(i) == true){
                System.out.printf("%d\n", i);  
                r++;  
            }
            i++;
        } while (r <= 1000);
                              
        
        System.out.println("\n");
    }
    
    public static void solveSimpleEquation(){
        float x, a, b;
        System.out.println("please input a & b");
        Scanner myKeyboardV1 = new Scanner(System.in);
        Scanner myKeyboardV2 = new Scanner(System.in);
        a = myKeyboardV1.nextInt();
        b = myKeyboardV2.nextInt();
        x = -(b/a);
        System.out.printf("Your x is: %.2f", x);
    }
    
    //dung de quy in ra 1000 so nguyen to
    public static int printPrimeListV3 (int r, int a) {
//        int r = 0, i = 0;
//        System.out.print("The list prim number is: ");
        if (r == 1000)
           return 0;
        else {
            if (isPrime(a) == true){
               System.out.printf("%d\n", a);
               r++;            
            }
            a++;
            return printPrimeListV3(r, a);
        }      
    
    }
    
}
