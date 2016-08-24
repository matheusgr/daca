package bootwildfly;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long>{

	String findByUsername(String username);

}
