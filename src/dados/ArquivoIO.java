package dados;
import java.io.*;


public abstract class ArquivoIO {
	
	public static boolean escritaObjeto(Object objD, String caminho) {
		try {
			FileOutputStream arq = new FileOutputStream(caminho);
			ObjectOutputStream obj = new ObjectOutputStream(arq);
			obj.writeObject(objD);
			obj.flush();
			obj.close();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static Object leituraObjeto(String caminho) {
		Object o = null;
		try {
			FileInputStream arq = new FileInputStream(caminho);
			ObjectInputStream obj = new ObjectInputStream(arq);
			o = obj.readObject();
			obj.close();
			return o;
		}
		catch (Exception e) {
			return o;
		}
		
	}
	

	
}
