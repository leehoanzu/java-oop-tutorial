/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author lehoa
 */
public class RightTriangle extends Triangle{
    
    
    
    public RightTriangle(double edgeA, double edgeB) { //chỉ cần 2 cạnh góc vuông hoi        
        super(edgeA, edgeB, Math.sqrt(Math.pow(edgeA, 2) + Math.pow(edgeB, 2)));        
    }    
      
    
    @Override
    public void shape(int n) {        
        System.out.printf("|RIGHT_TRIANGLE|#%3d|a: %4.2f|b: %4.2f| - |s: %4.2f|\n", (n + 1), edgeA, edgeB, calArea());
               
    }
    
}
