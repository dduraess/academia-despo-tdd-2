package br.gov.serpro.banco;

import java.math.BigDecimal;

public interface ServicoRemoto {
	
	ContaCorrente recuperarConta(String nrConta);
	
	void persistirConta(ContaCorrente cc, BigDecimal valor);

}
