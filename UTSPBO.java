/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pbo;

/**
 *
 * @author C
 */
public class UTSPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka = new int[10];
        String[] namaTeman = new String[5];
        
        //Mengisi array nilai dengan nilai integer
        angka[0] = 70;
        angka[1] = 90;
        angka[2] = 100;
        angka[3] = 80;
        angka[4] = 30;
        angka[5] = 10;
        angka[6] = 68;
        angka[7] = 50;
        angka[8] = 25;
        angka[9] = 70;
        
        //mengisi array namaTeman dengan nama teman
        namaTeman[0] = "Delon";
        namaTeman[1] = "virzi";
        namaTeman[2] = "Jangkrik";
        namaTeman[3] = "Bangke";
        namaTeman[4] = "sambal";
        
        //menampilkan data diriku dengan Record
        String nama = "Fransiskus Febrien";
        String nim = "22201099";
        String alamat = "Rembuksari Malang";
        int umur = 19;
        double tinggiBadan = 163;
        
        System.out.println("Nilai:");
        for (int i = 0;i < angka.length;i++) {
            System.out.println(angka[i]);
        }
        
        System.out.println("\nNama Teman");
        for (int i = 0;i < namaTeman.length;i++) {
            System.out.println(namaTeman[i]);
        }
        
        System.out.println("\nData Diri");
        System.out.println("Nama: " + nama);
        System.out.println("Nim:" + nim);
        System.out.println("Alamat:" + alamat);
        System.out.println("Umur :" + umur);
        System.out.println("TinggiBadan: " + tinggiBadan);
        
    }
    
}
