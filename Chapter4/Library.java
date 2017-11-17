

public class Library
{
    private String name;
    private Book[] books;
    public Library(int size, String nm) {
        this.books = new Book[size];
        this.name = nm;
    }
    public void addBook(Book a, int index) {
        books[index] = a;
    }
    public String toString() {
        String output = "This library has \n";
        for(Book a : books) {
            output += a + "\n";
        }
        
        return output;
    }
}
