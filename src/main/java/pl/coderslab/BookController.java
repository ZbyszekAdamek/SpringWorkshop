package pl.coderslab;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }


    @GetMapping("")
    public String showAll() {
        List<Book> books = bookService.getList();

        String response = "";
        for (int i = 0; i < books.size(); i++) {
            response = response + books.get(i).toString();
        }
        return response;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getById(@PathVariable String id) {
        List<Book> books = bookService.getList();
        return books.get(Integer.parseInt(id) - 1).toString();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void removeById(@PathVariable String id) {
        /*List<Book> books = mockBookService.getList();
        return books.remove(Integer.parseInt(id) - 1).toString();*/
        bookService.removeBook(id);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }
}

