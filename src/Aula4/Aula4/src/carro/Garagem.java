package carro;

public class Garagem {
	
	private Carro carroPasseio;
	private Carro carroUtilitario;
	

	public Garagem() {
		super();
	}
	
	public Garagem(Carro carroPasseio, Carro carroUtilitario) {
		super();
		this.carroPasseio = carroPasseio;
		this.carroUtilitario = carroUtilitario;
	}
	
	public Carro getCarroPasseio() {
		return carroPasseio;
	}

	public void setCarroPasseio(Carro carroPasseio) {
		this.carroPasseio = carroPasseio;
	}

	public Carro getCarroUtilitario() {
		return carroUtilitario;
	}

	public void setCarroUtilitario(Carro carroUtilitario) {
		this.carroUtilitario = carroUtilitario;
	}

	public static void main(String[] args) {

		Garagem g = new Garagem();
		
		
		g.carroPasseio.setCor("vermelho");
		g.carroPasseio.setModelo("VW Jetta");
		g.carroPasseio.setPotenciaDoMotor(2.3);
		
		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.carroPasseio.getCor());
		System.out.println("Modelo: " + g.carroPasseio.getModelo());
		System.out.println("Potência: " + g.carroPasseio.getPotenciaDoMotor());

		
	}
	

}
