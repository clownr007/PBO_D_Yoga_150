import java.util.Scanner; // digunakan untuk mendeklarasikan scanner untuk input user atau pengguna.
import java.time.LocalDate; // digunakan untuk mendeklarasikan localdate atau informasi waktu saat ini.

public class Main { // digunakan untuk deklarasi class utama.
    public static void main(String[] args) { // digunakan sebagai titik awal eksekusi program java.
        Scanner scanner = new Scanner(System.in); // digunakan untuk input user atau pengguna.
        System.out.print("Masukkan nama: "); // digunakan untuk menampilkan tulisan.
        String nama = scanner.nextLine(); // digunakan untuk membaca input user.
        System.out.print("Masukkan jenis kelamin (P/L): "); // digunakan untuk menampilkan tulisan.

        char jenisKelamin = scanner.next().charAt(0); // digunakan untuk membaca input.
        System.out.print("Masukkan tahun lahir: "); // menampilkan tulisan tahun lahir.

        int tahunLahir = scanner.nextInt(); // digunakan untuk input tahun lahir.
        int tahunSekarang = LocalDate.now().getYear(); // digunakan untuk mengambil informasi tahun ini.
        int umur = tahunSekarang - tahunLahir; // menghitung umur pengguna dengan mengurangi tahun lahir dengan tahun sekarang.
        String jenisKelaminStr = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan"; // digunakan untuk mengkonversi jenis kelamin laki-laki atau perempuan dari huruf.
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminStr);        // keempat syntax ini menampilkan data diri.
        System.out.println("Umur          : " + umur + " tahun");


        scanner.close(); // digunakan untuk menutup scanner.
    }
}
