package MetodoConstrutor;

public class TemaObjeto {
	public static void main(String [] args) { 
		Tema tema = new Tema(); 

		tema.setId(1); 
		tema.setNome("Bia"); 
		tema.setValorAluguel(1000); 
		tema.setCorToalha("branca");

		System.out.println(tema.getId()); 
		System.out.println(tema.getNome()); 
		System.out.println(tema.getValorAluguel()); 
		System.out.println(tema.getCorToalha()); 

	} 
} 

