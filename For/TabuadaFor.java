import java.util.Scanner;
public class TabuadaFor {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int num1 = scan.nextInt();
            for(int num2 = 1; num2 <= 10; num2++) {
                System.out.println("tabuada: " + num1 + " x " + num2 + " = " + (num1 * num2));
            }
            scan.close();
    }
}
