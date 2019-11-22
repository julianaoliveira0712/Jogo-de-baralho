package AtividadeBaralho;

import java.util.Random;
import java.util.Stack;
	
public class Baralho {

	private Stack<Carta> baralho;
	// Stack<Integer> pilha = new Stack<Integer>();

	public Baralho() {
		this.baralho = baralho;
		baralho = new Stack<Carta>();
		String[] faces = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
		String[] naipes = { "Copas", "Paus", "Ouros", "Espadas" };

		Stack<Carta> atrbStack;
		atrbStack = baralho;

		
		
		int cont = 0;
		while (cont < 52) {
			baralho.push(new Carta(faces[cont % 13], cont % 13 + 1, naipes[cont / 13]));
			cont++;
		}


	}

	public Carta removeCarta(int ind) {
		Stack<Carta> aux = new Stack<>();
		for (int i = 0; i < ind; i++) {
			aux.push(baralho.pop());
		}
		Carta alvo = baralho.pop();

		while (!aux.isEmpty()) {
			baralho.push(aux.pop());
		}
		return alvo;
	}
	
	
	public void embaralhar(){
        Random nroAleatorio = new Random();
        for (int i = 0; i < 52; i++) {
            int indice = nroAleatorio.nextInt(52);
            if(indice !=0){
                Carta carta = removeCarta(indice);
                baralho.push(carta);
            }
        }
    }
	
	 public Carta virarCarta(){
	        return baralho.pop();
	    }

	 
	public Stack<Carta> getBaralho() {
		return baralho;
	}

	public void setBaralho(Stack<Carta> baralho) {
		this.baralho = baralho;
	}


	  
}