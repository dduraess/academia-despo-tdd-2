package br.gov.serpro.camelCase;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	public static List<String> converterCamelCase(String original){
		
		List<String> palavrasCamelCase = new ArrayList<String>();
		String convertida;
		char originalCharArray[] = original.toCharArray();
		
		if(Character.isUpperCase(original.charAt(0))) {
			originalCharArray[0] = Character.toLowerCase(original.charAt(0));			
		} 
		
//		for (int i = 0; i < originalCharArray.length; i++) {
//			do {
//				
//			} while (!Character.isUpperCase(original.charAt(i)));
//		}
		
		convertida = String.copyValueOf(originalCharArray);
		palavrasCamelCase.add(convertida);
		return palavrasCamelCase;
	}

}
