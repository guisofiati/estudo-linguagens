package pacote1;

public class SubEntidade {
	
	Entidade1 ent1;
	
	private String firstName;
	
	public SubEntidade(String firstName) {
		this.firstName = firstName;
		
		// Nao ha modificador de acesso na Entidade1 e sao do mesmo pacote
		ent1.name = "Patrick";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}