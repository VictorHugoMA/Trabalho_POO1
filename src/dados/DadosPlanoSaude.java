package dados;

import java.io.Serializable;
import java.util.ArrayList;
import clinica.*;

public class DadosPlanoSaude implements Serializable, GravarBinario{
	private static final long serialVersionUID = 1L;
	private ArrayList<PlanoSaude> vetPlan = new ArrayList<>();
	
	public void cadastrar(PlanoSaude plano) {
		this.vetPlan.add(plano);
	}
	
	public void listar() {
		for(PlanoSaude p: this.vetPlan) {
			System.out.println(p.toString());
		}
	}
	
	public PlanoSaude buscar(String cnpj) {
		PlanoSaude c = null;
		
		for(PlanoSaude p: this.vetPlan) {
			if(p.getCnpj().equals(cnpj)) {
				c = p;
				break;
			}
		}
		return c;
	}
	
	public boolean excluir(String cnpj) {
		PlanoSaude c = this.buscar(cnpj);
		if(c!=null) {
			this.vetPlan.remove(c);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean gravarBin() {
		if(ArquivoIO.escritaObjeto(this, "planoSaudeBin.arq")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static DadosPlanoSaude recuperarBin() {
		return (DadosPlanoSaude)ArquivoIO.leituraObjeto("planoSaudeBin.arq");

	}
}
