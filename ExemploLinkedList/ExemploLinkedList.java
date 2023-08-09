package ExemploLinkedList;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList<String> pessoas = new LinkedList<>();
//E o mesmo que o ArrayList so que com algumas funções a mais
    public void teste() {
        pessoas.add("Simas");
        pessoas.add("Carlos");
        pessoas.add("David");

        pessoas.addFirst("Cecelia");

        pessoas.removeLast();

        System.out.println(pessoas);
    }
}
