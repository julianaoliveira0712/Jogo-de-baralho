package lucasAtividade;

public class Carta {


    private String face;
    private int valor;
    private String naipe;
    private String cor;

    public Carta(String face, int valor, String naipe) {
        this.face = face;
        this.valor = valor;
        this.naipe = naipe;

    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return face + " de "+ naipe;
    }
}
