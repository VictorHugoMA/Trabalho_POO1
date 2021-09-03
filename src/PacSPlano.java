public class PacSPlano extends Paciente {
	private boolean descEsp;
	private float valorUltCons;
	
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
