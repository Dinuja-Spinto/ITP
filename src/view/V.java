/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Dinuja pinto
 */
public class V {
    
    private byte[] picture;
    
    public V(byte[]image){
        
        this.picture = image;
    }
    
    public byte[] getImage(){
        
        return picture;
}
    
    public static void main(String args[]){
        
            EmpDetails ShowEmp = new EmpDetails();
            ShowEmp.setVisible(true);
        //ShowEmp.show();
    }
    
}
