package ListaDeExercicios.src;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio4Quiz extends JFrame {
    public Exercicio4Quiz() {
        super("Quiz");

        JPanel mainPanel = new JPanel();
        CardLayout cl = new CardLayout();
        CardLayout cl2 = new CardLayout();
        CardLayout cl3 = new CardLayout();

        mainPanel.setLayout(cl);
        this.add(mainPanel);
        JPanel certo = new JPanel();
        certo.setLayout(cl2);
        JPanel errado = new JPanel();
        errado.setLayout(cl3);
        JButton correto = new JButton("Correto");
        JButton negativo = new JButton("Negativo");

        certo.add(correto);
        errado.add(negativo);

        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        JPanel card3 = new JPanel();

        card1.add(new JLabel("Fase 1- Você é aluno?"));
        JButton botaoSim = new JButton("Sim");
        JButton botaoNao = new JButton("Não");
        card1.add(botaoSim);
        card1.add(botaoNao);

        mainPanel.add(card1);

        card2.add(new JLabel("Fase 2- Com qual é o correto Hoje ou Oje"));
        JButton botaoSim2 = new JButton("Hoje");
        JButton botaoNao2 = new JButton("Oje");
        card2.add(botaoSim2);
        card2.add(botaoNao2);

        mainPanel.add(card2);

        card3.add(new JLabel("Fase 3 - Você faz SENAI?"));
        JButton botaoSim3 = new JButton("Sim");
        JButton botaoNao3 = new JButton("Não");
        card1.add(botaoSim3);
        card1.add(botaoNao3);

        mainPanel.add(card3);

        this.setVisible(true);
        this.setBounds(200, 200, 200, 200);
        this.setDefaultCloseOperation(2);

        botaoSim.addActionListener(e -> {
            cl2.show(certo, correto.getText());
        });
        botaoNao.addActionListener(e -> {
            cl3.show(errado, negativo.getText());
        });
        botaoSim2.addActionListener(e -> {
            cl2.show(certo, correto.getText());
        });
        botaoNao2.addActionListener(e -> {
            cl3.show(errado, negativo.getText());
        });
        botaoNao3.addActionListener(e -> {
            cl3.show(errado, negativo.getText());
        });
        botaoSim3.addActionListener(e -> {
            cl2.show(certo, correto.getText());
        });
    }
}
