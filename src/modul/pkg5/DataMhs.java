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
public class DataMhs {
    private String nim;
    private String nama;
    private double nilai;
    
    public void setNim(String vnim){
        try{
            nim = vnim;
            if(nim==null) {
                throw new NullPointerException();
                
            }
            
        }catch(NullPointerException npe){
            System.out.println("Kesalahan"+"Nim mahasiswa tidak boleh null");
        }
    }
    public String getNim(){
        return nim;
    }
    public void setNama(String vNama){
        try{
            nama=vNama;
            if(nama==null){
                throw new NullPointerException ();
                
                    
            }
            }catch(NullPointerException npe){
                System.out.println("Kesalahan"+"Nama tidak boleh null");
        }
    }
    public String getNama(){
        return nama;
    }
    public void setNilai(int vnilai) {
        nilai=vnilai;
    }
    public double getNilai(){
        return nilai;
    }
        
}

class DemoThrow{
    public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.setNim("2345654675462534");
        obj.setNama("BAYU");
        obj.setNilai(100);
        
        System.out.println("NIM : "+obj.getNim());
        System.out.println("Nama : "+obj.getNama());
        System.out.println("Nilai : "+obj.getNilai());
        
    }
}
