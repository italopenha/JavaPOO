package aula02;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public Caneta(String novoModelo, String novaCor, float novaPonta, int novaCarga, boolean tampada) {
		super();
		this.setModelo(novoModelo);
		this.setCor(novaCor);
		this.setPonta(novaPonta);
		this.setCarga(novaCarga);
		this.setTampada(true);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String novaCor) {
		this.cor = novaCor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float novaPonta) {
		this.ponta = novaPonta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int novaCarga) {
		this.carga = novaCarga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("                         ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Carga: " + this.getCarga());
		System.out.println("Está tampada? " + this.isTampada());
	}
	
	public void rabiscar() {
		if (this.isTampada()) {
			System.out.println("ERRO! Não posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando.");
		}
	}
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}
}
