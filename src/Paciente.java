import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Pessoa {
	private String sexo;
	private Date dataNasc, dataCad, dataUltCons;
	private ArrayList<Consulta> consulta = new ArrayList<>();
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getStrDataNasc() {
		return formato.format(dataNasc);
	}
	
	public void setStrDataNasc(String dataNasc) throws ParseException {
		this.dataNasc = formato.parse(dataNasc);
	}
	
	public Date getDataCad() {
		return dataCad;
	}
	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}
	public String getStrDataCad() {
		return formato.format(dataCad);
	}
	
	public void setStrDataCad(String dataCad) throws ParseException {
		this.dataCad = formato.parse(dataCad);
	}
	
	public Date getDataUltCons() {
		return dataUltCons;
	}
	public void setDataUltCons(Date dataUltCons) {
		this.dataUltCons = dataUltCons;
	}
	public String getStrDataUltCons() {
		return formato.format(dataUltCons);
	}
	
	public void setStrDataUltCons(String dataUltCons) throws ParseException {
		this.dataUltCons = formato.parse(dataUltCons);
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
	
	
	
	
}
