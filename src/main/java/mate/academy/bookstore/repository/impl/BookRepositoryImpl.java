package mate.academy.bookstore.repository.impl;

import java.util.List;
import mate.academy.bookstore.model.Book;
import mate.academy.bookstore.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return List.of();
    }
}
