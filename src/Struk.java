import java.util.*;
import java.text.*;

public class Struk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date hariSekarang = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("hh:mm:ss a zzz");

        // Input login kasir
        System.out.println("==================================");
        System.out.println("         LOGIN ADMIN");
        System.out.println("----------------------------------");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        // Generate random captcha
        String captcha = generateCaptcha();
        System.out.println("Captcha: " + captcha);

        // Input captcha
        System.out.print("Enter Captcha: ");
        String enteredCaptcha = scanner.nextLine();

        // Check login credentials
        if (checkLogin(username, nama, password) && enteredCaptcha.equalsIgnoreCase(captcha)) {
            System.out.println("==================================");
            System.out.println("        Toko Butik Rania");
            System.out.println("==================================");

            // Display date and time
            System.out.println("Hari/Tanggal : " + tanggal.format(hariSekarang));
            System.out.println("Waktu : "+ waktu.format(hariSekarang));
            System.out.println("----------------------------------");

            // Input customer information
            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("ID Pelanggan: ");
            String idPelanggan = scanner.nextLine();
            System.out.print("Nomor HP: ");
            String nomorHP = scanner.nextLine();

            // Input item information
            System.out.print("ID Barang: ");
            String idBarang = scanner.nextLine();
            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();
            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();

            // Calculate total payment
            double totalPembayaran = hargaBarang * jumlahBarang;

            // Struk
            System.out.println("==================================");
            System.out.println("Nama Pelanggan  : " + namaPelanggan);
            System.out.println("ID Pelanggan    : " + idPelanggan);
            System.out.println("Nomor HP        : " + nomorHP);
            System.out.println("----------------------------------");
            System.out.println("ID Barang       :" + idBarang);
            System.out.println("Nama Barang     : " + namaBarang);
            System.out.println("Harga Barang    : " + hargaBarang);
            System.out.println("Jumlah Barang   : " + jumlahBarang);
            System.out.println("----------------------------------");
            System.out.println("TOTAL PEMBAYARAN: " + totalPembayaran);
            System.out.println("==================================");
            System.out.println("Kasir           : " + nama);
            System.out.println("==================================");
            System.out.println(" ");
            System.out.println("------------TERIMA KASIH----------");
        } else {
            System.out.println("Login Gagal. Silakan coba lagi.");
        }
        scanner.close();
    }

    private static boolean checkLogin(String username, String nama, String password) {
        return "rania123".equals(username) && "12345".equals(password) && "Rania Shofi".equals(nama);
    }

    private static String generateCaptcha() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            captcha.append(randomChar);
        }
        return captcha.toString();
    }

}
