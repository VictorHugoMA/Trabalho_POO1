

public abstract class Funcionario extends Pessoa{
	private String dataAdmi;
	private int numCartTrab;
	private String usuario, senha;
	
	
	public String getDataAdmi() {
		return dataAdmi;
	}
	public void setDataAdmi(String dataAdmi) {
		this.dataAdmi = dataAdmi;
	}
	public int getNumCartTrab() {
		return numCartTrab;
	}
	public void setNumCartTrab(int numCartTrab) {
		this.numCartTrab = numCartTrab;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
