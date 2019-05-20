package br.gov.serpro.banco;

public class CaixaEletronico {
	
	private Hardware hw;
	private ServicoRemoto sr;
	private ContaCorrente cc;

	public CaixaEletronico(Hardware hw, ServicoRemoto sr) {
		this.hw = hw;
		this.sr = sr;
		try {
			this.cc = sr.recuperarConta(hw.pegarNumeroDaContaCartao());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	enum Operacao {
		SAQUE, DEPOSITO
	}

	public String logar() {
		try {
			hw.pegarNumeroDaContaCartao();
			return "Usuário autenticado";
		} catch (RuntimeException e) {
			return "Não foi possível autenticar o usuário";
		}
	}

	public String sacar(Double valor) {
		try {
			sr.persistirConta(cc, Operacao.SAQUE, valor);
			hw.entregarDinheiro();
			return "Retire seu dinheiro";
		} catch (RuntimeException e) {
			return "Saldo insuficiente";
		}
	}

	public String depositar(Double valor) {
		try {
			hw.lerEnvelope(valor);
			sr.persistirConta(cc, Operacao.DEPOSITO, valor);
			return "Depósito recebido com sucesso";
		} catch (RuntimeException e) {
			return "Depósito não foi recebido";
		}
	}

	public String saldo() {
		return "O saldo é R$" + cc.getSaldo().toString();
	}

}