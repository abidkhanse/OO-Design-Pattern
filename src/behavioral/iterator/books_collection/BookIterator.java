package src.behavioral.iterator.books_collection;

import java.util.List;

public class BookIterator implements IBookIterator{
    private List<Book> books;
    private int count;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < books.size();
    }

    @Override
    public Book Next() {
        return hasNext() ? books.get(count++) : null;
    }
}
