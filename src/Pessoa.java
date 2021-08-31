

public class Pessoa {
	private String nome;
	private String cpf, rg;
	private byte estadoCivil;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return ValidaCPF.imprimeCPF(cpf);
	}
	
	public boolean setCpf(String cpf) {
		if(ValidaCPF.isCPF(cpf)==true) {
			this.cpf = cpf;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	public byte getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(byte estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
