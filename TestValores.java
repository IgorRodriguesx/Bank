
public class TestValores {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		//Conta incosistente
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		
	}
}
