package jorge.br.com.fiap.model;

public class Viagem {
	String origem;
	String destino;
	double distancia;

	public Viagem() {
	}

	public Viagem ( double distancia) {
		this.distancia = distancia;
	}

	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
}
