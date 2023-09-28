package MetodoConstrutor;

public class ClienteObjeto {
	public static void main(String [] args) { 
		Cliente cliente = new Cliente(); 

		cliente.setId(1);
		cliente.setNome("Beatriz Ferreira"); 
		cliente.setTelefone("998334348"); 
		cliente.setCpf("503377787816"); 
		cliente.setRg("83726248498"); 


		System.out.println(cliente.getId()); 
		System.out.println(cliente.getNome()); 
		System.out.println(cliente.getTelefone()); 
		System.out.println(cliente.getCpf()); 
		System.out.println(cliente.getRg()); 




	}
}
