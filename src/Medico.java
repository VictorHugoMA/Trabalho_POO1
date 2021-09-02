import java.util.ArrayList;

public class Medico extends Funcionario{
	private int crm;
	private int numConsRealiz;
	private float somaConsMes;
	private ArrayList<String> especialidades = new ArrayList<>();
	private ArrayList<PlanoSaude> planosAtend = new ArrayList<>();
	private ArrayList<Consulta> consulta = new ArrayList<>();
	
	
	public Medico(ArrayList<PlanoSaude> planosAtend, String cpf) {
		this.planosAtend = planosAtend;
		this.setCpf(cpf);
	}


	public Medico() {
		
	}
	
	
	public int getCrm() {
		return crm;
	}
	
	public boolean setCrm(int crm) {
		if(crm>0) {
			this.crm = crm;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}
	
	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}
	
	
	public void addEspecialidades(String especialidades) {
		this.especialidades.add(especialidades);
	}
	
	
	public int getNumConsRealiz() {
		return numConsRealiz;
	}
	
	public boolean setNumConsRealiz(int numConsRealiz) {
		if(numConsRealiz>0) {
			this.numConsRealiz = numConsRealiz;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public float getSomaConsMes() {
		return somaConsMes;
	}

	public boolean setSomaConsMes(float somaConsMes) {
		if(somaConsMes>0) {
			this.somaConsMes = somaConsMes;			
			return true;
		}
		else {
			return false;
		}
	}
	

	public ArrayList<PlanoSaude> getPlanosAtend() {
		return planosAtend;
	}
	
	public void setPlanosAtend(ArrayList<PlanoSaude> planosAtend) {
		this.planosAtend = planosAtend;
	}
	
	
	public void addPlanosAtend(PlanoSaude planoAtend) {
		this.planosAtend.add(planoAtend);
	}
	
	
	public ArrayList<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(ArrayList<Consulta> consulta) {
		this.consulta = consulta;
	}
	
	public void addConsulta(Consulta cons) {
		this.consulta.add(cons);
	}


	public void maisCons() {
		this.setNumConsRealiz(getNumConsRealiz()+1);
	}
	
	public void somaValorCons(float valor) {
		this.setSomaConsMes(getSomaConsMes()+valor);
	}


	@Override
	public float calcSalario() {
		
		return 0;
	}


	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", numConsRealiz=" + numConsRealiz + ", somaConsMes=" + somaConsMes
				+ ", especialidades=" + especialidades + ", planosAtend=" + planosAtend + ", consulta=" + consulta
				+ "]";
	}
	
	
	

}
