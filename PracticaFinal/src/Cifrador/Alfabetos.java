package Cifrador;

public class Alfabetos {



	public String obtenerAlfabeto(String idioma){
		//asddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
		
		
		
		
				
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
