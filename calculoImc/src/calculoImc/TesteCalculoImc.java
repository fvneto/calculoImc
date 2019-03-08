package calculoImc;

import org.junit.Test;

import junit.framework.TestCase;

public class TesteCalculoImc extends TestCase {
	
	Pessoa pessoa1 = new Pessoa("JUAREZ", 45, 1.70f, Genero.MALE);
	Pessoa pessoa2 = new Pessoa("Andressa", 65, 1.70f, Genero.FEMALE);
	Pessoa pessoa3 = new Pessoa("Paulo", 102, 1.70f, Genero.MALE);
	Pessoa pessoa4 = new Pessoa("Benardino", 130, 1.70f, Genero.MALE);
	Pessoa pessoa5 = new Pessoa("Ramiro", 150, 1.70f, Genero.MALE);
	
	@Test
	public void testeImc() {
		
		Principal p = new Principal();
		new Imc().calcularImc(pessoa1);    
		p.exibirValor(pessoa1);
	}
}
