package br.gov.serpro.camelCase;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class TesteCamelCase {
	
	String palavra;
	List<String> listaRetorno;
	
	@Test
	public void verificaEntradaApenasUmNomeLowerCase () {
		palavra = "nome";
		listaRetorno.add(palavra);
		assertArrayEquals(listaRetorno.toArray(), CamelCase.converterCamelCase(palavra).toArray());
	}

}
