public class PacSPlano extends Paciente {
	private boolean descEsp;
	private float valorUltCons;
	
public boolean getDescEsp() {
return boolean;
}

public boolean setDescEsp(int descEsp) {
		if(DescEsp>0) {
			this.descEsp = descEsp;
			return true;
		}
		else {
			return false;
		}
	}

public int getValorUltCons() {
return valorcons;
}

public void setValorUltCons (float valorcons){
	
		if(valorcons>0) {
			this.valorcons = valorcons;
		}
		else {
			return false;
		}
	}
}
