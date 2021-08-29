package pl.coderslab;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService {

    private static Long nextId = 4L;

    private List<Book> list;
    
    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }
    public List<Book> getList() {
        return list;
    }

    public void removeBook(String id){
        this.list.remove(Integer.parseInt(id) - 1).toString();
    }
    public void addBook(Book book) {
        book.setId(nextId++);
        list.add(book);
    }


    @Override
    public String toString() {
        return "MockBookService{" +
                "list=" + list +
                '}';
    }
}
