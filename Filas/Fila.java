package filas;

public class Fila {
    private No inicio;
    private No fim;
    private int totalDeElementos;

    public Fila(){
        this.inicio = null;
        this.fim = null;
        this.totalDeElementos = 0;
    }

    public void enqueue(Object elemento){
        No novo = new No(elemento);
        if(this.isEmpty()){
            this.inicio = novo;
        }else{
            this.fim.setProximo(novo);
        }
        this.fim = novo;
        this.totalDeElementos++;
    }

    public void dequeue(){
        if(!this.isEmpty()){
            this.inicio = this.inicio.getProximo();
            this.totalDeElementos--;
            if(this.totalDeElementos == 0) this.fim = null;
        }
    }
    
	public boolean isEmpty() {
        return this.totalDeElementos==0;
	}

    public int size(){
        return this.totalDeElementos;
    }

    public Object front(){
        return this.inicio.getElemento();
    }

    @Override
    public String toString() {
        if(this.totalDeElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        No atual = this.inicio;
        for(int i = 0; i < this.totalDeElementos-1; i++){
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }

        builder.append(atual.getElemento());
        builder.append("]");

        return builder.toString();
    }

    public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getFim() {
		return fim;
	}
	public void setFim(No fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return totalDeElementos;
	}
	public void setTamanho(int tamanho) {
		this.totalDeElementos = tamanho;
	}
}
