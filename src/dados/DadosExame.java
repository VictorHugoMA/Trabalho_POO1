package dados;

import java.io.Serializable;
import java.util.ArrayList;
import clinica.*;

public class DadosExame implements Serializable, GravarBinario{
	private static final long serialVersionUID = 1L;
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
	
	public boolean gravarBin() {
		if(ArquivoIO.escritaObjeto(this, "exameBin.arq")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static DadosExame recuperarBin() {
		return (DadosExame)ArquivoIO.leituraObjeto("exameBin.arq");

	}
}
