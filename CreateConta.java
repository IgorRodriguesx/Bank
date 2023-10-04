
public class CreateConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 1000;
		System.out.println(primeiraConta.saldo);
		
// += significa o que ele já tem mais o valor mencionado após, neste caso o 100
		primeiraConta.saldo += 100; 
		System.out.println(primeiraConta.saldo);
		
//Criando uma segunda conta, dando valor ao seu saldo e mandando imprimir seu valor de saldo
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("Os valores das duas contas são:" + primeiraConta.saldo + " e " + segundaConta.saldo );
		
		
	}
}
