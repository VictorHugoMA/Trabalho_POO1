package dados;

import java.io.Serializable;
import java.util.ArrayList;
import clinica.*;

public class DadosConsulta implements Serializable{
	private static final long serialVersionUID = 1L;
	private ArrayList<Consulta> vetCons = new ArrayList<>();
	
	public void cadastrar(Consulta c) {
		this.vetCons.add(c);
	}
	
	public void listar() {
		for(Consulta c: this.vetCons) {
			System.out.println(c.mostrarDados());
		}
	}
	
	public ArrayList<Consulta> buscarPorMed(String cpf) {
		ArrayList<Consulta> c = new ArrayList<>();
		
		for(Consulta p: this.vetCons) {
			if(p.getMedico().getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				c.add(p);
				break;
			}
		}
		return c;
	}
	
	public ArrayList<Consulta> buscarPorPac(String cpf) {
		ArrayList<Consulta> c = new ArrayList<>();
		
		for(Consulta p: this.vetCons) {
			if(p.getPacSPlano().getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				c.add(p);
				break;
			}
			else if(p.getPacCPlano().getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				c.add(p);
				break;
			}
			
		}
		return c;
	}
	
	
	public boolean excluirPorMed(String cpf) {
		for(Consulta p: this.vetCons) {
			if(p.getMedico().getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				this.vetCons.remove(p);				
			}
			return true;
		}
		return false;
		
	}
	
	public boolean excluirPorPac(String cpf) {
		for(Consulta p: this.vetCons) {
			if(p.getPacSPlano().getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				this.vetCons.remove(p);				
			}
			else if(p.getPacCPlano().getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				this.vetCons.remove(p);				
			}
			return true;
		}
		return false;
		
	}
	
}
