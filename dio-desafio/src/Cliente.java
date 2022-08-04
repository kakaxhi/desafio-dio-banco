public class Cliente {
	
	private String nome;
	ContaCorrente contaCorrente;
	ContaPoupança contaPoupanca;
	
	
	
	
	public Cliente() {
		
	}

	public Cliente(String nome, ContaCorrente contaCorrente) {
		super();
		this.nome = nome;
		this.contaCorrente = contaCorrente;
	}
	
	public Cliente(String nome, ContaPoupança contaPoupanca) {
		super();
		this.nome = nome;
		this.contaPoupanca = contaPoupanca;
	}

	public Cliente(String nome, ContaCorrente contaCorrente, ContaPoupança contaPoupanca) {
		super();
		this.nome = nome;
		this.contaCorrente = contaCorrente;
		this.contaPoupanca = contaPoupanca;
	}

	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	

	public ContaPoupança getContaPoupanca() {
		return contaPoupanca;
	}
	

	public void setContaPoupanca(ContaPoupança contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

}