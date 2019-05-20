package br.gov.serpro.banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestarCaixaEletronico {
	
	private HardwareMock hardwareMock;
	private ServicoRemotoMock servicoRemotoMock;
	private CaixaEletronico caixaEletronico;
	
	@Before
	public void setUp() {
		servicoRemotoMock = new ServicoRemotoMock();
		hardwareMock = new HardwareMock("1234-5");
		caixaEletronico = new CaixaEletronico(hardwareMock, servicoRemotoMock);
	}

	@Test
	public void testeLogarSucesso() {
		assertEquals("Usuário autenticado", caixaEletronico.logar());
		assertTrue(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeLoginFalhou() {
		hardwareMock = new HardwareMock("Erro!");
		caixaEletronico = new CaixaEletronico(hardwareMock, servicoRemotoMock);
		assertEquals("Não foi possível autenticar o usuário", caixaEletronico.logar());
		assertTrue(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeSacarComSucesso() {
		assertEquals("Retire seu dinheiro", caixaEletronico.sacar(100.00));
		assertTrue(servicoRemotoMock.persistiuConta);
		assertTrue(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeSacarSemSucesso() {
		assertEquals("Saldo insuficiente", caixaEletronico.sacar(600.00));
	}

	@Test
	public void testeDepositarComSucesso() {
		assertEquals("Depósito recebido com sucesso", caixaEletronico.depositar(100.00));
		assertTrue(servicoRemotoMock.persistiuConta);
		assertTrue(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeDepositarFalhou() {
		assertEquals("Depósito não foi recebido", caixaEletronico.depositar(0.00));
		assertFalse(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeSaldo() {
		caixaEletronico.depositar(100.00);
		assertEquals("O saldo é R$600.0", caixaEletronico.saldo());
	}

}
