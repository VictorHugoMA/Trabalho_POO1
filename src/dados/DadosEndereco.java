package dados;

import clinica.*;

import java.io.Serializable;
import java.util.ArrayList;

public class DadosEndereco implements Serializable, Dados{
	private static final long serialVersionUID = 1L;
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
	
	public boolean gravarBin() {
		if(ArquivoIO.escritaObjeto(this, "enderecoBin.arq")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static DadosEndereco recuperarBin() {
		return (DadosEndereco)ArquivoIO.leituraObjeto("enderecoBin.arq");

	}
}
