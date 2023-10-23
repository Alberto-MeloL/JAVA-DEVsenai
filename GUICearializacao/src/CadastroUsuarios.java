import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultButtonModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CadastroUsuarios extends JFrame{
    
    private JTextField inputNome;
    private JTextField inputIdade;
    private JTable table;
    private DefaultTableModel tableModel;
    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;


    public CadastroUsuarios() {
        setTitle("Cadastro de Usuários");
        setSize(600, 300);
        setDefaultCloseOperation(2);
        setLocationRelativeTo(null);

        tableModel = new DefaultButtonModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("Idade");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
    }
}
