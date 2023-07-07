package principal;

import classes.Gato;

public class Principal {

	public static void main(String[] args) {
		Gato g1 = new Gato("Tom", "Siamês", "Bege e preto", 'M');
		g1.status();
		g1.comer();
		g1.dormir();
		g1.comer();
		
		Gato g2 = new Gato("Ravena", "Vira-Lata", "Preto e branco", 'F');
		g2.status();
		g2.miar();
		g2.comer();
		g2.miar();
	}

}
