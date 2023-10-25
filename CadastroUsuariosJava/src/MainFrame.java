import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class MainFrame extends JFrame {

    //declarando cores

    private Color corAzulClara = new Color(179, 231, 255);
    private JTextField inputName;
    private JTextField inputAge;
    private JTextField inputCep;
    private JTextField inputCpf;
    private JComboBox<String> comBoxSex;
    private JPanel panelButton;
    private JPanel mainPanel;
    private JButton consultar;
    private JButton cadastrar;

    public MainFrame() {
        super("Cadastro Usuário");
        this.setBounds(500, 500, 500, 500);
        this.setLayout(new BorderLayout());
        this.add(panelButton, BorderLayout.SOUTH);
        this.add(mainPanel, BorderLayout.CENTER);

        cadastrar = new JButton("Cadastrar");
        cadastrar.setBackground(corAzulClara);
        consultar = new JButton("Consultar");
        consultar.setBackground(corAzulClara);
    }

    public void run(){
        this.setVisible(true);
    }
}
