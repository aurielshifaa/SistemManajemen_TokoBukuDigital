package bookstore.logic;

import bookstore.data.Book;
import bookstore.data.BookRepository;

import java.util.List;

public class BookManager {

    private BookRepository repository;

    public BookManager() {

        repository = new BookRepository();

        repository.addBook(
                new Book("B001", "Pemrograman Java", "Andi", 85000));

        repository.addBook(
                new Book("B002", "Basis Data", "Budi", 90000));

        repository.addBook(
                new Book("B003", "Cantik Itu Luka", "Eka Kurniawan", 90000));

        repository.addBook(
                new Book("B004", "Bumi", "Tere Liye", 98000));

        repository.addBook(
                new Book("B005", "Gadis Kretek", "Ratih Kumala", 80000));

        repository.addBook(
                new Book("B006", "Laskar Pelangi", "Andrea Hirata", 95000));

        repository.addBook(
                new Book("B007", "Negeri 5 Menara", "Ahmad Fuadi", 88000));

        repository.addBook(
                new Book("B008", "Dilan 1990", "Pidi Baiq", 75000));

        repository.addBook(
                new Book("B009", "Ayat-Ayat Cinta", "Habiburrahman El Shirazy", 92000));

        repository.addBook(
                new Book("B010", "Ronggeng Dukuh Paruk", "Ahmad Tohari", 85000));
    }

    public List<Book> getBooks() {
        return repository.getAllBooks();
    }

    public Book searchBook(String title) {
        return repository.findBook(title);
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public boolean deleteBook(String title) {
        return repository.deleteBook(title);
    }

    public int countBooks() {
        return repository.countBooks();
    }
}