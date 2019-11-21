package julianaAtividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        //1
        Baralho baralho = new Baralho();
        //2
        baralho.getBaralho().exibe();
        System.out.println("");

        //3
        baralho.embaralhar();
        //4
        baralho.getBaralho().exibe();
        System.out.println("");
        //5
        baralho.embaralhar();
        //6
        int qtdCartasViradas=0;
        List<Carta> cartasViradas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        while (qtdCartasViradas < 5 || qtdCartasViradas > 8){
            System.out.println("Qual o numero de cartas que você deseja que seja viradas?");
            qtdCartasViradas = leitor.nextInt();
        }

        System.out.println("");
        //7
        for (int i = 0; i < qtdCartasViradas; i++) {
            Carta carta = baralho.virarCarta();
            System.out.println(carta.toString());
            cartasViradas.add(carta);
        }

        System.out.println("");
        //8
        int copas = 0;
        int ouros = 0;

        for(  Carta carta : cartasViradas){
            if(carta.getNaipe().equals("Copas")){
                copas++;
            }
            if(carta.getNaipe().equals("Ouros")){
                ouros++;
            }
        }

        if(copas == qtdCartasViradas || ouros ==qtdCartasViradas ){
            System.out.println("Parabéns!!! Você ganhou o jogo!");
        }else{
            System.out.println("Sinto muito não foi dessa vez, você perdeu o jogo!");
        }

    }
}
