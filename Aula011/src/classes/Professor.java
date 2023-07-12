package classes;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aumentoPercentual) {
		this.setSalario(this.getSalario() + (aumentoPercentual/100) * this.getSalario());
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
	}
}
