import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio1{
    public Exercicio1() {
        super();
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(500, 500, 600, 600);
        frame.setDefaultCloseOperation(2);
        frame.setTitle("Exercício 1");

        CardLayout card = new CardLayout();
         //Criando os painéis
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();

        //Criando os botoes que mudaram ao paineis
        JButton irParaO1 = new JButton();
        JButton irParaO2 = new JButton();
        JButton irParaO3 = new JButton();

        //Adicionado ao frame
        frame.add(painel1);
       

    }

}
