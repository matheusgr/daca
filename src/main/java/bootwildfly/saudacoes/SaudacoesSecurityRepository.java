package bootwildfly.saudacoes;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasRole('ROLE_USER')")
public interface SaudacoesSecurityRepository extends CrudRepository<Saudacoes, Long> {

	@Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
	<S extends Saudacoes> S save(S entity);
	
	  Page<Saudacoes> findAll(Pageable pageable);

	  @PreAuthorize("hasRole('ROLE_ADMIN')")
	  List<Saudacoes> findByAssunto(String assunto);
	  
	  List<Saudacoes> findByRemetente(String remetente);
	
}