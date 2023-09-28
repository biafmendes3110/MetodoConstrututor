package MetodoConstrutor;

public class Tema {
	private float id; 
	private String nome; 
	private double valorAluguel; 
	private String corToalha;
	
	public Tema () {
		
	}
	public Tema (double valorAluguel) {
		
	}
	public Tema(float id, String nome, double valorAluguel, String corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	public float getId() {
		return id;
	}
	public void setId(float id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public String getCorToalha() {
		return corToalha;
	}
	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	} 
}
