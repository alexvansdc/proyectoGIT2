
package Cifrador;

public class Alfabetos {



	public String obtenerAlfabeto(String idioma){
		

		String castellano = "abcdefghijklmnñopqrstuvwxyz"
				+ "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"
				+ "áÁéÉíÍóÓúÚüÜ"
				+ "1234567890"
				+ "¡!¿?-;,.: ";
			
		

		//cambion en una de las ramas
		//mas cambios


		// CAMBIO EN LA SENGUNDA RAMA



		
		
				
		if(idioma.equalsIgnoreCase("castellano")){
			
			return castellano;
					
		}else if(idioma.equalsIgnoreCase("ingles")){
			
			return  ingles;
			
		}else{
			if(idioma.equalsIgnoreCase("frances")){
				return frances;
			}
		
		}
		return null;
	}
	
	protected int obtenerIndice(String alfabeto, char c){
		for(int i =0 ; i < alfabeto.length(); i++){
			if (alfabeto.charAt(i) == c){
				return alfabeto.indexOf(alfabeto.charAt(i));
			}
		
		}
		return -1;		

	}
}
