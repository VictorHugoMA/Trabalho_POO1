

public class PacSPlano extends Paciente {
	private boolean descEsp;
	private float valorUltCons;
	

	public PacSPlano(String nome, String cpf, boolean descEsp, float valorUltCons) {
		super(nome, cpf);
		this.setDescEsp(descEsp);
		this.setValorUltCons(valorUltCons);
	}

	public PacSPlano(boolean descEsp, float valorUltCons) {
		this.setDescEsp(descEsp);
		this.setValorUltCons(valorUltCons);
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

}
