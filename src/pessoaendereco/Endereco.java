package pessoaendereco;

public class Endereco {

	private String logradouro;
	private String complemento;
	private int numero;
	private String cep;
	
	public Endereco() {
		
	}
	
	public String imprimir() {
		return this.logradouro + ", " + this.numero  + "\nComplemento: " + this.complemento
				+ "\nCEP: " + this.cep;
	}
	
	//métodos de acesso
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
