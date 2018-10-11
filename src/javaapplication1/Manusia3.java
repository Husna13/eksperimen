/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Husna Muthmainnah
 */
public class Manusia3 {
    
    String nama;
        String alamat;
        int usia;
        char genre;
        
        public Manusia3(){
            //constractor kosong harus ada
        }
        
        public Manusia3(String nama, char jk, int usia){ // parameter itu yang String nama, char jk, int usia, class itu public manusia3
            this.nama = nama; // this itu karena nama variabel nya sama dengan parameter.. jdi this menunjuk ke variable (this.nama), 
            genre = jk; // tidak pakai this karena varable dengan nama parameter namanya berbeda.
            this.usia = usia;
            
        }
        
       public void setNama(String nama){
           this.nama = nama;
    }
       public String getNama(){
           return nama;
       }
       
       public void setIdentitas(String nama, char genre, int usia){
           this.nama = nama;
           this.genre = genre;
           this.usia = usia;
       }
       
       public String getIdentitas(){
           return "nama " + nama + "genre :" +genre+ "usia: " +usia; 
       }
    
}
