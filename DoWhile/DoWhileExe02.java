import javax.swing.JOptionPane;

public class DoWhileExe02 {
    public static void main(String[] args) {
        
        int numeroDigitado;

        do{

            
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog( "Digite um numero ou 0 para encerrar!"));

        if(numeroDigitado > 0) {

            System.out.println(numeroDigitado + " eh positivo!");

        }else if(numeroDigitado < 0){

            System.out.println(numeroDigitado + " eh negativo!");

        }



        }while(numeroDigitado != 0);

        System.out.println("O programa foi encerrado!");

    }
}
