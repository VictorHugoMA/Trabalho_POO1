package dados;
import clinica.*;

import java.io.Serializable;
import java.util.ArrayList;

public class DadosPacientes implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Paciente> vetPac = new ArrayList<>();
	
	public void cadastrar(Paciente ps) {
		this.vetPac.add(ps);
	}
	
	public void listar() {
		for(Paciente p: this.vetPac) {
			System.out.println(p.mostrarDados());
		}
	}
	
	public Paciente buscar(String cpf) {
		Paciente c = null;
		
		for(Paciente p: this.vetPac) {
			if(p.getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				c = p;
				break;
			}
		}
		return c;
	}
	
	public boolean excluir(String cpf) {
		Paciente c = this.buscar(cpf);
		if(c!=null) {
			this.vetPac.remove(c);
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
