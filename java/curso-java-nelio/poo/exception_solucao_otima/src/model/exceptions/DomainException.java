package model.exceptions;

// Se fosse um RuntimeException, e retirasse o catch no Main, o programa vai quebrar
// ja que o RuntimeException nao te obriga a tratar
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}