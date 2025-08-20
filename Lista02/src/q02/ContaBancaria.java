package q02;

public class ContaBancaria {
	private String titular;
	private String numero;
	private double saldo;
	private static int idadeMinima = 8;
	
	
	public ContaBancaria(String titular, String numero) {
		setTitular(titular);
		setNumero(numero);
	}
	
	public void sacar(double valor) { 
		if (saldo < valor || valor <= 0) { 
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		saldo += valor;
	}
	
	public void transferir(double valor, ContaBancaria destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumero(String numero) {
		if (numero.trim().isEmpty()) {
			throw new IllegalArgumentException("Numero invalido");
		}
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setTitular(String titular) {
		if (titular.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome invalido");
		}
		
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	/**
	 * Transfere o valor especificado da conta origem pra a destino
	 * @param origem a que vai ser subtraido o valor da transferencia
	 * @param destino a conta que vai receber o valro da transferencia
	 * @param valor o valor da operacao
	 */
	public static transferir(ContaBancaria origem, ContaBancaria destino,
   			                 double valor) {
		origem.transferir(valor, destino);
	}
	
}
