package first.sprpingframework.spring5webapp.repositiories;

import first.sprpingframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
