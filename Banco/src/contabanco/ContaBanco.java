package contabanco;

import java.util.Scanner;

public class ContaBanco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	Scanner leitor = new Scanner(System.in);
	
	// Métodos Especiais
	public ContaBanco (int numConta, String dono) {
		this.numConta = numConta;
		this.dono = dono;
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int n) {
		numConta = n;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String t) {
		tipo = t;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String d) {
		dono = d;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float s) {
		saldo = s;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean s) {
		status = s;
	}
	
	// Métodos Personalizados
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "cc") {
			this.setSaldo(50);
			System.out.println("Conta corrente aberta com sucesso! Seu saldo é de: R$ " + this.getSaldo());
		} else if (t == "cp") {
			this.setSaldo(150);
			System.out.println("Conta poupança aberta com sucesso! Seu saldo é de: R$ " + this.getSaldo()); 
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("ERRO! Você ainda possui dinheiro na conta, retire-o para encerrar a conta.");
		} else if (this.getSaldo() < 0) {
			System.out.println("ERRO! Você está em débito, pague suas dívidas para encerrar a conta.");
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");
		}
	}
	
	public void depositar(float d) {
		if (this.getStatus() == true) {
			setSaldo(getSaldo() + d);
			System.out.println("Depósito realizado com sucesso!");
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	
	public void sacar(float s) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= s) {
				setSaldo(getSaldo() - s);
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("ERRO! Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossível sacar!");
		}
	}
	
	public void pagarMensal() {
		float v = 0;
		
		if (this.getTipo() == "cc") {
			v = 12;
		} else if (this.getTipo() == "cp") {
			v = 20;
		}
		
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v ) {
				setSaldo(getSaldo() - v);
				System.out.println("Taxa paga com sucesso!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossível pagar!");
		}
		
	}
	
	public void estadoAtual() {
		System.out.println("------------------------");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("------------------------");
	}
}
