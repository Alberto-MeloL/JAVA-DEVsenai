package ListaDeExercicios.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//componente->chamar o ouvinte->declarar o evente em si
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addActionListener extends JFrame {

    //atributos
    private JTextField caixaNome, caixaSobrenome;
    private JLabel nomeSobrenome;
    //construtor
    public addActionListener() {
        super("Exemplo 1 - Evento");
        JPanel mainP = new JPanel(new GridLayout(3,2));
        this.add(mainP);//add mainP ao frame
        //add elementos/componentes ao Painel
        mainP.add(new JLabel("Nome: "));
        caixaNome = new JTextField();
        mainP.add(caixaNome);
        mainP.add(new JLabel("Sobrenome: "));
        caixaSobrenome = new JTextField();
        mainP.add(caixaSobrenome);
        JButton botao = new JButton("Enviar");
        mainP.add(botao);
        nomeSobrenome = new JLabel();
        mainP.add(nomeSobrenome);
        //Set do Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        this.setVisible(true);
        //Tratamento de Evento encurtado
        // botao.addActionListener(e->{
        //     nomeSobrenome.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //     caixaNome.setText("");
        //     caixaSobrenome.setText("");
        // }); 
        //tratamento de Evento Normal
        // botao.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //     nomeSobrenome.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //     caixaNome.setText("");
        //     caixaSobrenome.setText("");
        //     }});
            //chamar o handler(construtor)
        Handler evt = new Handler();
        botao.addActionListener(evt);
    }
    //classe handler vai ser cirada fora do construtor
    /**
     * Handler
     */
    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nomeSobrenome.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
        }
    
        
    }
        //Tratamento por Handler(manipulador)
        // criar a classe handler
}