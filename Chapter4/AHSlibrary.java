
public class AHSlibrary
{
   public static void main(String[] args) {    
   Library ahs = new Library(10, "Acalanes");
   Author a = new Author("jim", 32);
   Book b = new Book(a, "java book"); 
   ahs.addBook(b, 1);
   Author j = new Author("grege", 680);
   Book h = new Book(j, "bleh");
   ahs.addBook(h, 2);
   System.out.println(ahs);
}
}
