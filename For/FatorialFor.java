import java.util.Scanner;
public class FatorialFor {
    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        double fatorial = 1;
        for(int num2 = num1; num2 >= 1; num2--) {
            System.out.println(fatorial + " x " + num2);
            fatorial = fatorial * num2;
        }
        System.out.println("Resultado : " + fatorial);
        scan.close();
    }
    
}
