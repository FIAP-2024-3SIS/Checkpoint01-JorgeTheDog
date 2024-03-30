package jorge.br.com.fiap.model;

public class Veiculo {
	String tipoDoVeiculo;
	String placa;
	double velocidadeMedia;

	public Veiculo() {
	}

	public Veiculo( double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}


	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipoDoVeiculo() {
		return tipoDoVeiculo;
	}

	public void setTipoDoVeiculo(String tipoDoVeiculo) {
		this.tipoDoVeiculo = tipoDoVeiculo;
	}
}
