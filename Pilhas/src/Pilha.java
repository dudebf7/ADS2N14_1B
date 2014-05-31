public class Pilha{
	
	String palavra;

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;

    }

    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];

    }

    public void empilhar(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
            
        }
    }

    public boolean isPalindromo(String palavra) {
        String resultado = "";
        for (int x = palavra.length() - 1; x >= 0; x--) {
            resultado += palavra.charAt(x);
        }
        if (resultado.equals(palavra)) {
            return true;
        } else {
            return false;
        }

    }

    public String mostrarPilha() {
        String retorno = "";       
        for(int i = 0; i <= posicaoPilha; i++){
            retorno += i + " - " + pilha[i] + "; ";
        }
        return retorno;
    }
}