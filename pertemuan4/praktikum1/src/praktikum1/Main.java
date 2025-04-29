package praktikum1;
import praktikum1.buku.Buku;
import praktikum1.author.Author;

/**
 *  
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku = new Buku();
        buku.setIsbn("89-09-08");
        buku.setJudulBuku("Boruto blue fortex");
        buku.setAuthor("masasi kisimoto");
        buku.setHarga(10000);
        
        
        System.out.println("TAMPIL BUKU KE 1");
        buku.tampilBuku();
        Author author = new Author();   
    }
    
}
