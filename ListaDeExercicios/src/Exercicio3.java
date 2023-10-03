package ListaDeExercicios.src;//ing iten<-prf

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;//importando toda a rede

public class Exercicio3 extends JFrame { // sub-classe do JFrame (importando todos os metodos do JFrame/janela
                                         // principal)
    // evitar usar o frame para manipular objetos
    // construtor
    public Exercicio3() {
        super("Exercício 3 - CardLayout");

        // adicionar um painel (main Panel -> CardLayout)
        JPanel mainPanel = new JPanel();
        CardLayout cl = new CardLayout();

        mainPanel.setLayout(cl);// set do Layout
        this.add(mainPanel);
        // adicionar os cards
        // Card1 - Home
        JPanel cad1 = new JPanel();
        cad1.add(new JLabel("Boas Vindas!"));
        JButton botao1 = new JButton("Login");
        JButton botao2 = new JButton("Cadastro");
        cad1.add(botao1);
        cad1.add(botao2);

        mainPanel.add(cad1, "Home");// add do card1 ao painel principal
        // Card2 - Login
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Página de Login"));
        JButton botao3 = new JButton("Nome");
        JButton botao4 = new JButton("Email");
        card2.add(botao3);
        card2.add(botao4);

        mainPanel.add(card2, "Login");

        //Card3 - Login
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Boas Vindas!"));
        JButton botao5 = new JButton("Home");
        JButton botao6 = new JButton("Cadastro");
        card3.add(botao5);
        card3.add(botao6);
        
        mainPanel.add(card3, "Home");

        this.setVisible(true);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 200, 220, 220);

        //funcionalidades dos botoes
        botao1.addActionListener(e->{
            cl.show(mainPanel, botao1.getText());
        });
         botao2.addActionListener(e->{
            cl.show(mainPanel, botao2.getText());
        });
         botao3.addActionListener(e->{
            cl.show(mainPanel, botao3.getText());
        });
         botao4.addActionListener(e->{
            cl.show(mainPanel, botao4.getText());
        });
         botao5.addActionListener(e->{
            cl.show(mainPanel, botao5.getText());
        });
         botao6.addActionListener(e->{
            cl.show(mainPanel, botao1.getText());
        });
    }
}
