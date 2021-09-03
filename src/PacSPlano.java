public class PacSPlano extends Paciente {
	private boolean descEsp;
	private float valorUltCons;
	
public boolean setDescEsp(int descEsp) {
		if(DescEsp>0) {
			this.descEsp = descEsp;
			return true;
		}
		else {
			return false;
		}
	}

public void setValorUltCons (float valorcons){
	this.valorcons = valorcons;
}
