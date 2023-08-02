package src.behavioral.iterator.books_collection;
import java.util.ArrayList;

public class Library implements IBookCollection{

    ArrayList<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    @Override
    public IBookIterator getIterator() {
        return new BookIterator(this.books);
    }

}
