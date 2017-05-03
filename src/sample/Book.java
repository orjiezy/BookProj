package sample;

/**
 * Created by kama on 02.05.2017.
 */
public class Book {

    private int id;
    private String author;
    private String bookName;
    private String description;

    public Book(int id, String author, String bookName, String description) {
        this.id = id;
        this.author = author;
        this.bookName = bookName;
        this.description = description;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
