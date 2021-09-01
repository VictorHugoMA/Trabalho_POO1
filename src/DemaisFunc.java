
public class DemaisFunc extends Funcionario {
	private float salarioBase;
	private String cargo;
	private static int numConsTot;
	private static int limite;
	private static float valorGrat;
	
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public static int getNumConsTot() {
		return numConsTot;
	}
	public static void setNumConsTot(int numConsTot) {
		DemaisFunc.numConsTot = numConsTot;
	}
	
	public static int getLimite() {
		return limite;
	}
	public static void setLimite(int limite) {
		DemaisFunc.limite = limite;
	}
	
	public static float getValorGrat() {
		return valorGrat;
	}
	public static void setValorGrat(float valorGrat) {
		DemaisFunc.valorGrat = valorGrat;
	}
	
	@Override
	public float calcSalario() {
		if(DemaisFunc.numConsTot>DemaisFunc.limite) {
			return this.salarioBase+DemaisFunc.valorGrat; 
		}
		else {
			return salarioBase;
		}
	}
	
	public static void zeraCons() {
		DemaisFunc.setNumConsTot(0);
	}
	public static void maisCons() {
		DemaisFunc.setNumConsTot(getNumConsTot()+1);
	}
	
	
	

}
