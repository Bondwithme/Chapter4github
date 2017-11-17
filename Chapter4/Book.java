
public class Book
{
    private Author author;
    private String title;
    public Book(Author writer, String bookName) {
        this.author = writer;
        this.title = bookName;
    }
    public String toString() {
        return "The title is " + title + " and it's written by " + author;
    }
}
