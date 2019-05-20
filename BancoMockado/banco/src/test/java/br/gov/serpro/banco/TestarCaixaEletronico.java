package br.gov.serpro.banco;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TestarCaixaEletronico {
	
	
		private CaixaEletronico cx1;
		private CaixaEletronico cx2;
		private HardwareMock mockHwContaExistente;
		private HardwareMock mockHwContaInexistente;

	@Before
	public void setUpBefore() {
		mockHwContaExistente = new HardwareMock("1234-5");
		mockHwContaInexistente = new HardwareMock("9999-9");
		cx1 = new CaixaEletronico(mockHwContaExistente, new ServicoRemotoMock());
		cx2 = new CaixaEletronico(mockHwContaInexistente, new ServicoRemotoMock());
	}

	@Test
	public void loginComSucesso() {
		assertEquals("Usuário Autenticado", cx1.logar());
	}

	@Test
	public void loginFalhou() {
		assertEquals("Não foi possível autenticar o usuário", cx2.logar());
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
