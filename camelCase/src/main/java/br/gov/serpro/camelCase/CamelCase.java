package br.gov.serpro.camelCase;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	public static List<String> converterCamelCase(String original){
		
		List<String> palavrasCamelCase = new ArrayList<String>();
		String resultado = primeiroCharLowerCase(original);
		palavrasCamelCase.add(resultado);
		return palavrasCamelCase;
	}

	private static String primeiroCharLowerCase(String original) {
		char originalCharArray[] = original.toCharArray();
		if(Character.isUpperCase(original.charAt(0))) {
			originalCharArray[0] = Character.toLowerCase(original.charAt(0));
			return String.copyValueOf(originalCharArray);
		} return original;
	}

}
