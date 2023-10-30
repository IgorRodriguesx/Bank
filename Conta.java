
public class Conta {
	
	//Attributes:
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//Métodos
	
	public void deposito(double valor) {
		this.saldo += valor;
		}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else { 
			return false;
			
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int Numero) {
		if(numero <= 0) {
			System.out.println("Valor insuficiente ou zerado");
			return;
		}
		this.numero = Numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Saldo insuficiente ou zerado");
			return;  
		}
			
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
}

