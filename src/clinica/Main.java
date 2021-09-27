package clinica;
import java.text.ParseException;
import java.util.ArrayList;
import dados.*;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		//Instancias
		
		//Enderecos
		Endereco end = new Endereco("Joao Naves", 1000);
		
		//Planos de Saude
		PlanoSaude ps = new PlanoSaude("Unimed", 150f);
		
		//Exames
		Exame ex1 = new Exame("Ressonancia");
		
		//Funcionarios
		Medico m1 = new Medico("Rafael", 200f);
		DemaisFunc dm1 = new DemaisFunc("Jorge", "Recepcionista");
		
		//Pacientes
		PacCPlano pacC = new PacCPlano("Daniel", "88858413687", ps);
		PacCPlano pacC2 = new PacCPlano("Victor", "15635558674", "120", "Solteiro", end, "Masc", "20/11/2001", ps, 12011, "10/05/2012", false);
		PacSPlano pacS = new PacSPlano("Davi", "73385255600", end, "10/10/2002");
		PacCPlano pacCTeste = new PacCPlano();
		PacSPlano pacSTeste = new PacSPlano(); 
		
		//Consultas
		Consulta c1 = new Consulta(m1 ,pacC);
		Consulta c2 = new Consulta(m1 ,pacS);
		
		//Classe de Dados
		DadosPacientes dp = new DadosPacientes();
		DadosPacientes dl = new DadosPacientes();
		
		//ArrayList
		ArrayList<String> medicamentos = new ArrayList<>();
		ArrayList<Exame> exames= new ArrayList<>();
		
		medicamentos.add("Dorflex");
		exames.add(ex1);
		
		//Testes:
		
		//CPF
		System.out.print("Teste CPF: ");
		if(pacC2.setCpf("15635558674")) {
			System.out.println("Valido");
			System.out.println(pacC2.getCpf());
		}
		else {
			System.out.println("Invalido");
		}
		
		//Medicos
		m1.setCpf("73385255600");
		m1.setEndereco(end);
		m1.addPlanosAtend(ps);
		m1.setStrDataAdmi("11/09/2020");
		System.out.println("\nData Admissao do Medico " + m1.getNome()+": " + m1.getStrDataAdmi());
		
		//Demais Funcionarios
		DemaisFunc.setLimite(1);
		DemaisFunc.setValorGrat(500f);
		dm1.setSalarioBase(1100f);
		
		//Consultas
		c1.setStrDataHoraCons("02/09/2021 15:30");
		c1.setFuncMarc(dm1);
		c1.realizarConsComPront("Dor de cabeca", "Repouso e medicamento", medicamentos, exames);
		c1.addMedicamentos("Novalgina");
		
		c2.setStrDataHoraCons("04/09/2021 10:30");
		c1.setFuncMarc(dm1);
		c2.realizarCons();
		c2.setObsSintomas("Dor no dente");
		c2.setReceita("Medicamento");
		c2.addMedicamentos("Dipirona");
		c2.addExames(ex1);
		
		//Mostrando os dados
		System.out.println(pacC2.mostrarDados());
		System.out.println(pacS.mostrarDados());
		System.out.println(m1.mostrarDados());	
				
		System.out.println(c1.mostrarDados());
		System.out.println(c2.mostrarDados());
		
		System.out.println("\nData da Ultima consulta do Paciente " +pacC.getNome() + ": "+ pacC.getStrDataUltCons());
		
		System.out.println("\nNumero de consultas no mes: " + DemaisFunc.getNumConsTot());

		System.out.println("\nSalario do Medico "+ m1.getNome()+ ": "+ m1.calcSalario());
		
		System.out.println("\nSalario do Funcionario "+ dm1.getNome()+ " (" + dm1.getCargo()+"): "+ dm1.calcSalario());
		
		System.out.println(pacC2.geraRecibo());
		
		
		//Teste classe de dados
		System.out.println("\n\nClasse de dados");
		System.out.println("\nListando Pacientes:");
		
		dp.cadastrar(pacC2);
		dp.cadastrar(pacS);
		dp.listar();
		
		System.out.println("\nBuscando um Paciente");
		Paciente pBusca = dp.buscar("15635558674");
		
		if(pBusca instanceof PacCPlano) {
			pacCTeste = (PacCPlano)pBusca;
		}
		else {
			pacSTeste = (PacSPlano)pBusca;
		}
		
			if(pacCTeste.getNome()!=null) {
				System.out.println(pacCTeste.mostrarDados());					
			}
			
			if(pacSTeste.getNome()!=null) {
				System.out.println(pacSTeste.mostrarDados());			
			}
			
		System.out.println("\nExcluindo um paciente");
		dp.excluir("15635558674");
		dp.listar();
		
		
		//Escrita de arquivo
		if(ArquivoIO.escritaObjeto(dp, "arquivo.arq")) {
			System.out.println("\nEscrita feira com sucesso");
		}
		else {
			System.out.println("\nFalha na escrita");
		}
		
		//Leitura de arquivo
		dl = (DadosPacientes)ArquivoIO.leituraObjeto("arquivo.arq");
		if(dl!=null) {
			System.out.println("Leitura realizada com sucesso");
			dl.listar();			
		}
		else {
			System.out.println("Falha na leitura");
		}
		
		
	}
}
