/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Husna Muthmainnah
 */
public class LatihanKedua {
    public static void main(String[] args) {
        LatihanPrivate kampus = new LatihanPrivate();
       // kampus.mahasiswa = "Husna";
        kampus.setMahasiswa("Husna");
        
        System.out.println("Nama " + kampus.getMahasiswa());
    }
    
}
