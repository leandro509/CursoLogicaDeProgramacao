import java.util.Scanner;
public class ExeCalculadora {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - adicao");
        System.out.println("2 - subtracao");
        System.out.println("3 - multiplicacao");
        System.out.println("4 - divisao");
        System.out.println("Digite um numero: ");
        double soma;
        int num1;
        int num2;
        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            soma = (num1) + (num2);
            System.out.println("Resultado = " + soma);
            break;
            case 2:
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            soma = (num1) - (num2);
            System.out.println("Resultado = " + soma);
            break;
            case 3:
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            soma = num1 * num2;
            System.out.println("Resultado = " + soma);
            break;
            case 4:
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if((num1 == 0) || (num2 == 0)) {
                System.out.println("IMPOSSIVEL DIVIDIR POR ZERO!");
            }else{
                soma = num1 / num2;
                System.out.println("Resultado = " + soma);
            }
            break;
            default:
            System.out.println("Selecao Invalida!");
            break;
        }
        scan.close();
    }    
}
