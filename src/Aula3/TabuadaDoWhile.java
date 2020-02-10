public class TabuadaDoWhile {
	
	public static void main (String args[]) {
		
		int valor = Integer.parseInt (args[0]);
		int a = 0;
		do {
			System.out.println(valor + " x " + a + " = " + (valor * a));
			a++;
		}
		while (a <= 10);
	}
}