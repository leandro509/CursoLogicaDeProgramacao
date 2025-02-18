import java.util.Scanner;
public class Exe02If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int dif;
        dif = (num1 - num2);

        if(num1 > 0){

            System.out.println("A diferença dos números é " + dif);

        }else{

            System.out.println("Somente um número foi inserido.");

        }
        scan.close();
    }
    
}
