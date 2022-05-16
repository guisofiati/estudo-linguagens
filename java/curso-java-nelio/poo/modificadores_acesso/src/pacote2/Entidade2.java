package pacote2;

import pacote3.Entidade3;

public class Entidade2 {
	
	private int code;
	private int id;
	
	Entidade3 ent3;
	
	public Entidade2(int code, int id) {
		this.code = code;
		this.id = id;
		//ent3.lastName = "Maria"; - Erro, pois e protected
	}

	public int getCode() {
		return code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}