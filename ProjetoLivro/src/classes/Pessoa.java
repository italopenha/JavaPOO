package classes;

public class Pessoa {
	private String nome;
	private int idade;
	private String genero;
	
	public Pessoa(String novoNome, int novaIdade, String novoGenero) {
		this.setNome(novoNome);
		this.setIdade(novaIdade);
		this.setGenero(novoGenero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1); 
	}
	
	public void status() {
		System.out.println("--------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Gênero: " + this.getGenero());
		System.out.println("--------------------------");
	}
}
