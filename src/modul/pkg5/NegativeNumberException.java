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
public class NegativeNumberException extends Exception {
    private int bilangan;
    NegativeNumberException(){
    
}
    NegativeNumberException(String pesan){
        super(pesan);    
    }
    NegativeNumberException(String pesan,int nilai){
        super(pesan);
        bilangan=nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}
    class DemoMembuatEkspesi3{
       public static int hitungFaktorial(int n) 
               throws NegativeNumberException{
           if(n<0){
               throw new NegativeNumberException("Bilangan tidak boleh negatif",n);
           }
           int hasil =1;
           for(int i=n;i>=1;i--){
               hasil*=i;
           }
           return hasil;
           
       }  
       public static void main(String[] args) {
          System.out.println("pada saat menghitung nilai 5");
          try{
              System.out.println("hasil = "+hitungFaktorial(5));
          }catch(NegativeNumberException nne){
              System.out.println("Hasil : "+nne.getBilangan());
       
      
        }
          System.out.println("Pada saat menghitung -5");
          try{
              System.out.println("hasil : "+hitungFaktorial(-5));     
          }catch(NegativeNumberException nne ){
              System.out.println("Bilangan : "+
                      nne.getBilangan());
         //     nne.printStackTrace();
              System.out.println(nne);
  }
       }

  
    }
