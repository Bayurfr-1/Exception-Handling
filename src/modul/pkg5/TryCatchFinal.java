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
public class TryCatchFinal {
    public TryCatchFinal() {
        }
    public static void main(String[] args) {
        int nol=0;
        int angka=10;
        try{
            int hasil =angka/nol;
            System.out.println("Hasil : " + hasil);
        }
        catch(ArithmeticException e){
            System.out.println("Terjadi pembagian dengan nol.Exception ditangkap");
        }
        finally {
            System.out.println("Kalimat di blok finally");
        }
        System.out.println("Kalimat di luar blok try-catch Finally");
    }
}