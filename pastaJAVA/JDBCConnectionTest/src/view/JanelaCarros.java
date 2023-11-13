package view;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import LojaCarros.src.Carros;

public class JanelaCarros extends JPanel{
    
        //Atributos(componentes)
        private JButton cadastrar, apagar, editar;
        private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField, carValorField;

        private List<Carros> carros;
        private JTable table;
        private DefaultTableModel tableModel;
        private int linhaSelecionada = -1;

        //Construtor(GUI-JPanel)
        public JanelaCarros() {
            super();

            //Entrada de dados
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(new JLabel("Cadastro Carros"));
        }
        
}
