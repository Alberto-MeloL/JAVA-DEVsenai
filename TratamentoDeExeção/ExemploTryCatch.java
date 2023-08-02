package TratamentoDeExeção;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean corrija = true;
        int n1, n2;
        String operacaoString[] = { "Soma", "Subtração", "Multiplicação", "Divisão", "Sair" };
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

    public void TratamentoDeExeção02() {

        int n1, n2;
        boolean corrija = true;
        String operacoes[] = { "Soma", "Subtração", "Multiplicação", "Divisão", "Sair" };
        while (corrija) {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº Inteiro"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro nº Inteiro"));
                int i = JOptionPane.showOptionDialog(null, "Escolha a Operação Desejada", "Operação",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.CANCEL_OPTION, null, operacoes, operacoes[0]);
                if (i == 0) {// soma
                    JOptionPane.showMessageDialog(null, "O resultado é \n"
                            + (n1 + n2));
                } else if (i == 1) {// sub
                    JOptionPane.showMessageDialog(null, "O resultado é \n"
                            + (n1 - n2));
                } else if (i == 2) {// soma
                    JOptionPane.showMessageDialog(null, "O resultado é \n"
                            + (n1 * n2));
                } else if (i == 3) {// divi
                    JOptionPane.showMessageDialog(null, "O resultado é \n"
                            + (n1 / n2));
                } else {
                    corrija = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERRO - Valor "
                        + "digitado não é um número inteiro!");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "ERRO - Aritmético "
                        + "Não Dividirás por Zero!!!");
            } catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, "ERRO - Valor");
            }
        }
    }
}
