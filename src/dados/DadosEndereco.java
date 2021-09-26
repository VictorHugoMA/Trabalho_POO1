package dados;

import clinica.*;
import java.util.ArrayList;

public class DadosEndereco {
	private ArrayList<Endereco> vetEnd = new ArrayList<>();
	
	public void cadastrar(Endereco end) {
		this.vetEnd.add(end);
	}
	
	public void listar() {
		for(Endereco e: this.vetEnd) {
			System.out.println(e.mostrarDados());
		}
	}
	
	public Endereco buscar(String cep, int num) {
		Endereco c = null;
		
		for(Endereco e: this.vetEnd) {
			if(e.getCep().equals(cep) && e.getNum()==num) {
				c = e;
				break;
			}
		}
		return c;
	}
	
	public boolean excluir(String cep, int num) {
		Endereco e = this.buscar(cep, num);
		if(e!=null) {
			this.vetEnd.remove(e);
			return true;
		}
		else {
			return false;
		}
	}
}
