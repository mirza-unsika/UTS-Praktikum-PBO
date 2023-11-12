package UTS_PBO;

import java.util.Scanner;

public class HewanBeraksi {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jenis hewan
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = input.next(); // Mengganti input.nextLine() dengan input.next()

        // Membuat variabel hewan bertipe Hewan
        Hewan hewan;

        // Menggunakan percabangan untuk menentukan jenis hewan
        if (jenisHewan.equalsIgnoreCase("Kucing")) { // Mengganti equalsIgnoreCase() dengan equals()
            // Menginisialisasi hewan dengan objek Kucing
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) { // Mengganti equalsIgnoreCase() dengan equals()
            // Menginisialisasi hewan dengan objek Anjing
            hewan = new Anjing();
        } else {
            // Menampilkan pesan kesalahan jika input tidak valid
            System.out.println("Input tidak valid!");
            return;
        }

        // Memanggil metode bersuara() dengan polimorfisme
        hewan.bersuara();

        // Menggunakan percabangan untuk mengecek jika hewan adalah mamalia atau bukan
        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            // Menampilkan pesan bahwa hewan adalah mamalia
            System.out.println("Hewan tersebut adalah mamalia.");
        } else {
            // Menampilkan pesan bahwa hewan bukan mamalia
            System.out.println("Hewan tersebut bukan mamalia.");
	}

} 
}