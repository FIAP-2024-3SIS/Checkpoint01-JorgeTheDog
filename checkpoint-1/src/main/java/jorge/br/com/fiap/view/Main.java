package jorge.br.com.fiap.view;

import jorge.br.com.fiap.controller.ViagemControll;
import jorge.br.com.fiap.model.Veiculo;
import jorge.br.com.fiap.model.Viagem;

public class Main {
        public static void main(String[] args) {
            ViagemControll viagemControll = new ViagemControll();
            Viagem viagem = new Viagem(160);
            Veiculo veiculo = new Veiculo(100);
            System.out.println(viagemControll.calculaTempo(viagem, veiculo));
        }
}
