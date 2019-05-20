package br.gov.serpro.banco;

public class ContaCorrente {
	
	private Double saldo=0.00;
	private static final Double LIMITE=500.00;

	public Double getSaldo() {
		return saldo+LIMITE;
	}

	public void sacar(Double valor) {
		this.saldo = saldo - valor;
	}

	public void depositar(Double valor) {
		this.saldo = saldo + valor;
	}
	
}
