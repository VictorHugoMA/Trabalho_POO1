import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		Pessoa p1 = new Pessoa();
		
		System.out.print("Teste CPF: ");
		if(p1.setCpf("15635558674")) {
			System.out.println("Valido");
			System.out.println(p1.getCpf());
			
		}
		else {
			System.out.println("Invalido");
		}
		System.out.println();
		
		
		Medico m1 = new Medico();
		
		m1.setStrDataAdmi("11/09/2020");
		System.out.println("Data Admissao do Medico: " + m1.getStrDataAdmi());
		System.out.println();
		
		
		
		Paciente pac1 = new Paciente();
		Consulta c1 = new Consulta(m1 ,pac1);
		
		c1.setStrDataAdmi("02/09/2021 15:30");
		c1.setValor(200f);
		System.out.println("Data e Hora da Consulta: " + c1.getStrDataHoraCons());
		
		c1.realizarCons();
		System.out.println();
		System.out.println("Data da Ultima consulta do Paciente: " + pac1.getStrDataUltCons());
		System.out.println("Soma das Consultas do Medico: " + m1.getSomaConsMes());
		
		
		
	}

}
