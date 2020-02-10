public class TestaParImpar {
	
	public static void main (String args[]) {
	
		if (Integer.parseInt (args[0]) % 2 == 0) {
			System.out.println (args[0] + " é par ");
		}
		else {
			System.out.println(args[0] + " é impar ");
		}
	}
}