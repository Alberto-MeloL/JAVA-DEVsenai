package ExemploTryCatchFinally;

import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        //teste try catch finally
        //declarar antes do try
        String fraseInicial = null;
        String fraseFinal = null;
        fraseInicial = JOptionPane.showInputDialog("Digite uma Frase");
            if(fraseInicial.equals("")){
                fraseInicial = null;
            }
        try{
            fraseFinal = fraseInicial.toUpperCase();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            fraseFinal = "Não foi digitado uma frase";
        }finally{
            JOptionPane.showMessageDialog(null, fraseFinal);
        }
    }
    }

