package entities;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	
	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	public Conta(String titular, int numero, double depositoInicial) {
		this.titular = titular;
		this.numero = numero;
		deposito(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5.0;
	}

	public String toString() {
		return "[titular = " 
		+ titular 
		+ ", numero = " 
		+ numero 
		+ ", saldo = " 
		+ String.format("%.2f", saldo)
		+ "]";
	}
	
}


	
