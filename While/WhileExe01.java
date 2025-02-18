import java.util.Scanner;
public class WhileExe01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int qtdPar, qtdImpar;
    qtdPar = 0;
    qtdImpar = 0;

    System.out.println("Digite um numero: ");
    int numeroDigitado = scan.nextInt();
    System.out.println(numeroDigitado);
     
    while (numeroDigitado >= 0) {
       

        if(numeroDigitado >= 0) {
            if(numeroDigitado % 2 == 0) {
                qtdPar++;
                 
            }else{
                qtdImpar++;

            }
            
            
            
        }
        numeroDigitado = scan.nextInt();
        System.out.println(numeroDigitado);
    }

    System.out.println("Quantidade Par: " + qtdPar);
    System.out.println("Quantidade Impar: " + qtdImpar);
    scan.close();
    }
    
}
