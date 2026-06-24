package bookstore.data;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public boolean deleteBook(String title) {
        Book book = findBook(title);

        if (book != null) {
            books.remove(book);
            return true;
        }

        return false;
    }

    public int countBooks() {
        return books.size();
    }
}