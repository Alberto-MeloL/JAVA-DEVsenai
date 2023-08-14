
import java.util.*;

import javax.swing.JOptionPane;

public class App extends Carros {
    public static void main(String[] args) throws Exception {
        // class carros - atibutos e os metodos
        // manipular essa class no app

        // 1.cadastrar novo carro
        // 2.listar todos os carros cadastrados
        // 3.consultar um carro cadastrado
        // 4.apagar um carro cadastrado
        List<Carros> listaCarros = new ArrayList<>();
        boolean aberto = true;
        while (aberto) {
int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar \n 2-Listar \n 3-Consultar \n 4-Excluir"));
if(acao == 1){
    //1.Cadastrar novo carro
    Carros c = new Carros();
    c.setMarca(JOptionPane.showInputDialog("Informe a marca do carro"));
    c.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro"));
    c.setAno(JOptionPane.showInputDialog("Informe o ano do carro"));
    c.setCor(JOptionPane.showInputDialog("Informe a cor do carro"));
    listaCarros.add(c);
} else if(acao == 2){
    String listar = "";
    for (Carros carros : listaCarros) {
        listar+=carros.getMarca()+" "+carros.getModelo()+" "+carros.getAno()+" "+carros.getCor();
    }
    JOptionPane.showMessageDialog(null, listar);
}  
        }

    }
}
