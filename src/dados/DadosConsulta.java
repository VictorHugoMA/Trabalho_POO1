package dados;

import java.util.ArrayList;
import clinica.*;

public class DadosConsulta {
	private ArrayList<Consulta> vetCons = new ArrayList<>();
	
	public void cadastrarCons(Consulta c) {
		this.vetCons.add(c);
	}
	
	public void listar() {
		for(Consulta c: this.vetCons) {
			System.out.println(c.mostrarDados());
		}
	}
	
	//alterar parametro
	public Consulta buscar() {
		Consulta a = null;
		return a;
	}
	
	//alterar parametro
	public boolean excluir() {
		return true;
	}
}
