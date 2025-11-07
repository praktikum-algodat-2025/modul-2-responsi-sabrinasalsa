public class Pelanggan{
    bukuStack daftarBuku;
    Pelanggan next;
    
    public Pelanggan(bukuStack daftarBuku){
        this.daftarBuku = daftarBuku;
        this.next = null;
    }
}