package calculoImc;

public class Imc {

	private float valImc;
	private Genero gender;
	private String classificacao;

	/**
	 * M�todo construtor respons�vel por montrar um objeto Imc com as 
	 * informa��es de: 
	 * imc(valor calculado), 
	 * g(G�nero: M-masculino / F-Femoinino)
	 * 
	 * @param imc
	 * @param g
	 */
	public Imc(float valImc, Genero genero) {
		
		this.valImc = valImc;
		this.gender = genero;
		this.classificacao = classificarIMC(this.valImc, this.gender);
	}
	
	public Imc() {
		
	}

	/**
	 * M�todo respons�vel por realizar o calculo o ICMS
	 * @param pessoa
	 * @return retorna o objeto Imc com os valores calculados, g�nero e
	 * classificacao. 
	 */
	public Imc calcularImc(Pessoa pessoa) {
		
		// Obtendo o peso. 
		float peso = pessoa.getPeso();
		
		// Realizando o c�lculo (altura * 2 )
		float denom = (float) Math.pow(pessoa.getAltura(), 2);
		
		// Realizando a divis�o
		float valImc = peso / denom;
		
		Imc resulCalcImc = new Imc(valImc, pessoa.getGenero());
		
		//Setando o resultado do IMC no objeto pessoa.
		pessoa.setImc(resulCalcImc);
		
		return resulCalcImc;
	}

	private String classificarIMC(float valImc, Genero gender) {
		
		String classificacao = null;
		
		if (gender.equals(Genero.FEMALE)) 
			classificacao = classificarImcFeminino(valImc);
	        
	    else if (gender.equals(Genero.MALE))
	    	classificacao = classificarImcMasculino(valImc);
		
		return classificacao;
    }

	private String classificarImcMasculino(float valImc) {
		
		if (valImc <= 20.7) {
			this.setClassificacao("Abaixo do peso");
		} else if (valImc > 20.7 && valImc <= 26.4) {
			this.setClassificacao("Peso ideal");
		} else if (valImc > 26.4 && valImc <= 27.8 ) {
			this.setClassificacao("Marginalmente acima do peso");
		} else if (valImc > 27.8 && valImc <= 31.1) {
			this.setClassificacao("Acima do peso ideal");
		} else {
			this.setClassificacao("Obeso");
		}
		return this.getClassificacao();
	}

	/**
	 * M�todo respons�vel por classificar o IMC de pessoas do sexo feminino. 
	 * 
	 * @param valImc
	 * @return
	 */
	private String classificarImcFeminino(float valImc) {
	
		if(valImc <= 19.1) {
			this.setClassificacao("Abaixo do peso");
		} else if (valImc > 19.1 && valImc <= 25.8) {
			this.setClassificacao("Peso ideal");
		} else if (valImc > 25.8 && valImc <= 27.3 ) {
			this.setClassificacao("Marginalmente acima do peso");
		} else if (valImc > 27.3 && valImc <= 32.3) {
			this.setClassificacao("Peso ideal");
		} else {
			this.setClassificacao("Obesa");
		}
		return this.getClassificacao();
	}

	public float getValImc() {
		return valImc;
	}

	public Genero getGender() {
		return gender;
	}
	
	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
} // Imc