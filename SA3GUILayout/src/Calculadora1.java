import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora1 extends JPanel {
    public Calculadora1() {
        super();
        GridLayout layout = new GridLayout(3, 3);
        this.add(new JLabel("Calculadora3"));
        this.setLayout(layout);

        JTextField display;
        int leitura;
        int memoria;
        char operacao;

        JButton boatoMais = new JButton();
        JButton botaoIgual = new JButton();
        JButton n1 = new JButton();
        JButton n2 = new JButton();

        n1.setText("1");
        boatoMais.setText("+");
        botaoIgual.setText("=");
        n2.setText("2");
        
        display = new JTextField();
        display.setBounds(0, 0, 300, 100);
        this.add(display);

        this.add(boatoMais);
        this.add(botaoIgual);
        this.add(n1);
        this.add(n2);
        this.add(display);

        leitura = 0;
        memoria = 0;


    }
}
