package listaencadeadas;

public class ListaEncadeada {

    private No inicio;//Indica o inicio
    private No fim;//Indica o Fim
    private int totalDeElementos;//Indica o Numero de elementos da lista

    public ListaEncadeada(No inicio, No fim, int totalDeElementos) {//Construtor
        this.inicio = null;
        this.fim = null;
        this.totalDeElementos = 0;
    }

    public void adicionaNoInicio(Object elemento) {
        No novo = new No(elemento, this.inicio);//Cria novo No e aponta para o No que era o primeiro
        this.inicio = novo;//Fica no incio

        if (this.totalDeElementos == 0) {//Se a lista estiver vazia
            this.fim = novo;//o final é direcionado para o No adicionado
        }
        this.totalDeElementos++;//Tamanho é incrementado
    }

    public void adicionaNoFinal(Object elemento) {
        if (this.totalDeElementos == 0) {//Verifica se está vazia
            this.adicionaNoInicio(elemento);//Se vazia adiciona no inicio
        } else {
            No novo = new No(elemento);//Cria novo No que sera adicionado no final
            this.fim.setProximo(novo);//Indica que o antigo fim aponta para novo
            this.fim = novo;//Diz que o fim agora é novo
            this.totalDeElementos++;//Tamanho incrementado
        }
    }

    @Override
    public String toString() {

        if (this.totalDeElementos == 0) {
            return "[]";
        }//Verifica se está vazia

        StringBuilder builder = new StringBuilder("[");
        No atual = this.inicio;//Pega o primeiro No para percorrer a lista completa

        for (int i = 0; i < this.totalDeElementos; i++) {
            builder.append(atual.getElemento());//Pega o elemento do No atual
            builder.append(", ");
            atual = atual.getProximo();//Atual Direciona para o proximo elemento do atual
        }

        builder.append(atual.getElemento());//Pega o ultimo elemento
        builder.append("]");
        return builder.toString();//Retorna o resultado
    }

    public boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;//Verifica se tal posição é valida
    }

    public No pegaNo(int posicao) {
        if (!this.posicaoValida(posicao)) {//Verifica se posição é valida atravez do metodo posicaoValida
            throw new IllegalArgumentException("Posição Invalida!");//Se não gera uma Exceção
        } else {//Se a posição for valida
            No atual = this.inicio;//Direciona o atual para o inicio

            for (int i = 0; i < posicao; i++) {//Laço para percorrer a lista
                atual = atual.getProximo();//Atual direciona proximo do atual
            }
            return atual;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {//Se a posição for 0 ele adiciona no inicio
            this.adicionaNoInicio(elemento);
        }
        if (posicao == (this.totalDeElementos - 1)) {//Se a posição for a ultima ele adiciona no final
            this.adicionaNoFinal(elemento);
        }

        No anterior = this.pegaNo(posicao - 1);//Ele pega o anterior da posição que queremos adicionar
        No novo = new No(elemento, anterior.getProximo());//Cria novo No na posição que quer adicionar

        anterior.setProximo(novo);//Direciona o anterior para o novo No criado
        this.totalDeElementos++;//Tamanho incrementado
    }

    public Object pega(int posicao) {
        return this.pegaNo(posicao).getElemento();//Pega um elemento na posição desejada
    }

    public void removeNoInicio(int posicao) {
        this.inicio = this.inicio.getProximo();//Direciona o inicio para o proximo valor no caso o segundo
        this.totalDeElementos--;//Tamanho decrementado
        if (this.totalDeElementos == 0) {//Se lista vazia o final será nulo
            this.fim = null;
        }
    }

    public void removeNoFinal(int posicao) {
        if (this.totalDeElementos == 0) {//Verifica se a lista é vazia
            System.out.println("Lista Vazia! Impossivel Remover!");
        } else if (this.totalDeElementos == 1) {//Verifica se só tem um valor
            this.removeNoInicio(posicao);//E remove no inicio com metodo já criado
        } else {
            No anterior = this.pegaNo(this.totalDeElementos - 2);//Pega o penultimo elemento
            anterior.setProximo(null);//Torna nulo o ultimo elemento a partir do penultimo
            this.fim = anterior;//Direciona o fim para o penultimo que é o ultimo agora
            this.totalDeElementos--;//Tamanho decrementado
        }
    }

    public boolean remove(int posicao) {
        if (this.posicaoValida(posicao)) {//Verifica se a posição é valida
            if (posicao == 0) {//Se a posição for a primeira
                this.removeNoInicio(posicao);//É removido no Inicio
            } else if (posicao == this.totalDeElementos - 1) {//Se a posição for a ultima
                this.removeNoFinal(posicao);//Ele remove no final
            } else {
                No anterior = this.pegaNo(posicao - 1);//Ele pega o anterior da posição que quer ser removida
                No atual = anterior.getProximo();//Ele pega a posição que quer remover apartir do anterior
                anterior.setProximo(atual.getProximo());//Diz que o proximo do anterior agora é o proximo do que foi removido
                this.totalDeElementos--;//Tamanho decrementado
                return true;
            }
        }
        return false;
    }

    public boolean contem(Object elemento) {
        No atual = this.inicio;//Pega o primeiro No da lista
        for (int i = 0; i < this.totalDeElementos; i++) {//Percorre toda a lista apartir do inicio
            if (atual.getElemento().equals(elemento)) {
                return true;//Verifica se é igual
            }
            atual = atual.getProximo();
        }

        return false;
    }

    public int tamanho() {
        return this.totalDeElementos;//Pega o numero de elementos
    }

}
