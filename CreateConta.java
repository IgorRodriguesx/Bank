
public class CreateConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 1000;
		segundaConta.saldo = 2000;
		
		System.out.println("Valor atual da conta 1 seria de:" + primeiraConta.saldo + " e da conta 2 seria de: " + segundaConta.saldo);
		
		primeiraConta.saldo += 100;
		segundaConta.saldo += 200;
		
		System.out.println("Saldo atual da conta 1:"+ primeiraConta.saldo +" e Saldo atual da conta 2: "+ segundaConta.saldo );
		
		primeiraConta.agencia = 100;
		segundaConta.agencia = 200;
		
		System.out.println("Agência da conta 1 e da conta 2 respectivamente: "+ primeiraConta.agencia +" e "+ segundaConta.agencia );
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesmas contas");
		} else {
			System.out.println("Contas diferentes");
		 }
	}
}	
