package br.gov.serpro.banco;

public interface ServicoRemoto {
	
	public ContaCorrente recuperarConta();
	
	public void persistirConta();

}
