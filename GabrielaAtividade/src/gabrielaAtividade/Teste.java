package gabrielaAtividade;

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

        int qtdViradas=0;
        Scanner scanner = new Scanner(System.in);

        while (qtdViradas <2 || qtdViradas >9){
            System.out.println("Qual o numero de cartas a serem viradas?");
            qtdViradas = scanner.nextInt();
        }
        int somaViradas =-1;

        while(somaViradas <0){
            System.out.println("Qual deve ser o total da soma de cartas do naipe preto?");
            somaViradas = scanner.nextInt();
        }

        List<Carta> cartasViradas = new ArrayList<>();

        for (int i = 0; i < qtdViradas; i++) {
            Carta carta = baralhos.virarCarta();
            System.out.println(carta.toString());
            cartasViradas.add(carta);
        }

        System.out.println("");
        int totalNaipePreto = 0;

        for(  Carta carta : cartasViradas){
            if(carta.getNaipe().equals("Paus") || carta.getNaipe().equals("Espadas")){
                totalNaipePreto +=carta.getValor();

            }
        }

        if(somaViradas == totalNaipePreto){
            System.out.println("Você ganhou o jogo!!");
        }else{
            System.out.println("Você perdeu o jogo!!");
        }

        scanner.close();

    }
}
