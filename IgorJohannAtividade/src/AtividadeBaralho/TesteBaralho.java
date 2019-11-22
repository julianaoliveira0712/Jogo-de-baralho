package AtividadeBaralho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;



public class TesteBaralho {
	public static void main(String[] args) {

		 Baralho baralhos = new Baralho();
		
		 	baralhos.getBaralho();
	        System.out.println("");

	        //3
	        baralhos.embaralhar();
	        //4
	        baralhos.getBaralho();
	        System.out.println("");
	        //5
	        baralhos.embaralhar();
		
		int qtdCartasViradas=0;
        List<Carta> cartasViradas = new ArrayList<>();
        
       Scanner sc = new Scanner(System.in);

        while (qtdCartasViradas <4 || qtdCartasViradas >8){
            System.out.println("Qual o numero de cartas que você deseja que seja viradas?");
            qtdCartasViradas = sc.nextInt();
        }
        
      //7
        for (int i = 0; i < qtdCartasViradas; i++) {
            Carta carta = baralhos.virarCarta();
            System.out.println(carta.toString());
            cartasViradas.add(carta);
        }

        System.out.println("");
        //8
        int preto = 0;
        int vermelho = 0;

        for(  Carta carta : cartasViradas){
            if(carta.getNaipe().equals("Paus") || carta.getNaipe().equals("Espadas")){
                preto++;
            }
            if(carta.getNaipe().equals("Copas") || carta.getNaipe().equals("Ouros")){
                vermelho++;
            }
        }
        
        if(preto == qtdCartasViradas || vermelho ==qtdCartasViradas ){
            System.out.println("Parabéns!!! Você ganhou o jogo!");
        }else{
            System.out.println("Sinto muito não foi dessa vez, você perdeu o jogo!");
        }
        
       

       sc.close();
    }
	
	
    
}
