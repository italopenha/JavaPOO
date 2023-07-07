package contabanco;

public class PrincipalBanco {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco(1, "Jubileu");
		c1.abrirConta("cc");
		c1.depositar(100);
		
		ContaBanco c2 = new ContaBanco(2, "Creuza");
		c2.abrirConta("cp");
		c2.depositar(500);
		c2.sacar(100);
		
		c1.sacar(150);
		c1.fecharConta();
		
		c1.estadoAtual();
		c2.estadoAtual();
	}
}
