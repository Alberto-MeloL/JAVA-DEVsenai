import java.util.logging.Handler;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
//PARA FUNCIONAR O CARLAYOUT ELE PRECISA DE UM EBENTO 
public class CardsLayout extends JFrame {
    JPanel cards;
    private String buttonPanel = "Card com JButtons";
    private String textPanel = "Card com JTextField";

    // construtor
    public CardsLayout() {
        super("Exemplo CardsLayout");
        JPanel jpanel1 = new JPanel();
        String comboBoxItems[] = { buttonPanel, textPanel };
        JComboBox cb = new JComboBox(comboBoxItems);
        jpanel1.add(cb);
        // Criando os Cards
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 1"));
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
        // Adicionando Cards a um CardsLayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, buttonPanel);
        cards.add(card2, textPanel);
        this.add(jpanel1, BorderLayout.PAGE_START);
        this.add(cards, BorderLayout.CENTER);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        Handler handler = new Handler();
        cb.addItemListener(handler);

    }
    public class Handler implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, (String) event.getItem());
        }
        }
}
