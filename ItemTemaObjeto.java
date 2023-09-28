package MetodoConstrutor;

public class ItemTemaObjeto {
	
	public static void main(String [] args) { 

		ItemTema itemTema = new ItemTema(1, "Bia", "Testando"); 


		System.out.println(itemTema.getId()); 
		System.out.println(itemTema.getNome()); 
		System.out.println(itemTema.getDescricao()); 
	}
}