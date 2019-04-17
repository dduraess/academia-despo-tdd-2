package br.gov.serpro.camelCase;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	public static List<String> converterCamelCase(String original){
		
		List<String> palavrasCamelCase = new ArrayList<String>();
		String convertida;
		
		if(Character.isUpperCase(original.charAt(0))) {
			convertida = original.toLowerCase();
		} else {
			convertida = original;
		}
		
		palavrasCamelCase.add(convertida);
		return palavrasCamelCase;
	}

}
