package bookstore.data;

public class Book {

    private String code;
    private String title;
    private String author;
    private double price;

    public Book(String code, String title, String author, double price) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "| %-5s | %-25s | %-20s | Rp%,.0f |",
                code,
                title,
                author,
                price
        );
    }

}