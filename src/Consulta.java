import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Consulta {
	private Date dataHoraCons;
	private ArrayList<String> medicamentos = new ArrayList<>();
	private String obsSintomas;
	private String receita;
	private float valor;
	private DemaisFunc funcMarc;
	private Medico medico;
	private Paciente paciente;
	private ArrayList<Exame> exames = new ArrayList<>();
	
	
	SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public Consulta(Medico med, Paciente pac) {
		this.setMedico(med);
		this.setPaciente(pac);
	}
	
	
	public Date getDataHoraCons() {
		return dataHoraCons;
	}

	public void setDataHoraCons(Date dataHoraCons) {
		this.dataHoraCons = dataHoraCons;
	}
	
	public String getStrDataHoraCons() {
		return formato2.format(dataHoraCons);
	}
	
	
	public void setStrDataHoraCons(String dataHoraCons) throws ParseException {
		this.dataHoraCons = formato2.parse(dataHoraCons);
	}
	


	public ArrayList<String> getMedicamentos() {
		return medicamentos;
	}
	
	public void setMedicamentos(ArrayList<String> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
	public String getObsSintomas() {
		return obsSintomas;
	}
	
	public void setObsSintomas(String obsSintomas) {
		this.obsSintomas = obsSintomas;
	}
	
	
	public String getReceita() {
		return receita;
	}
	
	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	
	public float getValor() {
		return valor;
	}
	
	public boolean setValor(float valor) {
		if(valor>0) {
			this.valor = valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public DemaisFunc getFuncMarc() {
		return funcMarc;
	}
	
	public void setFuncMarc(DemaisFunc funcMarc) {
		this.funcMarc = funcMarc;
	}
	
	
	public Medico getMedico() {
		return medico;
	}
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	public ArrayList<Exame> getExames() {
		return exames;
	}
	
	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}
	
	
	public void realizarCons() {
		DemaisFunc.maisCons();
		medico.addConsulta(this);
		medico.somaValorCons(this.getValor());
		paciente.addConsulta(this);
		paciente.setDataUltCons(this.getDataHoraCons());
		
	}
	
	
}
