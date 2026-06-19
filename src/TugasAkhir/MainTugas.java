package TugasAkhir;

public class MainTugas {
    public static void main(String[] args) {

        // Daftar kategori (array String ukuran tetap)
        String[] kategori = {"Elektronik", "Makanan", "Minuman"};
        System.out.println("== Kategori Barang ==");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();

        // Membuat gudang dan menambah 5 barang
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Laptop", 8500000, 10));
        gudang.tambahBarang(new Barang("Mouse", 150000, 50));
        gudang.tambahBarang(new Barang("Keyboard", 250000, 30));
        gudang.tambahBarang(new Barang("Monitor", 2000000, 15));
        gudang.tambahBarang(new Barang("Headset", 300000, 25));

        // Tampilkan dan simpan ke berkas
        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

        // Muat kembali dari berkas dan tampilkan total nilai
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        System.out.printf("Total Nilai Persediaan: Rp%.0f%n", gudangBaru.totalNilai());
    }
}