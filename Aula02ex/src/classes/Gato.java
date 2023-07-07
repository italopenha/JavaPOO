package classes;

public class Gato {
	private String nome;
	private String raca;
	private String pelagem;
	private char genero;
	private boolean dormindo;
	private boolean comendo;
	
	public Gato(String nome, String raca, String pelagem, char genero) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.pelagem = pelagem;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public boolean isDormindo() {
		return dormindo;
	}

	public void setDormindo(boolean dormindo) {
		this.dormindo = dormindo;
	}

	public boolean isComendo() {
		return comendo;
	}

	public void setComendo(boolean comendo) {
		this.comendo = comendo;
	}

	public void status() {
		System.out.println("---------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Raça: " + this.getRaca());
		System.out.println("Pelagem: " + this.getPelagem());
		System.out.println("Gênero: " + this.getGenero());
		System.out.println("---------------------------");
	}
	
	public void dormir() {
		this.setDormindo(true);
		this.setComendo(false);
	}
	
	public void comer() {
		if (this.isDormindo()) {
			System.out.println(this.getNome() + " diz: " + "Estou dormindo! Não posso comer!");
		} else {
			System.out.println(this.getNome() + " diz: " + "Oba, estou comendo! :)");
			this.setComendo(true);
		}
	}
	
	public void miar() {
		if (this.isDormindo() || this.isComendo()) {
			System.out.println(this.getNome() + " diz: " + "Não consigo miar agora!");
		} else {
			System.out.println(this.getNome() + " diz: " + "MIAAAAAAUUUU!!");
		}
	}
	
}
