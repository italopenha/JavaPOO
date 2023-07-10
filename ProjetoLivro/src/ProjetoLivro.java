import classes.Livro;
import classes.Pessoa;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("O Poder do Hábito", "Charles Duhigg", 408, p[0]);
		l[1] = new Livro("A Revolução dos Bichos", "George Orwell", 152, p[1]);
		l[2] = new Livro("A Arte da Guerra", "Sun Tzu", 160, p[0]);
		
		p[0].status();
		l[2].abrir();
		l[2].folhear(26);
		l[2].avancarPag();
		l[2].voltarPag();
		l[2].folhear(400);
		l[2].fechar();
		l[2].folhear(5);
		l[2].detalhes();
	}
}
