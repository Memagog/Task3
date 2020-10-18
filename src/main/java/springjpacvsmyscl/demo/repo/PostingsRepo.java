package springjpacvsmyscl.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springjpacvsmyscl.demo.model.Postings;

@Repository
public interface PostingsRepo extends CrudRepository<Postings,Long> {
}
