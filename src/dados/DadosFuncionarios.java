package dados;
import java.io.Serializable;
import java.util.ArrayList;
import clinica.*;


public class DadosFuncionarios implements Serializable{
	private static final long serialVersionUID = 1L;
	private ArrayList<Funcionario> vetFunc = new ArrayList<>();
	
	public void cadastrar(Funcionario func) {
		this.vetFunc.add(func);
	}
	
	public void listar() {
		for(Funcionario f: this.vetFunc) {
			System.out.println(f.mostrarDados());
		}
	}
	
	public Funcionario buscar(String cpf) {
		Funcionario c = null;
		
		for(Funcionario f: this.vetFunc) {
			if(f.getCpf().equals(ValidaCPF.imprimeCPF(cpf))) {
				c = f;
				break;
			}
		}
		return c;
	}
	
	public boolean excluir(String cpf) {
		Funcionario c = this.buscar(cpf);
		if(c!=null) {
			this.vetFunc.remove(c);
			return true;
		}
		else {
			return false;
		}
	}
	
}
