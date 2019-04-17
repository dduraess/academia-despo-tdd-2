package br.gov.serpro.camelCase;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TesteCamelCase {
	
	private String palavra;
	private List<String> gabaritoRetorno = new ArrayList<String>();
	
	@Test
	public void verificaEntradaApenasUmNomeLowerCase () {
		palavra = "nome";
		gabaritoRetorno.add(palavra);
		assertArrayEquals(gabaritoRetorno.toArray(), CamelCase.converterCamelCase(palavra).toArray());
	}

}
