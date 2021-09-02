
public class PlanoSaude {
	private String nome;
	private String cnpj;
	private Endereco endereco;
	
	
	public PlanoSaude(String nome, String cnpj, Endereco endereco) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.endereco = endereco;
	}
	
	public PlanoSaude() {
		
	}

	
	public String getNome() {
		return nome;
	}
	
	public boolean setNome(String nome) {
		if(nome.length()>0) {
			this.nome = nome;
			return true;
		}
		else {
			return false;
		}		
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	public boolean setCnpj(String cnpj) {
		if(cnpj.length()>0) {
			this.cnpj = cnpj;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
