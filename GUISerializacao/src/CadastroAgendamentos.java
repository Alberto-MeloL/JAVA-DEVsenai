import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CadastroAgendamentos extends JPanel {

    private JTextField inputData;
    private JTextField inputHora;
    private DefaultTableModel tableAgendaModel;
    private JTable tableAgendamentos;
    private List<Agendamentos> listAgendamentos = new ArrayList<>();
    private int linhaSelecionada = -1;

    // contrutor

    public CadastroAgendamentos() {

        setSize(600, 500);
        tableAgendaModel = new DefaultTableModel();
        tableAgendaModel.addColumn("Data");
    }
}
