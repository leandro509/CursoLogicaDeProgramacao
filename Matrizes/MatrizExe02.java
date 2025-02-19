import javax.swing.JOptionPane;

public class MatrizExe02 {
    public static void main(String[] args) {

        double[][] notas = new double[3][3];

        double numeroDigitado = 0;

        double[] media = new double[3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

               

                    numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digita as notas do " + (i + 1) + " aluno: "));
                    notas[i][j] = numeroDigitado;
                    

                

                
            }

           

        }

        media[0] = 3 / (notas[0][0] + notas[0][1] + notas[0][2]);
        media[1] = 3 / (notas[1][0] + notas[1][1] + notas[1][2]);
        media[2] = 3 / (notas[2][0] + notas[2][1] + notas[2][2]);

        for(int i = 0; i < 3; i++) {
            System.out.print("notas do aluno " + (i + 1) + " : ");
            for(int j = 0; j < 3; j++) {

                System.out.print(notas[i][j] + " ");

            }

            System.out.println(" ");

        }   

    }
}
