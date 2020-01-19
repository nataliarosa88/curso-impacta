public class UsandoDiaDaSemana{
	public static void main(String[] args) {
	DiaDaSemana diaBom = DiaDaSemana.SABADO;
	DiaDaSemana diaBom2 = DiaDaSemana.DOMINGO;
	System.out.println("Dia bom é " + DiaDaSemana.SABADO);
	System.out.println("Dia bom é " + diaBom.name());
	System.out.println("Dia bom 2 é " + diaBom2.equals(diaBom));
	}
}