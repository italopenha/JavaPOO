package classes;

import interfaces.RepositorioLivro;

public class Livro implements RepositorioLivro {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String novoTitulo, String novoAutor, int novoTotPaginas, Pessoa novoLeitor) {
		this.setTitulo(novoTitulo);
		this.setAutor(novoAutor);
		this.setTotPaginas(novoTotPaginas);
		this.setAberto(false);
		this.setPagAtual(0);
		this.setLeitor(novoLeitor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public void detalhes() {
		System.out.println("--------------------------");
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Página atual: " + this.getPagAtual());
		System.out.println("Está aberto? " + this.isAberto());
		System.out.println("Leitor: " + this.leitor.getNome());
		System.out.println("--------------------------");
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		this.setPagAtual(1);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		this.setPagAtual(0);
	}

	@Override
	public void folhear(int p) {
		if (this.isAberto()) {
			if (p > this.getTotPaginas()) {
				this.setPagAtual(1);
				System.out.println("A página " + p + " não existe, voltando a página 1...");
			} else {
				this.setPagAtual(p);
				System.out.println("Agora o livro está na página " + this.getPagAtual());
			}	
		} else {
			System.out.println("O livro está fechado, impossível folhear!");
		}
	}

	@Override
	public void avancarPag() {
		if (this.isAberto()) {
			this.setPagAtual(getPagAtual() + 1);
			System.out.println("Agora o livro está na página " + this.getPagAtual());
		} else {
			System.out.println("O livro está fechado, impossível folhear!");
		}
	}

	@Override
	public void voltarPag() {
		if (this.isAberto()) {
			this.setPagAtual(getPagAtual() - 1);
			System.out.println("Agora o livro está na página " + this.getPagAtual());
		} else {
			System.out.println("O livro está fechado, impossível folhear!");
		}
	}
}
