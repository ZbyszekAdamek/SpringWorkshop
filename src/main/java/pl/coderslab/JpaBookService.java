package pl.coderslab;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Primary
public class JpaBookService implements BookService {

    private final BookRepository bookRepository;

    private static Long nextId = 4L;

    private List<Book> list;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getList() {
        return bookRepository.findAll();
    }


    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void removeBook(String id) {

    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void editBook(Book book) {

    }
}

