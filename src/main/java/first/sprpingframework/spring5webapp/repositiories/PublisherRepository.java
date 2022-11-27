package first.sprpingframework.spring5webapp.repositiories;

import first.sprpingframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
