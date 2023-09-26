package ListaDeExercicios.src;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio1 extends JFrame {
    public Exercicio1() {
        this.setTitle("Exercício 1");
        // criei um painel principal
        JPanel mainP = new JPanel();
        // setLayout - cardLyout
        CardLayout cl = new CardLayout();
        mainP.setLayout(cl);
        // criar Cards para adicionar ao mainP
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        JButton bNext1 = new JButton("Next");
        JButton bNext2 = new JButton("Next");
        JButton bNext3 = new JButton("Next");
        card1.add(bNext1);
        card2.add(bNext2);
        card3.add(bNext3);
        // add cards ao mainP
        mainP.add(card1);
        mainP.add(card2);
        mainP.add(card3);
        // set do Frame
        this.add(mainP);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        // criar acões para os botões
        bNext1.addActionListener(e -> {
            cl.next(mainP);
        });
        bNext2.addActionListener(e -> {
            cl.next(mainP);
        });
        bNext3.addActionListener(e -> {
            cl.next(mainP);
        });
    }

}
