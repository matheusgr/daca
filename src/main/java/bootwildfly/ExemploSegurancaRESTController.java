package bootwildfly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploSegurancaRESTController {

	// https://spring.io/guides/gs/accessing-data-rest/
	@Autowired
	SaudacoesSecurityRepository sr;
	
	@Autowired
	SaudacoesTipoRepository str;

	@Autowired
	SaudacaoSecurityService saudService;
	
	@RequestMapping(value="securitysave", params="nome")
    public String save(String nome){
		saudService.save(nome);
		return "SALVADO";
    }
	
	@Transactional(readOnly=true)
    @RequestMapping(value="securityload")
    public SaudacoesDTO sayHellotxt(String nome){
    	Saudacoes s = sr.findByAssunto("matheus").get(0);
    	SaudacoesDTO sdto = new SaudacoesDTO(s);
    	return sdto;
    }

}