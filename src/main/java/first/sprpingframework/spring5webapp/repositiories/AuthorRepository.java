package first.sprpingframework.spring5webapp.repositiories;

import first.sprpingframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
