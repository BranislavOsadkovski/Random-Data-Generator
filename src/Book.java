import java.util.Calendar;

public class Book {


    private Long id;

    private String title;

    private Calendar yearPublished;

    private String author;

    public Book() {
    }

    public Book(Long id, String title, Calendar yearPublished, String author) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Calendar yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished.getTime() +
                ", author='" + author + '\'' +
                '}';
    }
}
