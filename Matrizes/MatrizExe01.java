import javax.swing.JOptionPane;
import java.util.Arrays;

public class MatrizExe01 {
    public static void main(String[] args) {

        

        int linha = 3;
        int coluna = 3;

        int[][] numeros = new int[linha][coluna];

        int numeroDigitado = 0;

        int[] diagonal = new int[4];
        int[] somaDiagonal = new int[2];

        

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {

                numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

                numeros[i][j] = numeroDigitado;

                if(numeros[i][j] == numeros[0][0]){

                    diagonal[0] = numeroDigitado;


                }

                if (numeros[i][j] == numeros[0][2]) {
                    
                    diagonal[1] = numeroDigitado;

                }

                if (numeros[i][j] == numeros[2][0]) {
                    
                    diagonal[2] = numeroDigitado;

                }

                if (numeros[i][j] == numeros[2][2]) {
                    
                    diagonal[3] = numeroDigitado;

                }

            }

        }

        somaDiagonal[0] = (diagonal[0] + diagonal[1]);
        somaDiagonal[1] = (diagonal[2] + diagonal[2]);


        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {

                
                System.out.print(numeros[i][j] + " ");

               
            

            }

            System.out.println("");

        }

        System.out.println("");
        System.out.print("numeros da diagonal : " + Arrays.toString(diagonal));
        System.out.println("");
        System.out.println("Soma das diagonais : " + Arrays.toString(somaDiagonal));

    }
}
