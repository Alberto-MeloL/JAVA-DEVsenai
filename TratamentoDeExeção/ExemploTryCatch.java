package TratamentoDeExeção;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean corrija = true;
        int n1, n2;
        String operacaoString[] = { "Soma", "Subtração", "Multiplicação", "Divisão", "Sair"};
        while (corrija) {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:\n"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:\n"));
                JOptionPane.showMessageDialog(null, "O resultado em soma é " + (n1 + n2));
                JOptionPane.showMessageDialog(null, "O resultado em divisão é " + (n1 / n2));
                JOptionPane.showMessageDialog(null, "O resultado em multiplicação é " + (n1 * n2));
                JOptionPane.showMessageDialog(null, "O resultado em subtração é " + (n1 - n2));
                corrija = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "ERRO - Valor digitado nao e um numero inteiro!\nDigite novamente.");
            }
        }
    }
}