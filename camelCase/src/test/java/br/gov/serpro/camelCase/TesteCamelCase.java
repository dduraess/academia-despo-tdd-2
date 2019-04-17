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
		gabaritoRetorno.add("nome");
		assertArrayEquals(gabaritoRetorno.toArray(), CamelCase.converterCamelCase(palavra).toArray());
	}
	
	@Test
	public void verificaEntradaApenasUmNomeCapitular () {
		palavra = "Nome";
		gabaritoRetorno.add("nome");
		assertArrayEquals(gabaritoRetorno.toArray(), CamelCase.converterCamelCase(palavra).toArray());
	}
	
	@Test
	public void verificaEntradaNomeComposto () {
		palavra = "nomeComposto";
		gabaritoRetorno.add("nome");
		gabaritoRetorno.add("composto");
		assertArrayEquals(gabaritoRetorno.toArray(), CamelCase.converterCamelCase(palavra).toArray());
	}

}
