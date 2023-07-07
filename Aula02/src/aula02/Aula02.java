package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c = new Caneta("Bic", "Azul", 0.5f, 50, true);

		c.status();
		c.destampar();
		c.rabiscar();
		c.status();
		c.tampar();
		c.rabiscar();
		c.status();
	}
}
