import java.util.*;

public class Student {
    private static List<Book> books = new ArrayList<Book>();
    private static Library library;
    public static void main(String[] args) {
        library = Library.getInstance();
        studentBorrow("Think in java");
        studentBorrow("Think core v1");
        System.out.println("Borrow again");
        studentBorrow("Think core v1");

        for(Book book: books) {
            book.borrow();
        }

        System.out.println("borrowed " + books.size() );
        System.out.println("lib actually borrow"  + library.getAllBookSize() );
    }

    private static void studentBorrow(String bookName) {
        books.add(library.libToBorrow(bookName) ) ;
    }
}
