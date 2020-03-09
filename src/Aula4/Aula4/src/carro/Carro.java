package carro;

public class Carro {
	
	private String modelo;
	private double potenciaDoMotor;
	private String cor;
	
	public Carro() {

		super();
	}

	public Carro(String modelo, double potenciaDoMotor, String cor) {
		super();
		this.modelo = modelo;
		this.potenciaDoMotor = potenciaDoMotor;
		this.cor = cor;
	}

	public String getModelo() {

		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setPotenciaDoMotor(double potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
