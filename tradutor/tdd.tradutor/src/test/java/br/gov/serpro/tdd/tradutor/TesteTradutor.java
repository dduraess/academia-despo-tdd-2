package br.gov.serpro.tdd.tradutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTradutor {

	@Test
	public void test() {
		Tradutor t = new Tradutor();
		assertTrue(t.estaVazio());
	}

}
