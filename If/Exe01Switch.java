import java.util.Scanner;
public class Exe01Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        switch(numero) {
            case 1:
            System.out.println("Digite 2 numeros:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Resultado " + ((num1) + (num2)));
            break;
            case 2:
            System.out.println("Digite 2 numeros:");
            int num3 = scan.nextInt();
            int num4 = scan.nextInt();
            System.out.println("Resultado " + ((num3) - (num4)));
            break;
            case 3:
            System.out.println("Digite 2 numeros:");
            int num5 = scan.nextInt();
            int num6 = scan.nextInt();
            System.out.println("Resultado " + ((num5) * (num6)));
            break;
            case 4:
            System.out.println("Digite 2 numeros:");
            int num7 = scan.nextInt();
            int num8 = scan.nextInt();
            if((num7 == 0 ) || (num8 == 0)){

            }
            System.out.println("Resultado " + ((num7) - (num8)));
            break;

        }
        scan.close();

    }
    
}
