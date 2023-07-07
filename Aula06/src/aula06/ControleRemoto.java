package aula06;

public class ControleRemoto implements Controlador {
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Método Construtor
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	// Métodos getters e setters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public boolean abrirMenu() {
		if (this.isLigado()) {
			System.out.println("------ MENU -------");
			System.out.println("Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.println("Volume: " + this.getVolume());
			System.out.println("                          ");
		} else {
			System.out.println("Impossível abrir o menu, a TV está desligada!");
		}
		return true;
	}

	@Override
	public void fecharMenu() {
		if (this.isLigado() && abrirMenu()) {
			System.out.println("Fechando menu...");
		}
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar volume!");
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(getVolume() - 5); 
		} else {
			System.out.println("Impossível diminuir o volume!");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Impossível reproduzir!");
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Impossível pausar!");
		}
	}
}
