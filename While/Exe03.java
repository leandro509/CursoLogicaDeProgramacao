import java.util.Random;

import javax.swing.JOptionPane;

public class Exe03 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);

        int numeroDigitado;
        int contador = 1;

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de  0 a 100: ",
                "Leia com atencao", JOptionPane.QUESTION_MESSAGE));

        if (numeroDigitado > 100 || numeroDigitado < 0) {

            JOptionPane.showMessageDialog(null, "O numero digitado eh invalido!!");

        } else {

            while (numeroDigitado != numeroAleatorio && numeroDigitado <= 100 && numeroDigitado >= 0) {

                contador++;

                if (numeroDigitado < numeroAleatorio) {

                    System.out.println("O numero sorteado eh maior!");
                   
                   

                } else {

                    System.out.println("O numero sorteado eh menor!");
                    
                    

                }

                numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100: ",
                            "Leia com atencao", JOptionPane.QUESTION_MESSAGE));

            }

            
            JOptionPane.showMessageDialog(null, "Voce acertou em " + contador + " tentativas !");
        }
    }
}
