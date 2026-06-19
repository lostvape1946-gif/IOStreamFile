package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class latihanmandiri2 {
    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            System.out.println("5 nama hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("\nIsi hari.txt setelah soal 1:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("\nDua nama hari ditambahkan tanpa menghapus data lama.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        System.out.println("\nIsi hari.txt setelah soal 2:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        int jumlahBaris = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("\nJumlah baris dalam hari.txt: " + jumlahBaris);
    }
}