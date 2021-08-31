
public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		if(p1.setCpf("15635558674")) {
			System.out.println("Valido");
			System.out.println("CPF: " + p1.getCpf());
			
		}
		else {
			System.out.println("Invalido");
		}
		
		
		
		
		

	}

}
