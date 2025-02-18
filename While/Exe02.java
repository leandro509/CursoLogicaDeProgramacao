import javax.swing.JOptionPane;

public class Exe02 {
    public static void main(String[] args) {
        System.out.println("Digite um numero:");
       
        int numeroAtual, maior, menor;

        

        numeroAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero ", "Leia com atencao!", JOptionPane.QUESTION_MESSAGE));

        menor = numeroAtual;
        maior = numeroAtual;

        while(numeroAtual >= 0) {

            System.out.println(numeroAtual);

            numeroAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero ", "Leia com atencao!", JOptionPane.QUESTION_MESSAGE));

            if(numeroAtual > maior) {

                maior = numeroAtual;

            }else  if((numeroAtual < menor) && (numeroAtual >= 0)){

                menor = numeroAtual;

            }

        }

        System.out.println("Menor numero: " + menor);
        System.out.println("Maior numero: " + maior);

       

    } 
}