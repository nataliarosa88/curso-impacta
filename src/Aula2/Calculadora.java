public class Calculadora {

	public static void main (String args[]) {
	
		if (args[1].equals("soma")) {
			
			System.out.println(Integer.parseInt (args[0]) +
										  Integer.parseInt(args[2]));
		}
		
		else if (args[1].equals("subtrai")) {
			
			System.out.println(Integer.parseInt (args[0]) -
										  Integer.parseInt(args[2]));
		}
		else if (args[1].equals("multiplica")) {
			
			System.out.println(Integer.parseInt (args[0]) *
										  Integer.parseInt(args[2]));
		}
			else if (args[1].equals("divide")) {
			
			System.out.println(Integer.parseInt (args[0]) /
										  Integer.parseInt(args[2]));
		}

	}

}
