package bagian3.kontak;

public class LatihanMandiri {
    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        buku.simpanKeBerkas();
        System.out.println();

        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
        System.out.println();

        // Soal 1: Uji cariKontak
        System.out.println("-- Uji Cari Kontak --");
        bukuLain.cariKontak("Budi");
        bukuLain.cariKontak("Dedi");
        System.out.println();

        // Soal 3: Uji hapusKontak
        System.out.println("-- Uji Hapus Kontak --");
        bukuLain.hapusKontak("Andi");
        bukuLain.tampilkanSemua();
    }
}