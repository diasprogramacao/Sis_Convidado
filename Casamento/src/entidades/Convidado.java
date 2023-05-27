package entidades;

public class Convidado {
	
	private String  Nome;
	private String  cpf;
	private String  Convite;
	private String  Endereco;
	private String  Profissao;
	private String  email;
	
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getConvite() {
		return Convite;
	}
	public void setConvite(String convite) {
		Convite = convite;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
