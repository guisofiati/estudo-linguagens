package pacote1;

import pacote2.Entidade2;

public class Entidade1 {
	
	String name;
	public double value;
	
	Entidade2 ent2;
	
	public Entidade1(String name, double value) {
		this.name = name;
		this.value = value;
		//ent2.code = 3; - Erro, pois o atributo e privado
	}
}