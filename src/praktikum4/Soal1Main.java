package praktikum4.soal1;

import java.util.Scanner;

/**
 *
 * @author Adel
 */
public class Soal1Main {
    public static void main(String[] args) {
        String judul, penulis;
        Integer tahun;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Judul; ");
        judul = keyboard.nextLine();
        System.out.print("Penulis: ");
        penulis = keyboard.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = keyboard.nextInt();
        
        Buku bukuSaya = new Buku(judul, penulis, tahun);
        bukuSaya.display();
    }
}

