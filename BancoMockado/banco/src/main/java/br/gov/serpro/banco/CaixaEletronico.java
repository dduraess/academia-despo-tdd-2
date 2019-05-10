package br.gov.serpro.banco;

import java.math.BigDecimal;

public class CaixaEletronico {
	
	

	public String logar() {
		return "Usuário Autenticado";
	}

	public String sacar(BigDecimal valor) {
		return "Retire seu dinheiro";
	}

	public String depositar(BigDecimal valueOf) {
		return "Depósito recebido com sucesso";
	}

	public String saldo() {
		return "O saldo é R$ 100.00";
	}

}
