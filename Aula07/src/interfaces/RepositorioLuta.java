package interfaces;

import classes.Lutador;

public interface RepositorioLuta {
	public abstract void marcarLuta(Lutador l1, Lutador l2);
	public abstract void lutar();
}
