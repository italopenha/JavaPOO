package interfaces;

public interface RepositorioLivro {
	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhear(int p);
	public abstract void avancarPag();
	public abstract void voltarPag();
}
