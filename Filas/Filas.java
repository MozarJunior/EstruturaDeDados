package filas;

// import java.util.LinkedList;
// import java.util.Queue;

public class Filas {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enqueue("Olá");
        fila.enqueue("Meu");
        fila.enqueue("Amigo");

        fila.dequeue();

        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        System.out.println(fila.toString());
        
        //Atividade sobre Queue

        // //Instancia de Queue
        // Queue fila = new LinkedList();
        
        // //Adicionando elementos na fila
        // fila.add("Alfredo");
        // fila.add("Ana");
        // fila.add("Bernardo");
        // fila.add("Janaina");
        // fila.add("Helena");
        
        // //Retorna um elemento da fila
        // System.out.println(fila.peek());
        
        // //Remove o primeiro da fila
        // fila.poll();
        
        // //Retorna um elemento da fila
        // System.out.println(fila.peek());
        
        // //Verifica se a fila está vazia
        // if(fila.isEmpty() == true){
        //     System.out.println("Fila está vazia");
        // }else{
        //     System.out.println("Fila não está vazia");
        // }
        
        // //Retorna o tamanho da fila
        // System.out.println("Tamanho da fila : " + fila.size());
        
        // //Retorna a profundidade de um elemento
        // //Não consegui achar um metodo dentro de Queue
    }
    
}
