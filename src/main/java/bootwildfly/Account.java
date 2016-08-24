package bootwildfly;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	public Long id;
	
	@Column
	public String username;
	
	@Column
	public String senha;

}
