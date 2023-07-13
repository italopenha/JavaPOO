package principal;

import classes.Arara;
import classes.Ave;
import classes.Cachorro;
import classes.Canguru;
import classes.Cobra;
import classes.Mamifero;
import classes.Peixe;
import classes.Reptil;
import classes.Salmao;
import classes.Tartaruga;

public class Principal {

	public static void main(String[] args) {
		//Animal n = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru can = new Canguru();
		Cachorro c = new Cachorro();
		Cobra co = new Cobra();
		Tartaruga t = new Tartaruga();
		Salmao s = new Salmao();
		Arara ara = new Arara();
		
		can.locomover();
		can.emitirSom();
		c.emitirSom();
	}
}
