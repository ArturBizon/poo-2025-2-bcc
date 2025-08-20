package q01;

public class Pessoa {
	private double altura;
	private double peso;
	private String nome;
	
	public double calcularImc() {
		double imc = peso/(altura*altura);		
		return imc;
	}
	
	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("Peso invalido");
		}
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Peso invalido");
		}
		this.altura = altura;
	}
	
	public double getAltura() { 
		return altura;
	}
	
	public void setNome(String nome) { 
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome invalido");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
