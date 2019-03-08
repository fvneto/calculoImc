package calculoImc;

public class Principal {
	
	Pessoa pessoa1 = new Pessoa("JUAREZ", 45, 1.70f, Genero.MALE);
	Pessoa pessoa2 = new Pessoa("Andressa", 65, 1.70f, Genero.FEMALE);
	Pessoa pessoa3 = new Pessoa("Paulo", 102, 1.70f, Genero.MALE);
	Pessoa pessoa4 = new Pessoa("Benardino", 130, 1.70f, Genero.MALE);
	Pessoa pessoa5 = new Pessoa("Ramiro", 150, 1.70f, Genero.MALE);
		
	public void runApp() {
		
		new Imc().calcularImc(pessoa1);    
		exibirValor(pessoa1);
		
	} // runAppMap
	
	public void exibirValor(Pessoa pessoa) {
		
		System.out.println("RESULTADO DO EXAME: "+ pessoa.toString());

	}
	
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	
    	Principal p = new Principal();
    	p.runApp();
    	
    	
    } // main
    
} // Principal