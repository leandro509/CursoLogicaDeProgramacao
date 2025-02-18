import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class ArrayExe02 {
    public static void main(String[] args){

        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        
        int qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas: "));
        double  somaNotas = 0;

        double[] notas = new double [qtdNotas];

        for(int i = 0; i < qtdNotas; i++) {

            
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite  a nota : " + (i + 1)));
            somaNotas += notas[i]; 
        }
        
        double calculoMedia =  somaNotas / qtdNotas;  
        System.out.println("Soma : " + somaNotas);
        System.out.println("Total itens : " + notas.length);
        System.out.println("A media das  notas eh : " + df_2.format(calculoMedia));

       
    }
}
