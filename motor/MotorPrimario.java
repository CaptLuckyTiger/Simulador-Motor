package motor;

public class MotorPrimario {

	protected String fabricante;
	protected int velocidadeRPM;
	protected boolean status;
	protected int statusVelocidade;

	public MotorPrimario(String fabricante) {
		this.fabricante = fabricante;

		this.velocidadeRPM = 0;
		this.status = false;
		this.statusVelocidade = 0;
	}

	public void ligar() {
		if (status == false) {
			status = true;
			System.out.println("Moto ligado:"); // print test
		}
	}

	public void desligar() {
		if (status == true) {
			status = false;
			System.out.println("Motor desligado:"); // print test
		}
	}

	public void velocidadeAtual() {
		if (status) {
			System.out.println("Velocidade: " + this.statusVelocidade);
		}else {
			System.out.println("Motor desligado:");
		}

	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getVelocidadeRPM() {
		return velocidadeRPM;
	}

	public void setVelocidadeRPM(int velocidadeRPM) {
		this.velocidadeRPM = velocidadeRPM;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getStatusVelocidade() {
		return statusVelocidade;
	}

	public void setStatusVelocidade(int statusVelocidade) {
		this.statusVelocidade = statusVelocidade;
	}

}
