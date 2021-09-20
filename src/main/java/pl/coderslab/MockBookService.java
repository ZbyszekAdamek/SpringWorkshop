package pl.coderslab;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MockBookService implements BookService{
    public static Long getNextId() {
        return nextId;
    }

    public static void setNextId(Long nextId) {
        MockBookService.nextId = nextId;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    private static Long nextId = 4L;

    private List<Book> list;
    
    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }
    public List<Book> getList() {
        return list;
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return list.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    @Override
    public void removeBook(String id) {
        this.list.remove(Integer.parseInt(id) - 1).toString();
    }

    public void addBook(Book book) {
        book.setId(nextId++);
        list.add(book);
    }

    public void editBook(Book book)
    {
        List<Book> books = getList();
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
        setList(books);
    }

    @Override
    public String toString() {
        return "MockBookService{" +
                "list=" + list +
                '}';
    }
}
