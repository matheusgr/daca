package bootwildfly.saudacoes;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bootwildfly.SomethingFunnyException;

@RestController
public class SaudacaoRestController {
	
	@Autowired
	ServletContext context;

	
	// Injeção do construtor é melhor:
	// http://olivergierke.de/2013/11/why-field-injection-is-evil/
	@Autowired
	ApplicationContext appContext;
	
	@RequestMapping(value="helloget", method=RequestMethod.GET)
    public Saudacoes sayHello(){
        return new Saudacoes("oi");
    }
    
    @RequestMapping(value="hellogettxt", method=RequestMethod.GET, produces="text/plain")
    public String sayHellotxt(){
        return context.getServerInfo();
    }
    
    @RequestMapping(value="hellopost", method=RequestMethod.POST, params="nome")
    public Saudacoes receiveHello(String nome){
        return new Saudacoes(nome);
    }
    
    @RequestMapping(value="hellodefault")
    public Saudacoes receiveHello3(){
        return new Saudacoes(appContext.getBean(SaudacaoService.class).getHello());
    }

    @RequestMapping(value="hellobody", method=RequestMethod.POST)
    public void receiveHello3(Saudacoes s){
    	System.out.println(s);
        //return new Saudacoes(appContext.getBean(SaudacaoService.class).getHello());
    }

    
    @RequestMapping("hellofailed")
    public Saudacoes receiveHelloFailed(String nome){
        throw new SomethingFunnyException();
    }
}