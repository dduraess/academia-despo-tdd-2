package br.gov.serpro.camelCase;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	public static List<String> converterCamelCase(String original){
		
		List<String> palavrasCamelCase = new ArrayList<String>();
		String convertida = original;
		
		if(Character.isUpperCase(original.charAt(0))) {
			char originalCharArray[] = original.toCharArray();
			originalCharArray[0] = Character.toLowerCase(original.charAt(0));
			convertida = String.copyValueOf(originalCharArray);
		} 
		
//		for (int i = 0; i < original.length(); i++) {
//			do {
//				
//			} while (!Character.isUpperCase(original.charAt(i)));
//		}
		
		palavrasCamelCase.add(convertida);
		return palavrasCamelCase;
	}

}
