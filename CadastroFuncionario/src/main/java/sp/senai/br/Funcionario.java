package sp.senai.br;

public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Funcionario f2 = (Funcionario) obj;
		
		return this.getCpf().equals(f2.getCpf());
	}
	

	
}
