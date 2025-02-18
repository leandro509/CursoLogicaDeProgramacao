import javax.swing.JOptionPane;

public class DoWhileExe01 {
    public static void main(String [] args) {

        boolean acertou = false;
        int numeroDigitado;

        do{

             numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 5  para encerrar: "));

             System.out.println("Numero Incorreto, Tente novamente!");

             if(numeroDigitado > 0 && numeroDigitado < 6) {

                acertou = true;

             }


        }while(acertou == false);

        System.out.println("Muito bem algoritmo encerrado!");

    }
}
