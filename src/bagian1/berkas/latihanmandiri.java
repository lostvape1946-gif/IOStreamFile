package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class latihanmandiri {
    public static void main(String[] args) throws IOException {

        
        File laporan = new File("laporan.txt");
        if (laporan.exists()) {
            System.out.println("Berkas ada: " + laporan.getName());
            System.out.println("Ukuran (byte): " + laporan.length());
        } else {
            System.out.println("Berkas tidak ditemukan: " + laporan.getName());
        }

        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder berhasil dibuat: " + folder.getName());
        } else {
            System.out.println("Gagal membuat folder (mungkin sudah ada): " + folder.getName());
        }

        File sementara = new File("sementara.txt");
        sementara.createNewFile();
        System.out.println("Sebelum dihapus, berkas ada: " + sementara.exists());
        sementara.delete();
        System.out.println("Sesudah dihapus, berkas ada: " + sementara.exists());
    }
}