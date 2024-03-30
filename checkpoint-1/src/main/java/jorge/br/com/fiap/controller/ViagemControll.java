package jorge.br.com.fiap.controller;

import jorge.br.com.fiap.model.Veiculo;
import jorge.br.com.fiap.model.Viagem;

public class ViagemControll {

    Viagem viagem = new Viagem();
    Veiculo veiculo = new Veiculo();

    public String calculaTempo(Viagem viagem, Veiculo veiculo) {

        double resultadoDecimal = viagem.getDistancia()/ veiculo.getVelocidadeMedia();

        int horas = (int) resultadoDecimal;

        double minutosDecimal = (resultadoDecimal - horas) * 60;

        int minutos = (int) minutosDecimal;

        String stringViagem = "Tempo estimado: " + horas + "h" + minutos + "m";

        return stringViagem;

    }

}
