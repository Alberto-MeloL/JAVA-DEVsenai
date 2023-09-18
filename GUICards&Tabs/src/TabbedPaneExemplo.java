import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabbedPaneExemplo {
    public TabbedPaneExemplo() {
        super();
        JTabbedPane janelaAbas = new JTabbedPane();
        JPanel aba1 = new JPanel();
        aba1.add(new JButton("Botao 1"));
        aba1.add(new JButton("Botao 2"));
        aba1.add(new JButton("Botao 3"));
        JPanel aba2 = new JPanel();
        aba2.add(new JTextField("", 20));
janelaAbas.setVisible(true);
    }
}
