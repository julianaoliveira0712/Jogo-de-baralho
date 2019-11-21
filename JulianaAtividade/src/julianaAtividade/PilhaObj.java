package julianaAtividade;

public class PilhaObj <T> {

        private int topo;
        private T[] pilha;
        public  int vazio;

        public PilhaObj(int tamanho) {
            topo = -1;
            pilha = (T[]) new Object[tamanho];
        }

        public boolean isEmpty() {
            return (topo == -1);
        }

        public boolean isFull() {
            return (topo == pilha.length - 1);
        }

        public PilhaObj push(T info) {
            if (!isFull()) {
                pilha[++topo] = info;
            }
            else {
                System.out.println("Pilha cheia");
            }

            return this;
        }

        public PilhaObj push(T... elements){
            for (int i = 0; i < elements.length; i++) {
                push(elements[i]);
            }

            return this;
        }

        public T pop() {
            if (!isEmpty()) {
                return pilha [topo--];
            }
            vazio = -1;
            return null;
        }

        public T peek() {
            if(!isEmpty()) {
                return pilha[topo];
            }
            vazio = -1;
            return null;
        }

        public void exibe() {
            if(isEmpty()) {
                System.out.println("Pilha vazia");
            }
            else {
                for(int i = 0; i <= topo; i++) {
                    System.out.println(pilha[i]);
                }
            }

        }
}
