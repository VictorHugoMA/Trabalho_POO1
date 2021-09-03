public class PacCPlano extends Paciente{
	private int numCarteirinha;
	private String dataIngPlano;
	private boolean carencia;
	private PlanoSaude plano;

	
	public PacCPlano(int numCarteirinha, PlanoSaude plano) {
		this.setNumCarteirinha(numCarteirinha);
		this.setPlano(plano);
	}
	
	public PacCPlano(String nome, String cpf, int numCarteirinha, PlanoSaude plano) {
		super(nome, cpf);
		this.setNumCarteirinha(numCarteirinha);
		this.setPlano(plano);
	}
	
	public PacCPlano(String nome, String cpf) {
		super(nome, cpf);
	}

	public PacCPlano() {
		
	}
	
	
	public int getNumCarteirinha() {
		return numCarteirinha;
	}


	public boolean setNumCarteirinha(int numCarteirinha) {
		if(numCarteirinha< 0) {
		
			return false;
		
		}else {
			
			this.numCarteirinha = numCarteirinha;
			return true;
		}
		
	}


	public String getDataIngPlano() {
		return dataIngPlano;
	}


	public boolean setDataIngPlano(String dataIngPlano) {
		if(dataIngPlano.length() < 0) {
			return false;
		}else {
			
			this.dataIngPlano = dataIngPlano;
			return true;
		}
		
	}


	public boolean isCarencia() {
		return carencia;
	}


	public void setCarencia(boolean carencia) {
		this.carencia = carencia;
	}


	public PlanoSaude getPlano() {
		return plano;
	}


	public void setPlano(PlanoSaude plano) {
		this.plano = plano;
	}
	
	

	
	
	
}
	
	
