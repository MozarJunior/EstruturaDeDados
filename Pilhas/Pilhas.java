package pilhas;

// import java.util.Stack;

public class Pilhas {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Olá");
        pilha.push("Meu");
        pilha.push("Amigo");

        System.out.println(pilha.size());
       System.out.println(pilha.top());
       System.out.println(pilha.pop());
       System.out.println(pilha.top());

        
        //Atividade sobre stack
        
        // //Instancia de Stack
        // Stack pilha = new Stack();
        
        // //Adicionando os valores na pilha
        // pilha.push("Alfredo");
        // pilha.push("Ana");
        // pilha.push("Bernardo");
        // pilha.push("Janaina");
        // pilha.push("Helena");
        
        // //Visualizando um nome na pilha
        // System.out.println(pilha.peek());
        
        // //Removendo o primeiro item da pilha
        // pilha.pop();
        
        // //Visualizando um elemento na pilha
        // System.out.println(pilha.peek());
        
        // //Verificando se a pilha está vazia
        // if(pilha.isEmpty() == true){
        //     System.out.println("A pilha está vazia");
        // }else{
        //     System.out.println("A pilha não está vazia");
        // }
        
        // //Verificando o tamanho da pilha
        // System.out.println("Numero de elementos na pilha : " + pilha.size());
    
        // //Verificando a profundidade do item na pilha
        // System.out.println("Profundidade do nome Ana : " + pilha.indexOf("Ana"));
    }
    
}
