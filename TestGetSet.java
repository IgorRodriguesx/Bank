
public class TestGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo mart");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		paulo.setCpf("460.790.248-99");
		System.out.println(conta.getTitular().getCpf());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
