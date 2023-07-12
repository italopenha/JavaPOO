package Principal;

import classes.Aluno;
import classes.Bolsista;
import classes.Professor;
import classes.Tecnico;

public class Principal {

	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.setNome("Gustavo");
		p1.setIdade(25);
		p1.setGenero("M");
		p1.setEspecialidade("Informática");
		p1.setSalario(2000);
		System.out.println(p1.toString());
		p1.receberAumento(10);
		System.out.println(p1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("João");
		a1.setMatricula(111);
		a1.setCurso("Excel");
		a1.setIdade(16);
		a1.setGenero("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(555);
		b1.setNome("Ruan");
		b1.setBolsa(12.5f);
		b1.setGenero("M");
		b1.pagarMensalidade();
		
		Tecnico t1 = new Tecnico();
		t1.praticar();
	}
}
