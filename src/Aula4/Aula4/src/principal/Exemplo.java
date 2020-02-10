/**
 * 
 */
package principal;

/**
 * @author linux
 *
 */
public class Exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClienteTO objCli = new ClienteTO(1, " Impacta");
		System.out.println(ClienteTO.contador);
		ClienteTO objCli2 = new ClienteTO(1, " Impacta");
		System.out.println(objCli.contador);
		imprimir(objCli.getCodigo() + "" + objCli.getNome());
		
		
	}
	
	public static void imprimir (String valor) {
		System.out.println(valor);
	}
	public static void imprimir (int  valor) {
		System.out.println(valor);
	}

}
