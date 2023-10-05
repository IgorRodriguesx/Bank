
public class TestaClasse {
	public static void main(String[] args) {
		Cliente Igor = new Cliente();
		Igor.nome = "Igor Rodrigues";
		Igor.cpf = "999.999.999-99";
		Igor.profissao = "Developer";
		
		Conta contaDoIgor = new Conta();
		contaDoIgor.deposito(1000);
		System.out.println("Conta do cliente: "
				+Igor.nome+"do cpf:"+Igor.cpf+" cuja profissão: ");
		
	}
}
