import java.text.ParseException;

public class PacSPlano extends Paciente {
	private boolean descEsp;
	private float valorUltCons;
	

	public PacSPlano(String nome, String cpf, boolean descEsp, float valorUltCons) {
		super(nome, cpf);
		this.setDescEsp(descEsp);
		this.setValorUltCons(valorUltCons);
	}

	public PacSPlano(String nome, String cpf, Endereco endereco, String dataNasc) throws ParseException {
		super(nome, cpf);
		this.setEndereco(endereco);
		this.setStrDataNasc(dataNasc);
	}
	
	public PacSPlano(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public PacSPlano() {
		
	}

	public boolean getDescEsp() {
		return descEsp;
	}

	public void setDescEsp(boolean descEsp) {
		this.descEsp = descEsp;
	}

	public float getValorUltCons() {
		return valorUltCons;
	}

	public boolean setValorUltCons (float valorcons){
		if(valorcons>0) {
			this.valorUltCons = valorcons;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String mostraDados() {
		return super.mostraDados() + "\nDesconto especial: " + this.getDescEsp() + "\nValor da ultima consulta: " + this.getValorUltCons();
	}

}
