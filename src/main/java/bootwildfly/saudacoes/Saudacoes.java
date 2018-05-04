package bootwildfly.saudacoes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Saudacoes implements Serializable {
	
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long id;
	
    @Column(nullable = false)
	public String assunto;

    @Column()
	public String remetente;
	
    @ManyToOne(fetch=FetchType.LAZY)
    @Cascade(CascadeType.ALL)    
    //@JoinColumn(name = "saudacao_tipo_id")
    public SaudacoesTipo saudacaoTipo;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	protected Saudacoes() {
		
	}

	public Saudacoes(String assunto) {
		this.assunto = assunto;
	}

	public String getAssunto() {
		return this.assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public SaudacoesTipo getSaudacaoTipo() {
		return saudacaoTipo;
	}

	public void setSaudacaoTipo(SaudacoesTipo saudacaoTipo) {
		this.saudacaoTipo = saudacaoTipo;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	
}
