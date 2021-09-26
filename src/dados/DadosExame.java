package dados;

import java.util.ArrayList;
import clinica.*;

public class DadosExame {
	private ArrayList<Exame> vetExa = new ArrayList<>();
	
	public void cadastrar(Exame ex) {
		this.vetExa.add(ex);
	}
	
	public void listar() {
		for(Exame e: this.vetExa) {
			System.out.println(e.toString());
		}
	}
	
	public Exame buscar(String nome) {
		Exame c = null;
		
		for(Exame e: this.vetExa) {
			if(e.getNome().equals(nome)) {
				c = e;
				break;
			}
		}
		return c;
	}
	
	public boolean excluir(String nome) {
		Exame c = this.buscar(nome);
		if(c!=null) {
			this.vetExa.remove(c);
			return true;
		}
		else {
			return false;
		}
	}
}
