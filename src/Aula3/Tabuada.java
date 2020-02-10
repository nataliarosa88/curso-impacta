public class Tabuada {
	
	public static void main (String args[]) {
		
		int valor = Integer.parseInt (args[0]);
		for (int a = 0; a <= 10; a++) {
			System.out.println(valor + " x " + a + " = " + (valor * a));
		}
	}
}