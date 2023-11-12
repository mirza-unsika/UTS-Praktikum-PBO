package UTS_No_2;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar nama admin
        List<String> adminNames = Arrays.asList("Mirza", "Admin1");

        while (true) {
        	System.out.println("List Admin: 1. Mirza 2. Admin1");
            System.out.println("Masukkan nama pengguna:");
            String nama = scanner.nextLine();

            if (adminNames.contains(nama)) {
                Admin admin = new Admin(nama);
                // Tampilkan menu admin
                admin.menuAdmin(scanner);
            } else {
                Admin admin = new Admin("Admin1"); // Contoh admin
                User user = new User(nama, admin);
                // Tampilkan menu user
                user.menuUser(scanner);
            }

            System.out.println("1. Logout");
            System.out.println("2. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            if (opsi == 2) {
                break;
            }
        }
    }
}
