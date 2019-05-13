package br.gov.serpro.carrinho;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCarrinhoCompras {

	@Test
	public void totalCarrinho() {

		CarrinhoCompras c = new CarrinhoCompras();
		c.adicionaProduto(new Produto("tenis", 100));
		c.adicionaProduto(new Produto("camiseta", 50));
		c.adicionaProduto(new Produto("bermuda", 70));
		assertEquals(220, c.total());

	}

	@Test
	public void escutaAdicaoProduto() {

		CarrinhoCompras c = new CarrinhoCompras();
		MockObservadorCarrinho mock = new MockObservadorCarrinho(); 
		c.adicionaObservador(mock);
		c.adicionaProduto(new Produto("tenis", 100));
		mock.verificarRecebimentoProduto("tenis", 100);

	}

	@Test
	public void adicionarDoisObservadores() {

		CarrinhoCompras c = new CarrinhoCompras();
		MockObservadorCarrinho mock = new MockObservadorCarrinho(); 
		MockObservadorCarrinho mock2 = new MockObservadorCarrinho();
		c.adicionaObservador(mock);
		c.adicionaObservador(mock2);
		c.adicionaProduto(new Produto("tenis", 100));
		mock.verificarRecebimentoProduto("tenis", 100);
		mock2.verificarRecebimentoProduto("tenis", 100);

	}

	@Test
	public void continuaNotificandoErroEmObservador() {

		CarrinhoCompras c = new CarrinhoCompras();
		MockObservadorCarrinho mock = new MockObservadorCarrinho(); 
		ObservadorCarrinho mock2 = new MockObservadorComProblema();
		MockObservadorCarrinho mock3 = new MockObservadorCarrinho();
		c.adicionaObservador(mock);
		c.adicionaObservador(mock2);
		c.adicionaObservador(mock3);
		c.adicionaProduto(new Produto("tenis", 100));
		mock.verificarRecebimentoProduto("tenis", 100);
		mock3.verificarRecebimentoProduto("tenis", 100);

	}

}
