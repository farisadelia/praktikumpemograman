package praktikum4.soal2;

/**
 *
 * @author Adel
 */
abstract class Buku {
    protected String judul;
    protected String penulis;
    protected Integer tahun;
    
    protected void display() {
        System.out.println("");
        System.out.println("Data yang baru diinputkan adalah");
    }  
}

class Novel extends Buku {
    private String genre;
    private String sinopsis;
        
    public Novel(String j, String p, String t, String g, String s) {
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.genre = g;
        this.sinopsis = s;
    }
    
    public String getNovelDetail() {
        display();
        return "Sebuah novel bergenre " + genre + " dengan judul \"" + judul + "\". Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + "." + "\nSinopsis : " + sinopsis.substring(0, 59) + " ....";
    }
 }

class Komik extends Buku {
    private Integer volume;
    private String sinopsis;
        
    public Komik(String j, String p, String t, Integer v, String s) {
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }
    
    public String getKomikDetail() {
        display();
        return "Sebuah komik dengan judul \"" + judul + "\". Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun + "." + " Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah.\nSinopsis : " + sinopsis.substring(0, 64) + " ....";
    }
 }

