package listaencadeadas;

public class No {
    private No proximo;
    private Object elemento;

    public No(Object elemento, No proxima) {
        this.proximo = proxima;
        this.elemento = elemento;
    }
    
    public No(Object elemento){
        this.elemento = elemento;
    }
    
    //Getter E Set

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
