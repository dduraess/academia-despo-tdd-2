package br.gov.serpro.banco;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TestarCaixaEletronico {
	
	
		private CaixaEletronico cx1;

	@Before
	public void setUpBefore() {
		cx1 = new CaixaEletronico();
	}

	@Test
	public void verificaLoginComSucesso() {
		assertEquals("Usuário Autenticado", cx1.logar());
	}

	@Test
	public void efetuaSaqueComSucesso() {
		assertEquals("Retire seu dinheiro", cx1.sacar(BigDecimal.valueOf(100.00)));
	}

	@Test
	public void efetuaDepositoComSucesso() {
		assertEquals("Depósito recebido com sucesso", cx1.depositar(BigDecimal.valueOf(100.00)));
	}

	@Test
	public void consultaSaldoComSucesso() {
		assertEquals("O saldo é R$ 100.00", cx1.saldo());
	}

}
