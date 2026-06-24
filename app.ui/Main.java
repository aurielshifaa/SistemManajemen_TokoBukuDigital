package bookstore.ui;

import bookstore.logic.BookManager;
import bookstore.data.Book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BookManager manager = new BookManager();

        int pilihan;

        System.out.println("==============================================================");
        System.out.println("           SISTEM MANAJEMEN TOKO BUKU DIGITAL");
        System.out.println("==============================================================");

        do {

            System.out.println("\n==============================================================");
            System.out.println("| No | Menu                                   |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("| 1  | Tampilkan Daftar Buku                  |");
            System.out.println("| 2  | Cari Buku Berdasarkan Judul            |");
            System.out.println("| 3  | Tambah Buku                            |");
            System.out.println("| 4  | Hapus Buku                             |");
            System.out.println("| 5  | Lihat Jumlah Buku                      |");
            System.out.println("| 6  | Keluar                                 |");
            System.out.println("==============================================================");

            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println("\n================================================================================");
                    System.out.println("                            DAFTAR BUKU DIGITAL");
                    System.out.println("================================================================================");

                    System.out.printf(
                            "| %-5s | %-25s | %-20s | %-12s |\n",
                            "Kode",
                            "Judul",
                            "Penulis",
                            "Harga"
                    );

                    System.out.println("--------------------------------------------------------------------------------");

                    for (Book b : manager.getBooks()) {
                        System.out.println(b);
                    }

                    System.out.println("================================================================================");

                    break;

                case 2:

                    System.out.print("Masukkan Judul Buku : ");
                    String judul = input.nextLine();

                    Book hasil = manager.searchBook(judul);

                    if (hasil != null) {

                        System.out.println("\n==============================================================");
                        System.out.println("                    HASIL PENCARIAN");
                        System.out.println("==============================================================");
                        System.out.println(hasil);

                    } else {

                        System.out.println("Buku tidak ditemukan!");
                    }

                    break;

                case 3:

                    System.out.print("Kode Buku   : ");
                    String kode = input.nextLine();

                    System.out.print("Judul Buku  : ");
                    String judulBaru = input.nextLine();

                    System.out.print("Penulis     : ");
                    String penulis = input.nextLine();

                    System.out.print("Harga       : ");
                    double harga = input.nextDouble();
                    input.nextLine();

                    manager.addBook(
                            new Book(kode, judulBaru, penulis, harga));

                    System.out.println("Buku berhasil ditambahkan!");

                    break;

                case 4:

                    System.out.print("Masukkan Judul Buku yang Akan Dihapus : ");
                    String hapus = input.nextLine();

                    if (manager.deleteBook(hapus)) {
                        System.out.println("Buku berhasil dihapus!");
                    } else {
                        System.out.println("Buku tidak ditemukan!");
                    }

                    break;

                case 5:

                    System.out.println("\n==============================================================");
                    System.out.println("Jumlah Buku Tersedia : "
                            + manager.countBooks());
                    System.out.println("==============================================================");

                    break;

                case 6:

                    System.out.println("\n==============================================================");
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    System.out.println("==============================================================");

                    break;

                default:

                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 6);

        input.close();
    }
}