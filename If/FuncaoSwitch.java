import javax.swing.JOptionPane;
public class FuncaoSwitch {
    public static void main(String[] args) {
        
        String fruta;
        //recebendo o nome da fruta e armazenando na variavel
        fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta");


        //switch - Avalia o valor de uma variavel e dependendo 
        //do resultado ele entra em um caso e executa a ação
        //switch - Selecione Caso
        switch(fruta) {
            //case - caso
            case "Banana":
            
                System.out.println("Você digitou Banana!");

                //break - encerrar o programa
                break;
            case "Laranja":
            
    System.out.println("Você digitou Laranja!");
    //break - encerrar o programa
    break;

    case "Uva":
            
    System.out.println("Você digitou Uva!");
    //break - encerrar o programa
    break;

    default:
            System.out.println("Você não digitou uma fruta válida!");

            break;
        }
    }
    
}
