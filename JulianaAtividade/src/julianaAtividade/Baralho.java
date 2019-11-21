package julianaAtividade;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.Random;

public class Baralho {

    private PilhaObj <Carta> baralho;

    public Baralho() {
        this.baralho = baralho;
        baralho = new PilhaObj<>(52);
        String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"Copas", "Paus", "Ouros", "Espadas"};
        PilhaObj<Carta> objpilha = new PilhaObj<>(1);
        for (int j = 0; j < naipes.length; j++) {
            for (int i = 0; i < faces.length; i++) {
                baralho.push(new Carta(faces[i], i, naipes[j]));
            }
        }
    }

    public Carta removeCarta(int ind){
        PilhaObj<Carta> aux = new PilhaObj<>(ind);
        for (int i = 0; i < ind; i++) {
            aux.push(baralho.pop());
        }
        Carta alvo = baralho.pop();

        while (!aux.isEmpty()){
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

    public PilhaObj<Carta> getBaralho() {
        return baralho;
    }

    public PilhaObj<Carta> setBaralho() {
        return baralho;
    }

}
