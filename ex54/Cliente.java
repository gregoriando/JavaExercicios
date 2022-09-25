package ex54;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;

	Cliente(){
		
	}
	
	Cliente(int id, String nome,int idade, String email,ContaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	public String exibirNomeIdade() {
		return("\n nome: "+this.nome+"\n idade:"+this.idade);
	}
	public String DadosConta() {
		return("\nAg: "+this.conta.agencia+"\n Conta: "+this.conta.numero+" \nSaldo:"+this.conta.saldo);
		
	}
}
