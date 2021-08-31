import java.util.ArrayList;

public class Medico extends Funcionario{
	private int crm;
	private int numConsRealiz;
	ArrayList<String> especialidades = new ArrayList<String>();
	//private PlanoSaude planosAtend;
	
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}
	public int getNumConsRealiz() {
		return numConsRealiz;
	}
	public void setNumConsRealiz(int numConsRealiz) {
		this.numConsRealiz = numConsRealiz;
	}
/*	
	public PlanoSaude getPlanosAtend() {
		return planosAtend;
	}
	public void setPlanosAtend(PlanoSaude planosAtend) {
		this.planosAtend = planosAtend;
	}
*/
}
