package br.gov.serpro.banco;

import java.math.BigDecimal;

public class CaixaEletronico {
	
	private ContaCorrente cc;
	private Hardware hw;
	private ServicoRemoto sr;

	public CaixaEletronico(Hardware hw, ServicoRemoto sr) {
		this.hw=hw;
		this.sr=sr;
		this.cc = sr.recuperarConta(hw.pegarNumeroDaContaCartao());
	}

	public String logar() {
		if(this.cc != null) {
			return "Usuário Autenticado";
		}
		return "Não foi possível autenticar o usuário";
	}

	public String sacar(BigDecimal valor) {
		if(cc.getSaldo().compareTo(valor)==0){
			sr.persistirConta(cc, valor);
			hw.entregarDinheiro();
		}

		return "Retire seu dinheiro";
	}

	public String depositar(BigDecimal valueOf) {
		return "Depósito recebido com sucesso";
	}

	public String saldo() {
		return "O saldo é R$ 100.00";
	}

}
