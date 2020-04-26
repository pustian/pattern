import java.util.*;

public class Library {
    private Map<String, Book> bookPools = new HashMap<String, Book>();
    private static Library factory = new Library();
    // singleton
    public static Library getInstance() {
        return factory;
    }

    public Book libToBorrow(String bookName) {
        Book order = null;
        // 
        if(bookPools.containsKey(bookName) ) {
            order = bookPools.get(bookName);
        } else {
            order = new ConcreteBook(bookName);
            bookPools.put(bookName, order);
        }
        return order;
    }

    public int getAllBookSize() {
        return bookPools.size();
    }

}
