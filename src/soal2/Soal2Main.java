package praktikum4.soal2;

import java.util.Scanner;

/**
 *
 * @author Adel
 */
public class Soal2Main {
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int pilihan;
       
       System.out.println("Pilih buku yang ingin diinputkan:");
       System.out.println("1 = Novel");
       System.out.println("2 = Komik");
       System.out.print("Masukkan pilihan: ");
       pilihan = Integer.parseInt(keyboard.nextLine());       
       
       if (pilihan == 1) {
           String j, p, t, g, s;
           
           System.out.print("Judul: ");
           j = keyboard.nextLine();
           System.out.print("Penulis : ");
           p = keyboard.nextLine();
           System.out.print("Tahun Terbit : ");
           t = keyboard.nextLine();
           System.out.print("Genre : ");
           g = keyboard.nextLine();
           System.out.print("Sinopsis : ");
           s = keyboard.nextLine();
           
           Novel bukuSaya = new Novel(j, p, t, g, s);
           
           System.out.println(bukuSaya.getNovelDetail());
       } else if (pilihan == 2) {
           Integer v;
           String j, p, t, s;
           
           System.out.print("Judul: ");
           j = keyboard.nextLine();
           System.out.print("Penulis : ");
           p = keyboard.nextLine();
           System.out.print("Tahun Terbit : ");
           t = keyboard.nextLine();           
           System.out.print("Volume : ");
           v = Integer.valueOf(keyboard.nextLine());
           System.out.print("Sinopsis : ");
           s = keyboard.nextLine();
           
           Komik bukuSaya = new Komik(j, p, t, v, s);
           
           System.out.println(bukuSaya.getKomikDetail());
       } else {
           System.out.println("Input hanya boleh 1 atau 2!");
       }
   }
}
