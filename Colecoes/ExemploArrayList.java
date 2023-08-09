package Colecoes;

import java.util.*;//chamando tudo de uma vez

import javax.swing.JOptionPane;

public class ExemploArrayList {
    public void cars() {
        ArrayList<String> carros = new ArrayList<>();
        //Scanner head = new Scanner(System.in);
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Subaru");
        // JOptionPane.showMessageDialog(null, carros, null, 0);
        // System.out.println(carros);
        // carros.clear();
        // JOptionPane.showMessageDialog(null, carros, null, 0);
        // for (String i : carros) {System.out.println("algo")} foreach
        int i;

        System.out.printf("Traversing the ArrayList (using the index)\n");
        int n = carros.size();

        for (i = 0; i < n; i++) {
            System.out.printf("Position %d- %s\n", i, carros.get(i));
        }

        System.out.println("Enter a car to delete");
      //  i = head.nextInt();

        try {
            // [ D ] remove o i-ésimo contato da agenda
            carros.remove(i);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }
    }

    // linkdList
    public void exercicio1() {
        ArrayList<Integer> num = new ArrayList<>();// como usar o array la em cima?
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
            
            System.out.println(num);
            Collections.sort(num);
        }

    }
}
// for (int i = 0; i < num.length; i++) {
// }
// num.add(Integer.parseInt(JOptionPane.showInputDialog("")));
// for ( int i = 0; i < 5; i++){
// num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numnero")))
// }
// system.out.println(num);
// Collections.sort(num);
// System.out.println(num);