package br.gov.serpro.carrinho;

import static org.junit.Assert.*;

public class MockObservadorCarrinho implements ObservadorCarrinho{
	
	private String nomeRecebido;
	private int valorRecebido;
	private boolean darPau = false;

	@Override
	public void produtoAdicionado(String nome, int valor) {
		if (darPau) 
			throw new RuntimeException("Problema simulado pelo mock!");
		nomeRecebido=nome;
		valorRecebido=valor;
		
	}

	public void verificarRecebimentoProduto(String nomeEsperado, int valorEsperado) {
		assertEquals(nomeEsperado, nomeRecebido);
		assertEquals(valorEsperado, valorRecebido);
		
	}

	public void esteDeveDarPau() {
		darPau = true;		
	}

}
