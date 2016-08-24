package bootwildfly;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface SaudacoesRepository extends CrudRepository<Saudacoes, Long> {

	  Page<Saudacoes> findAll(Pageable pageable);

	  List<Saudacoes> findByAssunto(String assunto);
	  
	  List<Saudacoes> findByRemetente(String remetente);
	
}