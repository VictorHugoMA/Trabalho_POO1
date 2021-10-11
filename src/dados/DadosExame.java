package dados;

import java.io.Serializable;
import java.util.ArrayList;
import clinica.*;

public class DadosExame implements Serializable{
	private static final long serialVersionUID = 1L;
	private static ArrayList<Exame> vetExa = new ArrayList<>();
	
	public static void cadastrar(Exame ex) {
		DadosExame.vetExa.add(ex);
	}
	
	public static void listar() {
		for(Exame e: DadosExame.vetExa) {
			System.out.println(e.toString());
		}
	}
	
	public static Exame buscar(String nome) {
		Exame c = null;
		
		for(Exame e: DadosExame.vetExa) {
			if(e.getNome().equals(nome)) {
				c = e;
				break;
			}
		}
		return c;
	}
	
	public static boolean excluir(String nome) {
		Exame c = DadosExame.buscar(nome);
		if(c!=null) {
			DadosExame.vetExa.remove(c);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean gravarBin() {
		if(ArquivoIO.escritaObjeto(DadosExame.class, "exameBin.arq")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
