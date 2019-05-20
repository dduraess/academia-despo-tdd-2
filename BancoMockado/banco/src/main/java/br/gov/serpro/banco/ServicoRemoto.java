package br.gov.serpro.banco;

import br.gov.serpro.banco.CaixaEletronico.Operacao;

public interface ServicoRemoto {
	
	ContaCorrente recuperarConta(String conta);
	void persistirConta(ContaCorrente cc, Operacao op, Double valor);

}
