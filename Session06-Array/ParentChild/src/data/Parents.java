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
public class Parents {
    
    protected String assetOne; //ngôi nhà
    protected String assetTwo;

    public Parents(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parents{" + "assetOne=" + assetOne + ", assetTwo=" + assetTwo + '}';
    }
    
    public void showProfile() {
        System.out.println("PARENT > asset1: " + assetOne + "; asset2: " + assetTwo);      
    }
   
    
}
