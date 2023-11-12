package UTS_No_2;
import java.util.ArrayList;
import java.util.Scanner;

class Admin extends Pengguna {
    private ArrayList<Buku> buku;
    public Admin(String nama) {
        super(nama);
        buku = new ArrayList<>();
        // Tambahkan beberapa buku ke sistem secara default
        tambahBuku(new Buku("Sci-Fi", "Dune"), false);
        tambahBuku(new Buku("Fantasy", "Harry Potter"), false);
    }
    public void tambahBuku(Buku buku, boolean cetakPesan) {
        this.buku.add(buku);
        if (cetakPesan) {
            System.out.println("Buku '" + buku.getJudul() + "' telah ditambahkan.");
        }
    }
    public void hapusBuku(Buku buku) {
        this.buku.remove(buku);
        System.out.println("Buku '" + buku.getJudul() + "' telah dihapus.");
    }
    @Override
    public void lihatBuku() {
        System.out.println(String.format("|%-20s | %-20s|", "Judul", "Genre"));
        System.out.println("---------------------------------------------");
        for (Buku b : buku) {
            System.out.println(String.format("|%-20s | %-20s|", b.getJudul(), b.getGenre()));
        }
    }
    public void menuAdmin(Scanner scanner) {
        System.out.println("Selamat datang, Admin " + nama);
        while (true) {
            System.out.println("\n1. Lihat Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Keluar");
            System.out.print("\nPilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            switch (opsi) {
                case 1:
                    lihatBuku();
                    break;
                case 2:
                    System.out.print("Masukkan genre buku: ");
                    String genre = scanner.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    tambahBuku(new Buku(genre, judul), true);
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    judul = scanner.nextLine();
                    Buku bukuUntukDihapus = null;
                    for (Buku b : buku) {
                        if (b.getJudul().equals(judul)) {
                            bukuUntukDihapus = b;
                            break;
                        }
                    }
                    if (bukuUntukDihapus != null) {
                        hapusBuku(bukuUntukDihapus);
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}