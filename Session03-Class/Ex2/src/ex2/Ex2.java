
package ex2;

import data.BookV2;

public class Ex2 {

   
    public static void main(String[] args) {
        
        BookV2 novel = new BookV2 (2000, "The God Father", 010);
        novel.screen();
        novel.setProfile();
        novel.screen();
        System.out.println("your new price is " + novel.getPrice());
        System.out.println(novel);
    }
    
}
