import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PacCPlano extends Paciente{
	private int numCarteirinha;
	private Date dataIngPlano;
	private boolean carencia;
	private PlanoSaude plano;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	
	
	public PacCPlano(String nome, String cpf, String rg, String estadoCivil, Endereco endereco, String sexo,
			String dataNasc, PlanoSaude plano, int numCarteirinha, String dataIngPlano, boolean carencia)
			throws ParseException {
		
		super(nome, cpf, rg, estadoCivil, endereco, sexo, dataNasc);
		this.setNumCarteirinha(numCarteirinha);
		this.setStrDataIngPlano(dataIngPlano);
		this.setCarencia(carencia);
		this.setPlano(plano);
	}

	public PacCPlano(int numCarteirinha, PlanoSaude plano) {
		this.setNumCarteirinha(numCarteirinha);
		this.setPlano(plano);
	}
	
	public PacCPlano(String nome, String cpf, PlanoSaude plano) {
		super(nome, cpf);
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


	public Date getDataIngPlano() {
		return dataIngPlano;
	}

	public void setDataIngPlano(Date dataIngPlano) {
		this.dataIngPlano = dataIngPlano;
	}
	
	public String getStrDataIngPlano() {
		return formato.format(this.dataIngPlano);
	}
	
	
	public boolean setStrDataIngPlano(String dataIng) throws ParseException {
		if(dataIng.length()>0) {
			this.dataIngPlano = formato.parse(dataIng);
			return true;
		}
		else {
			return false;
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
	
	public float getValorConsP() {
		return this.plano.getValorCons();
	}
	
	public String getNomePlano() {
		return this.plano.getNome();
	}

	
	public String mostraDados() {
		return super.mostraDados() + "\nPlano: " + plano.getNome() + "\nNumero da carteirinha: " + this.getNumCarteirinha() +
				"\nData de ingresso no plano: " + this.getStrDataIngPlano() + "\nCarencia: " + this.isCarencia();
	}
	
	
	
	

	
	
	
}
	
	
