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
public class JavaApplication1 {
            static String nama; // nama adalah variable
            static int angka; // int, float, dll adalah tipe data = primitif
            static float koma;
            static double koma2;

   
    
    public static void main(String[] args) {
//            nama = "husna";
//            angka = 123;
//            koma = 9.0f;
//            koma2 = 20.0;
//            
//            System.out.println("namaku" + nama +
//                                "\n nomor rumah" + angka +
//                                "\n nilai" + koma );
            Manusia2 lk2 = new Manusia2(); //lk2 adalah objek yang dibuat dari kerangka objek manusia
            Manusia2 pr = new Manusia2();
            Manusia2 m = new Manusia2("zahro", 'p', 23);
            Manusia3 b = new Manusia3("abang", 'l', 30);
//            lk2.nama = "Ady"; //value yang diberikan ddengan memanggil variable dari kerangka objek manusia
//            lk2.alamat = " tebet";
//            lk2.usia =25;
//            
//            pr.nama = "nadya";
//            pr.alamat = "depok";
//            pr.usia = 30;
            
            lk2.setNama("Ady");
//            System.out.println("nama = " + lk2.getNama());
            
            pr.setIdentitas("nadya", 'a', 23);
            
            System.out.println(b.getIdentitas());
            System.out.println(m.getIdentitas());
            System.out.println("nama = " + lk2.getNama());
            //System.out.println(pr.getIdentitas());
            
//            System.out.println("nama dia adalah " + lk2.nama + " dan " + pr.nama +
//                                "\n alamat di " + lk2.alamat + " dan "+ pr.alamat +
//                                "\n usia " + lk2.usia + " dan " +pr.usia);
            
            
        
        // TODO code application logic here
    }
    
}

class Manusia2{  //manusia adalah kertangka objek
        String nama;
        String alamat;
        int usia;
        char genre;
        
        public Manusia2(){
            //constractor kosong harus ada
        }
        
        public Manusia2(String nama, char jk, int usia){
            this.nama = nama;
            genre = jk;
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
       
       public String helloHusna(){
           return "Hello Husna";
       }
       
       public String haiSenpai(){
           return "haiSenpai";
       }
       public int a(){
           return 1;
       }
}