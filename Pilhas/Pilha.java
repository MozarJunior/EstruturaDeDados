package pilhas;

public class Pilha {
    private No topo;
    private int tamanho;

    public Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(Object elemento){
        if(this.isEmpty()){
            No novo = new No(elemento);
            this.topo = novo;
            this.tamanho++;
        }else{
            No novo = new No(elemento, this.topo);
            this.topo = novo;
            this.tamanho++;
        }
    }

    public boolean isEmpty(){
        return this.topo == null;
    }

    public int size(){
        return this.tamanho;
    }

    public Object top(){
        return this.topo.getElemento();
    }

    public Object pop(){
        if(this.isEmpty()) return null;

        Object topoElemento = this.topo.getElemento();
        this.topo = this.topo.getProximo();
        this.tamanho--;

        return topoElemento;
    }
}
