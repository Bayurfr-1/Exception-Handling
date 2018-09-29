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
public class multiplecatch {
    public static void main(String[] args) {
       String Namakotakelahiran;
        try{
            int a= 3/0;
            int num = Integer.parseInt(args[0]);
            System.out.println("Perintah selanjutnya : ");
        }
        catch(ArrayIndexOutOfBoundsException e ){
        }
        catch(NullPointerException e ){
            
        }
        catch(Exception e ){          
        }
       Namakotakelahiran(0);
            
        }

    private static void Namakotakelahiran() {
       System.out.println("Malang");
    }

    private static void Namakotakelahiran(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }

   
    

