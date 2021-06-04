import java.util.Arrays;
/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class BookList {
    private Book[] books;
    public BookList() {
    }
    public void addBook(Book book){
        if (books == null){
            books = new Book[0];
        }
        books = Arrays.copyOf(books,books.length+1);
        books[books.length-1] = new Book(book.getIsbn(),book.getTitle(),book.getAuthor());
    }
    public Book[] searchBook(String isbn){
        return null;
    }
    public void showAllBooks(){
        if (books != null){
            System.out.println("|ISBN  |Title  |Author");
            for (Book book : books) {
                System.out.print("| " + book.getIsbn() + " ");
                System.out.print("| " + book.getTitle() + " ");
                System.out.print("| " + book.getAuthor()+ " ");
                System.out.println();
            }
        }
        else{
            System.out.println("No Books to Show");
        }
    }
}
