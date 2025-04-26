/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author Yati Sugiri
 * tgl: 26-04-2025
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       buah leci = new buah ();
       leci.warna = "Merah";
       leci.SetRasa("Asam");
               
       System.out.printf("Warna Leci diset %s\n", leci.warna);
       System.out.printf("Rasa Leci diset %s\n", leci.getRasa());
       
       buah jeruk = new buah ();
       jeruk.warna = "Kuning";
       jeruk.SetRasa("Manis");
       
       System.out.printf("Warna Jeruk diset %s\n", jeruk.warna);
       System.out.printf("Rasa Leci diset %s", jeruk.getRasa());
    }
    
    
}

class buah{
    public String warna; 
    private String rasa;
    
    public void SetRasa (String txRasa){
        this.rasa = txRasa;
    }
    public String getRasa (){
        return this.rasa;
    }
    
}