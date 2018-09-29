/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

/**
 *
 * @author win 7
 */
public class DemoThrows2 {
    public static void uji(int angka)throws NullPointerException,ArithmeticException{
        if(angka<0){
            throw new NullPointerException("KESALAHAN,null Pointer Exception");
        }else{
            throw new ArithmeticException("Kesalahan,Arithmetich Exception");
        }
    }
    public static void main(String[] args) {
        try{
            //uji(-12);//menimbulkan eksepsi NullpointerException
            uji(0);
        }catch(Exception e){
            System.out.println("Exception ditangkap");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
  
            
}

  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
