package classes;

import java.util.Random;
import interfaces.RepositorioLuta;

public class Luta implements RepositorioLuta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	@Override
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}

	@Override
	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random gerador = new Random();
			int vencedor = gerador.nextInt(3);
			
			System.out.println("=== RESULTADO DA LUTA ===");
			
			switch (vencedor) {
				case 0:
					System.out.println("Empate entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome() + "!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
						break;
				case 1:
					System.out.println("Vitória do " + this.desafiado.getNome() + "! Parabéns!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
						break;
				case 2:
					System.out.println("Vitória do " + this.desafiante.getNome() + "! Parabéns!");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
						break;
				}
			System.out.println("==========================");
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}
}
