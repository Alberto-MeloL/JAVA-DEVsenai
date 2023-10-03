package ListaDeExercicios.src;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.event.ActionListener;

public class Exercicio5 extends JFrame {
    public Exercicio5() {
        super("Exercício 5");

        // adicionando um painel
        JPanel painelPrinciapl = new JPanel();
        JButton verNomeCompleto = new JButton("Ver");
        painelPrinciapl.add(verNomeCompleto);
        verNomeCompleto.setBounds(100, 100, 45, 45);
        // adicionando um layout
        CardLayout layout = new CardLayout(2, 2);
        painelPrinciapl.setLayout(layout);

        JLabel nome = new JLabel("Nome:");
        JTextField nomeIserir = new JTextField(20);

        // add ao painelPrincipal
        painelPrinciapl.add(nome);
        painelPrinciapl.add(nomeIserir);
        String nA = nomeIserir.getText();

        JLabel sobreNome = new JLabel("Sobrenome:");
        JTextField sobreNomeIserir = new JTextField(20);

        painelPrinciapl.add(sobreNome);
        painelPrinciapl.add(sobreNomeIserir);
        String nB = sobreNomeIserir.getText();
        String concatena = nA + nB;

        verNomeCompleto.addActionListener(new ActionListener() {
            
        });
        this.add(painelPrinciapl);
        this.setVisible(true);
        this.setDefaultCloseOperation(2);
        this.setBounds(500, 500, 300, 300);
        this.setResizable(true);

    }
}
