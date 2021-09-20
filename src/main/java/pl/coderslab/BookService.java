package pl.coderslab;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getList();
    Optional<Book> getBookById(Long id);
    void removeBook(String id);
    void addBook(Book book);
    void editBook(Book book);

}
