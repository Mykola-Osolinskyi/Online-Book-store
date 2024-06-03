package mate.academy.bookstore;

import mate.academy.bookstore.model.Book;
import mate.academy.bookstore.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BookStoreApplication {
    private final BookService bookService;

    public BookStoreApplication(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            //how to connect to db?


            Book inferno = new Book();
            inferno.setAuthor("Dan Brown");
            inferno.setPrice(BigDecimal.valueOf(100));
            inferno.setTitle("Inferno");
            bookService.save(inferno);
            System.out.println(bookService.findAll());
        };
    }

}
