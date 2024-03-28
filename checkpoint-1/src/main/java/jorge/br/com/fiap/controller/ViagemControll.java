package jorge.br.com.fiap.controller;

public class ViagemControll {


    public ViagemControll() {
    }

    public String calculaTempo(double distancia, double velMedia) {
        double resultadoDecimal = distancia/velMedia;
        int horas = (int) resultadoDecimal;
        double minutosDecimal = (resultadoDecimal - horas) * 60;
        int minutos = (int) minutosDecimal;
        String stringViagem = "Tempo estimado: " + horas + "h" + minutos + "m";
        return stringViagem;
    }

}
