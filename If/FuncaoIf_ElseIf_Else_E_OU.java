import javax.swing.JOptionPane;

public class FuncaoIf_ElseIf_Else_E_OU {
    public static void main(String[]args) {
        /*
         * || - Ou
         * && - E
         */
        /* 
        String fruta;
        //Ctrl + Barra de Espaço
        fruta = JOptionPane.showInputDialog("Digite o nome da fruta ");

        //if - se
        if(fruta.equals("Maça") || fruta.equals("Banana")) {
            JOptionPane.showMessageDialog(null, " fruta e " + fruta);
        }else{
            JOptionPane.showMessageDialog(null, "A fruta Invalida ");
        }
        */

        //&& - E

        String fruta_1, fruta_2;
        //Recebendo o nome das frutas e armazenando nas variaveis
        fruta_1 = JOptionPane.showInputDialog("Digite o nome da Primeira Fruta ");
        fruta_2 = JOptionPane.showInputDialog("Digite o nome da Segunda Fruta ");
        
        //if - se
        if(fruta_1.equals("Maça") && fruta_2.equals("Banana")) {

            System.out.println("A fruta 1 é Maça e a fruta 2 é Banana");
        
        }else{
            System.out.println("Você não Digitou as duas frutas corretamente. ");
        }
    }

}
