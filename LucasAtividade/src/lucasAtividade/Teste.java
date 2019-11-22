package lucasAtividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Baralho baralhos = new Baralho();

        baralhos.getBaralho();
        System.out.println("");
        baralhos.embaralhar();
        baralhos.getBaralho();
        System.out.println("");
        baralhos.embaralhar();

        int qtdCartasViradas=0;
        Scanner leitor = new Scanner(System.in);

        while (qtdCartasViradas <3 || qtdCartasViradas >10){
            System.out.println("Qual o numero de cartas deve ser viradas?");
            qtdCartasViradas = leitor.nextInt();
        }
        int totalsoma =0;

        while(totalsoma < 3){
            System.out.println("Qual deve ser o total da soma das cartas?");
            totalsoma = leitor.nextInt();
        }

        List<Carta> cartasViradas = new ArrayList<>();

        for (int i = 0; i < qtdCartasViradas; i++) {
            Carta carta = baralhos.virarCarta();
            System.out.println(carta.toString());
            cartasViradas.add(carta);
        }

        System.out.println("");
        //8
        int total = 0;


        for(  Carta carta : cartasViradas){
            total +=carta.getValor();
        }

        if(totalsoma == total){
            System.out.println("Congratulation, você ganhou o jogo!!");
        }else{
            System.out.println("Infelizmente você perdeu o jogo, tente novamente");
        }

        leitor.close();

    }
}
