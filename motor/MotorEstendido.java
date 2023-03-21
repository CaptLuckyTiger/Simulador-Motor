package motor;

public class MotorEstendido extends MotorPrimario {

	public MotorEstendido(String fabricante) {
		super(fabricante);
	}

	public void acelerar() {
		if (status == true) {
			if (this.statusVelocidade <= 6000) {
				this.statusVelocidade += 1000;
			}
		}
	}

	public void desacelerar() {
		if (status == true) {
			if (this.statusVelocidade >= 1000) {
				this.statusVelocidade -= 1000;
			}
		}
	}

}
