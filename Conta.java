
public class Conta {
	
	//Attributes:
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
}


