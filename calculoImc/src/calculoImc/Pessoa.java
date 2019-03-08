package calculoImc;

public class Pessoa {

	private String name;
	private float peso;
	private float altura;
	private Genero genero;
	private Imc imc;

	public Pessoa(String name,float peso, float altura, Genero genero) {
		
		this.name = name;
		this.peso = peso;
		this.altura = altura;
		this.genero = genero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Imc getImc() {
		return imc;
	}

	public void setImc(Imc imc) {
		this.imc = imc;
	}

	@Override
	public String toString() {
		
		return "\n - NOME:" + this.getName()
		+ "\n - PESO:" + this.getPeso()  
		+ "\n - IMC: " + this.getImc().getValImc()
		+ "\n - CLASSIFICAÇAO: " + this.getImc().getClassificacao()
		+ "\n - GENERO: " + this.getGenero()
		+ "\n";
	}
	
} // Pessoa