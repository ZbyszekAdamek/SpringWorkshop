package pl.coderslab;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
@Primary
public class JpaBookService implements BookService {

    private final BookRepository bookRepository;

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
        this.bookRepository.findAll().remove(Integer.parseInt(id));
    }

    @Override
    public void addBook(Book book) {
        bookRepository.findAll().add(book);
    }

    @Override
    public void editBook(Book book) {
        List<Book> books = bookRepository.findAll();
        for (Book b : books) {
            if (book.getId().equals(b.getId())) {
                b.setIsbn(book.getIsbn());
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                b.setPublisher(book.getPublisher());

                b.setType(book.getType());
                break;
            }
        }
    }
}

