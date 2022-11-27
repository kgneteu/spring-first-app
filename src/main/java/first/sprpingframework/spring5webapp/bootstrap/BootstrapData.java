package first.sprpingframework.spring5webapp.bootstrap;

import first.sprpingframework.spring5webapp.domain.Author;
import first.sprpingframework.spring5webapp.domain.Book;
import first.sprpingframework.spring5webapp.domain.Publisher;
import first.sprpingframework.spring5webapp.repositiories.AuthorRepository;
import first.sprpingframework.spring5webapp.repositiories.BookRepository;
import first.sprpingframework.spring5webapp.repositiories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("John", "Nowak");
        Book book = new Book("Title", "123234");
        Publisher publisher = new Publisher("Some Publisher", "address", "city", "zip", "state");
        publisherRepository.save(publisher);

        book.getAuthors().add(author);
        book.setPublisher(publisher);
        author.getBooks().add(book);


        authorRepository.save(author);
        bookRepository.save(book);


    }
}
