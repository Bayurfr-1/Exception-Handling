/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

import static modul.pkg5.DemoMembuatEkspesi3.hitungFaktorial;

/**
 *
 * @author win 7
 */
public class TugasRumah extends Exception {
     private int JumlahBuku;
    TugasRumah(){
    
}
    TugasRumah(String pesan){
        super(pesan);    
    }
    TugasRumah(String pesan,int nilai){
        super(pesan);
        JumlahBuku=nilai;
    }
    public int getJumlahBuku(){
        return JumlahBuku;
    }
}

  class PerpustakaanTelkom{
       public static int MinjamBuku(int b)  throws TugasRumah{
           if(b<3){
               
               throw new TugasRumah("Boleh Meminjam Buku",b);
           }
           
         if(b>3){
             
           throw new TugasRumah("Tidak Boleh meminjam Buku",b);
         
         }
           int MinjamBuku = 0;
         return MinjamBuku;
       }
  public static void main(String[] args) throws TugasRumah  {
              System.out.println("Buku Perpustakaan SMK Telkom Malang");
          try{
              System.out.println("Keterangan "+MinjamBuku(1));
          }catch(TugasRumah tr) {
              System.out.println("Jumlah Buku : " + tr.getJumlahBuku());
      }
          System.out.println();
          try{
              System.out.println("Keterangan : "+MinjamBuku(10));     
          }catch(TugasRumah tr ){
              System.out.println("Jumlah buku : " +
                      tr.getJumlahBuku());
         //     nne.printStackTrace();
              System.out.println(tr);}
       }
  }

  


