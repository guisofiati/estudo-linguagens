package model.entities;

import java.util.Objects;

public class Client {
	
	private String name;
	private String email;
	
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// compara se o obj e igual a outro
	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}

	// gera um hash, codigo inteiro e compara entre os obj
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}