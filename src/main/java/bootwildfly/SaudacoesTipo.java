package bootwildfly;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SaudacoesTipo {

    private Set<Saudacoes> saudacoes;
	private int id;
	private String nome;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @OneToMany(mappedBy = "saudacaoTipo", cascade = CascadeType.ALL)
    @JsonIgnore
    public Set<Saudacoes> getSaudacoes() {
        return saudacoes;
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSaudacoes(Set<Saudacoes> saudacoes) {
		this.saudacoes = saudacoes;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
    
}