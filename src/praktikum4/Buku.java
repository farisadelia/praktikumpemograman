package praktikum4.soal1;


/**
 *
 * @author Adel
 */
public class Buku {
    private String judul, penulis;
    private Integer tahun;
        
    public Buku(String j, String p, Integer t) {
        judul = j;
        penulis = p;
        tahun = t;
    }
    
    public void display() {
        System.out.println("");
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}
