package UTS_No_2;
import java.util.Scanner;

class User extends Pengguna {
    private Admin admin;
    public User(String nama, Admin admin) {
        super(nama);
        this.admin = admin;
    }
    @Override
    public void lihatBuku() {
        admin.lihatBuku();
    }
    public void menuUser(Scanner scanner) {
        System.out.println("Selamat datang, " + nama);
        while (true) {
            System.out.println("\n1. Lihat Buku");
            System.out.println("2. Keluar");
            System.out.print("\nPilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            switch (opsi) {
                case 1:
                    lihatBuku();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}
