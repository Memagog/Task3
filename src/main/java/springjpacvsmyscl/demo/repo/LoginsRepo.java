package springjpacvsmyscl.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springjpacvsmyscl.demo.model.Logins;

import java.util.List;

@Repository
public interface LoginsRepo extends CrudRepository<Logins, Long>{


}
