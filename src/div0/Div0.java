/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div0;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class Div0 {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    try{
        double div=23/0;
        System.out.println(div);
        throw new ArithmeticException();
    }
    catch(ArithmeticException e){
        System.out.println("div variable can not be divided by zero");
    }
    
    
    }
    
}
