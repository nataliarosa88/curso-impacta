public class FaixaImpostoRenda {
	
	public static void main (String args[]) {
		
		double valor = Double.parseDouble (args[0]);
		
			if (valor < 1800) {
				System.out.println("Faixa 1 do Imposto de Renda - aliquota 0");
			}
			else if (valor > 1800 && valor <= 3200) {
				System.out.println("Faixa 2 do imposto de Renda - aliquota 15%");
			}
		}
	}
