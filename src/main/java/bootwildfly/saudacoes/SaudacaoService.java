package bootwildfly.saudacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaudacaoService {

	@Autowired
	SaudacoesRepository sr;
	
	@Autowired
	SaudacoesTipoRepository str;
	
	public String getHello() {
		return "hello";
	}
	
	@Transactional
    public String save(String nome){
        SaudacoesTipo st = new SaudacoesTipo();
        st.setNome("teste");
        str.save(st);
        Saudacoes entity = new Saudacoes();
        // Para forçar um erro, comente a linha abaixo:
        entity.setAssunto(nome);
        entity.setSaudacaoTipo(st);
		sr.save(entity);
		return "SALVADO!";
    }
	
	@Transactional(readOnly=true)
    public SaudacoesDTO sayHellotxt(){
    	Saudacoes s = sr.findByAssunto("matheus").get(0);
    	SaudacoesDTO sdto = new SaudacoesDTO(s);
    	return sdto;
    }

	
}
