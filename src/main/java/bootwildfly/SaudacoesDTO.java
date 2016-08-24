package bootwildfly;

public class SaudacoesDTO {

	public String saudacoesTipo;
	
	public String assunto;
	
	public SaudacoesDTO(Saudacoes s) {
		this.saudacoesTipo = s.getSaudacaoTipo().getNome();
		this.assunto = s.getAssunto();
	}
	
}